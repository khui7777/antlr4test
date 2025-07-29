package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.example.antlr4.CustomLexer;
import org.example.antlr4.CustomParser;
import org.example.antlr4.JavaLexer;
import org.example.antlr4.JavaParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CustomTest {
    public static void main(String[] args) throws Exception {
        /*String input = "package org.example;";

        // Create a CharStream from the input string
        CharStream stream = CharStreams.fromString(input);

        // Create the lexer
        JavaLexer lexer = new JavaLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.expression();  // start rule

        // Print the parse tree in LISP-style notation
        System.out.println(tree.toStringTree(parser));*/

        Files.walk(Paths.get("src"))
                .filter(path -> path.toString().endsWith(".java"))
                .forEach(path -> {
                    try {
                        parseJavaFile(path.toFile());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

        /*CompilationUnit cu = StaticJavaParser.parse(new File("Main.java"));
        cu.findAll(ClassOrInterfaceDeclaration.class)
                .forEach(cls -> System.out.println("Class: " + cls.getName()));*/
    }

    static void parseJavaFile(File file) throws IOException {
        CharStream input = CharStreams.fromFileName(file.getPath());
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit(); // Start rule
        //System.out.println(tree.toStringTree(parser));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("testANTLR.json")) {
            gson.toJson(toMap(tree), writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Object> toMap(ParseTree tree) {
        Map<String, Object> map = new LinkedHashMap<>();
        traverse(tree, map);
        return map;
    }

    public static void traverse(ParseTree tree, Map<String, Object> map) {
        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            map.put("type", token.getType());
            map.put("text", token.getText());
        } else {
            List<Map<String, Object>> children = new ArrayList<>();
            String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
            map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);
            for (int i = 0; i < tree.getChildCount(); i++) {
                Map<String, Object> nested = new LinkedHashMap<>();
                children.add(nested);
                traverse(tree.getChild(i), nested);
            }
        }
    }
}