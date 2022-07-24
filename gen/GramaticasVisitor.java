// Generated from C:/Users/EduardoA/OneDrive/Documentos/Eduardo/[OLC2]P1/Proyecto 1/Interprete/src\Gramaticas.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(GramaticasParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#list_instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_instructions(GramaticasParser.List_instructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(GramaticasParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GramaticasParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#subroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine(GramaticasParser.SubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GramaticasParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(GramaticasParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(GramaticasParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GramaticasParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(GramaticasParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#sentes_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentes_if(GramaticasParser.Sentes_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#sentes_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentes_do(GramaticasParser.Sentes_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#sentes_do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentes_do_while(GramaticasParser.Sentes_do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#control_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_cicle(GramaticasParser.Control_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#cycle_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_tag(GramaticasParser.Cycle_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#decla_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecla_array(GramaticasParser.Decla_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#asignacion_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_array(GramaticasParser.Asignacion_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada(GramaticasParser.LlamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#instruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruct(GramaticasParser.InstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GramaticasParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticasParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GramaticasParser.ExprContext ctx);
}