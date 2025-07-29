package org.example.antlr4;// Generated from C:/Users/keahutan/OneDrive - Deloitte (O365D)/Desktop/Software/test1/src/main/antlr4/Custom.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CustomParser}.
 */
public interface CustomListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CustomParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CustomParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CustomParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(CustomParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(CustomParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(CustomParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(CustomParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(CustomParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(CustomParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(CustomParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(CustomParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(CustomParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(CustomParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(CustomParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(CustomParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(CustomParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(CustomParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(CustomParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(CustomParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(CustomParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(CustomParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(CustomParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(CustomParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(CustomParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(CustomParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(CustomParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(CustomParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(CustomParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(CustomParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(CustomParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(CustomParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(CustomParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(CustomParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(CustomParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(CustomParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(CustomParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(CustomParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(CustomParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(CustomParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(CustomParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link CustomParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(CustomParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(CustomParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(CustomParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(CustomParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(CustomParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CustomParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CustomParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CustomParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CustomParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(CustomParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(CustomParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(CustomParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(CustomParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(CustomParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(CustomParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(CustomParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(CustomParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(CustomParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(CustomParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(CustomParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(CustomParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(CustomParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(CustomParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(CustomParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(CustomParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(CustomParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(CustomParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CustomParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CustomParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(CustomParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(CustomParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(CustomParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(CustomParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(CustomParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(CustomParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CustomParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CustomParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(CustomParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(CustomParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(CustomParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(CustomParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(CustomParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(CustomParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(CustomParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(CustomParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CustomParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CustomParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(CustomParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(CustomParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(CustomParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(CustomParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CustomParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CustomParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(CustomParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(CustomParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CustomParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CustomParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CustomParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CustomParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CustomParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CustomParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(CustomParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(CustomParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CustomParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CustomParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CustomParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CustomParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(CustomParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(CustomParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(CustomParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(CustomParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(CustomParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(CustomParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CustomParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CustomParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(CustomParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(CustomParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CustomParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CustomParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CustomParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CustomParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CustomParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CustomParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CustomParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CustomParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(CustomParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(CustomParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(CustomParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(CustomParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(CustomParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(CustomParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(CustomParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(CustomParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(CustomParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(CustomParser.ModifierContext ctx);
}