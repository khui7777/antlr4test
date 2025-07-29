package org.example.antlr4;// Generated from C:/Users/keahutan/OneDrive - Deloitte (O365D)/Desktop/Software/test1/src/main/antlr4/Custom.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CustomParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CustomVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CustomParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CustomParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(CustomParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(CustomParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(CustomParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(CustomParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(CustomParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(CustomParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(CustomParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(CustomParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(CustomParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(CustomParser.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(CustomParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(CustomParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(CustomParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(CustomParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(CustomParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(CustomParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(CustomParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(CustomParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpr(CustomParser.MethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(CustomParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(CustomParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CustomParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(CustomParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(CustomParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(CustomParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(CustomParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(CustomParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(CustomParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(CustomParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(CustomParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(CustomParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(CustomParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(CustomParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(CustomParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(CustomParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(CustomParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CustomParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CustomParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(CustomParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(CustomParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(CustomParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(CustomParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(CustomParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(CustomParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(CustomParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(CustomParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CustomParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CustomParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CustomParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(CustomParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CustomParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CustomParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(CustomParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(CustomParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(CustomParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CustomParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(CustomParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CustomParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CustomParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CustomParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CustomParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(CustomParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(CustomParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(CustomParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(CustomParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(CustomParser.ModifierContext ctx);
}