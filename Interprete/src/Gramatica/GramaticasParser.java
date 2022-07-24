// Generated from C:/Users/EduardoA/OneDrive/Documentos/Eduardo/[OLC2]P1/Proyecto 1/Interprete/src\Gramaticas.g4 by ANTLR 4.10.1
package Gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, NUMBER=57, FLOAT=58, CHARACTER=59, 
		STRING=60, ID=61, WS=62, COMENTARIO=63;
	public static final int
		RULE_init = 0, RULE_list_instructions = 1, RULE_instructions = 2, RULE_program = 3, 
		RULE_subroutine = 4, RULE_subroutine_sin_params = 5, RULE_paramsub = 6, 
		RULE_g = 7, RULE_function = 8, RULE_function_sin_params = 9, RULE_params = 10, 
		RULE_imprimir = 11, RULE_declaration = 12, RULE_asignacion = 13, RULE_sentes_if = 14, 
		RULE_sentes_do = 15, RULE_sentes_do_while = 16, RULE_control_cicle = 17, 
		RULE_cycle_tag = 18, RULE_decla_array = 19, RULE_asignacion_array = 20, 
		RULE_call = 21, RULE_call_sin_params = 22, RULE_e = 23, RULE_a = 24, RULE_instruct = 25, 
		RULE_intElse = 26, RULE_type = 27, RULE_expr = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "list_instructions", "instructions", "program", "subroutine", 
			"subroutine_sin_params", "paramsub", "g", "function", "function_sin_params", 
			"params", "imprimir", "declaration", "asignacion", "sentes_if", "sentes_do", 
			"sentes_do_while", "control_cicle", "cycle_tag", "decla_array", "asignacion_array", 
			"call", "call_sin_params", "e", "a", "instruct", "intElse", "type", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'implicit none'", "'end'", "'subroutine'", "'('", 
			"')'", "','", "'intent(in)'", "'::'", "'function'", "'result'", "'='", 
			"'print'", "'*'", "':'", "'if'", "'then'", "'else'", "'do'", "'while'", 
			"'exit'", "'cycle'", "'dimension'", "'allocatable'", "'/'", "'['", "']'", 
			"'allocate'", "'deallocate'", "'call'", "'integer'", "'real'", "'complex'", 
			"'character'", "'logical'", "'**'", "'+'", "'-'", "'=='", "'.eq.'", "'/='", 
			"'.ne.'", "'>'", "'.gt.'", "'<'", "'.lt.'", "'>='", "'.ge.'", "'<='", 
			"'.le.'", "'.and.'", "'.or.'", "'.not.'", "'.false.'", "'.true.'", "'size'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NUMBER", "FLOAT", 
			"CHARACTER", "STRING", "ID", "WS", "COMENTARIO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gramaticas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public List_instructionsContext list_instructions() {
			return getRuleContext(List_instructionsContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			list_instructions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_instructionsContext extends ParserRuleContext {
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public List_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterList_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitList_instructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitList_instructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_instructionsContext list_instructions() throws RecognitionException {
		List_instructionsContext _localctx = new List_instructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_list_instructions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			instructions();
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					instructions();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public SubroutineContext subroutine() {
			return getRuleContext(SubroutineContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Decla_arrayContext decla_array() {
			return getRuleContext(Decla_arrayContext.class,0);
		}
		public Asignacion_arrayContext asignacion_array() {
			return getRuleContext(Asignacion_arrayContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Sentes_ifContext sentes_if() {
			return getRuleContext(Sentes_ifContext.class,0);
		}
		public Sentes_doContext sentes_do() {
			return getRuleContext(Sentes_doContext.class,0);
		}
		public Sentes_do_whileContext sentes_do_while() {
			return getRuleContext(Sentes_do_whileContext.class,0);
		}
		public Subroutine_sin_paramsContext subroutine_sin_params() {
			return getRuleContext(Subroutine_sin_paramsContext.class,0);
		}
		public Function_sin_paramsContext function_sin_params() {
			return getRuleContext(Function_sin_paramsContext.class,0);
		}
		public Call_sin_paramsContext call_sin_params() {
			return getRuleContext(Call_sin_paramsContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instructions);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				subroutine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				program();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				imprimir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				asignacion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				decla_array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				asignacion_array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(76);
				sentes_if();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(77);
				sentes_do();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(78);
				sentes_do_while();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(79);
				subroutine_sin_params();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(80);
				function_sin_params();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(81);
				call_sin_params();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Token idprogram1;
		public Token idprogram2;
		public List_instructionsContext list_instructions() {
			return getRuleContext(List_instructionsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticasParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticasParser.ID, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			((ProgramContext)_localctx).idprogram1 = match(ID);
			setState(86);
			match(T__1);
			setState(87);
			list_instructions();
			setState(88);
			match(T__2);
			setState(89);
			match(T__0);
			setState(90);
			((ProgramContext)_localctx).idprogram2 = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutineContext extends ParserRuleContext {
		public Token idsub1;
		public Token idsub2;
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsubContext paramsub() {
			return getRuleContext(ParamsubContext.class,0);
		}
		public List_instructionsContext list_instructions() {
			return getRuleContext(List_instructionsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticasParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticasParser.ID, i);
		}
		public SubroutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterSubroutine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitSubroutine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitSubroutine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineContext subroutine() throws RecognitionException {
		SubroutineContext _localctx = new SubroutineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subroutine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__3);
			setState(93);
			((SubroutineContext)_localctx).idsub1 = match(ID);
			setState(94);
			match(T__4);
			setState(95);
			params();
			setState(96);
			match(T__5);
			setState(97);
			match(T__1);
			setState(98);
			paramsub();
			setState(99);
			list_instructions();
			setState(100);
			match(T__2);
			setState(101);
			match(T__3);
			setState(102);
			((SubroutineContext)_localctx).idsub2 = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subroutine_sin_paramsContext extends ParserRuleContext {
		public Token idsub1;
		public Token idsub2;
		public List_instructionsContext list_instructions() {
			return getRuleContext(List_instructionsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticasParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticasParser.ID, i);
		}
		public Subroutine_sin_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutine_sin_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterSubroutine_sin_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitSubroutine_sin_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitSubroutine_sin_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subroutine_sin_paramsContext subroutine_sin_params() throws RecognitionException {
		Subroutine_sin_paramsContext _localctx = new Subroutine_sin_paramsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subroutine_sin_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__3);
			setState(105);
			((Subroutine_sin_paramsContext)_localctx).idsub1 = match(ID);
			setState(106);
			match(T__4);
			setState(107);
			match(T__5);
			setState(108);
			match(T__1);
			setState(109);
			list_instructions();
			setState(110);
			match(T__2);
			setState(111);
			match(T__3);
			setState(112);
			((Subroutine_sin_paramsContext)_localctx).idsub2 = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsubContext extends ParserRuleContext {
		public List<GContext> g() {
			return getRuleContexts(GContext.class);
		}
		public GContext g(int i) {
			return getRuleContext(GContext.class,i);
		}
		public ParamsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterParamsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitParamsub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitParamsub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsubContext paramsub() throws RecognitionException {
		ParamsubContext _localctx = new ParamsubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramsub);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(114);
					g();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_g);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			type();
			setState(120);
			match(T__6);
			setState(121);
			match(T__7);
			setState(122);
			match(T__8);
			setState(123);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Token idfun1;
		public Token res;
		public Token rest;
		public Token rest1;
		public Token idfun2;
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsubContext paramsub() {
			return getRuleContext(ParamsubContext.class,0);
		}
		public List_instructionsContext list_instructions() {
			return getRuleContext(List_instructionsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticasParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticasParser.ID, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__9);
			setState(126);
			((FunctionContext)_localctx).idfun1 = match(ID);
			setState(127);
			match(T__4);
			setState(128);
			params();
			setState(129);
			match(T__5);
			setState(130);
			match(T__10);
			setState(131);
			match(T__4);
			setState(132);
			((FunctionContext)_localctx).res = match(ID);
			setState(133);
			match(T__5);
			setState(134);
			match(T__1);
			setState(135);
			paramsub();
			setState(136);
			list_instructions();
			setState(137);
			type();
			setState(138);
			match(T__8);
			setState(139);
			((FunctionContext)_localctx).rest = match(ID);
			setState(140);
			((FunctionContext)_localctx).rest1 = match(ID);
			setState(141);
			match(T__11);
			setState(142);
			expr(0);
			setState(143);
			match(T__2);
			setState(144);
			match(T__9);
			setState(145);
			((FunctionContext)_localctx).idfun2 = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_sin_paramsContext extends ParserRuleContext {
		public Token idfun1;
		public Token res;
		public Token rest;
		public Token rest1;
		public Token idfun2;
		public List_instructionsContext list_instructions() {
			return getRuleContext(List_instructionsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticasParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticasParser.ID, i);
		}
		public Function_sin_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_sin_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterFunction_sin_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitFunction_sin_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitFunction_sin_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_sin_paramsContext function_sin_params() throws RecognitionException {
		Function_sin_paramsContext _localctx = new Function_sin_paramsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_sin_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__9);
			setState(148);
			((Function_sin_paramsContext)_localctx).idfun1 = match(ID);
			setState(149);
			match(T__4);
			setState(150);
			match(T__5);
			setState(151);
			match(T__10);
			setState(152);
			match(T__4);
			setState(153);
			((Function_sin_paramsContext)_localctx).res = match(ID);
			setState(154);
			match(T__5);
			setState(155);
			match(T__1);
			setState(156);
			list_instructions();
			setState(157);
			type();
			setState(158);
			match(T__8);
			setState(159);
			((Function_sin_paramsContext)_localctx).rest = match(ID);
			setState(160);
			((Function_sin_paramsContext)_localctx).rest1 = match(ID);
			setState(161);
			match(T__11);
			setState(162);
			expr(0);
			setState(163);
			match(T__2);
			setState(164);
			match(T__9);
			setState(165);
			((Function_sin_paramsContext)_localctx).idfun2 = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			expr(0);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(168);
				match(T__6);
				setState(169);
				expr(0);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimirContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__12);
			setState(176);
			match(T__13);
			setState(177);
			match(T__6);
			setState(178);
			expr(0);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(179);
				match(T__6);
				setState(180);
				expr(0);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaNormContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaNormContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterDeclaNorm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitDeclaNorm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitDeclaNorm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaVariasContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DeclaVariasContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterDeclaVarias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitDeclaVarias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitDeclaVarias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaVariasExprContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DeclaVariasExprContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterDeclaVariasExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitDeclaVariasExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitDeclaVariasExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaFuncContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DeclaFuncContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterDeclaFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitDeclaFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitDeclaFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaNormSinValContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public DeclaNormSinValContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterDeclaNormSinVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitDeclaNormSinVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitDeclaNormSinVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DeclaNormSinValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				type();
				setState(187);
				match(T__8);
				setState(188);
				match(ID);
				}
				break;
			case 2:
				_localctx = new DeclaVariasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				type();
				setState(191);
				match(T__8);
				setState(192);
				expr(0);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(193);
					match(T__6);
					setState(194);
					expr(0);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new DeclaNormContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				type();
				setState(201);
				match(T__8);
				setState(202);
				match(ID);
				setState(203);
				match(T__11);
				setState(204);
				expr(0);
				}
				break;
			case 4:
				_localctx = new DeclaVariasExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				type();
				setState(207);
				match(T__8);
				setState(208);
				match(ID);
				setState(209);
				match(T__11);
				setState(210);
				expr(0);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(211);
					match(T__6);
					setState(212);
					expr(0);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new DeclaFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				type();
				setState(219);
				match(T__8);
				setState(220);
				match(ID);
				setState(221);
				match(T__4);
				setState(222);
				expr(0);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(223);
					match(T__6);
					setState(224);
					expr(0);
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalAsigContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NormalAsigContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterNormalAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitNormalAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitNormalAsig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsdvectorContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(GramaticasParser.NUMBER, 0); }
		public AsdvectorContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterAsdvector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitAsdvector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitAsdvector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asignacion);
		try {
			int _alt;
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new NormalAsigContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(ID);
				setState(235);
				match(T__11);
				setState(236);
				expr(0);
				}
				break;
			case 2:
				_localctx = new AsdvectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(ID);
				setState(238);
				match(T__4);
				setState(239);
				match(T__14);
				setState(240);
				match(T__6);
				setState(241);
				match(T__14);
				setState(242);
				match(T__5);
				setState(243);
				match(T__11);
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(244);
						expr(0);
						}
						} 
					}
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new AsdvectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(ID);
				setState(251);
				match(T__4);
				setState(252);
				match(T__14);
				setState(253);
				match(T__5);
				setState(254);
				match(T__11);
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(255);
						expr(0);
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new AsdvectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(ID);
				setState(262);
				match(T__4);
				setState(263);
				match(NUMBER);
				setState(264);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentes_ifContext extends ParserRuleContext {
		public Sentes_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentes_if; }
	 
		public Sentes_ifContext() { }
		public void copyFrom(Sentes_ifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfanidadoContext extends Sentes_ifContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Sentes_ifContext sentes_if() {
			return getRuleContext(Sentes_ifContext.class,0);
		}
		public List<InstructContext> instruct() {
			return getRuleContexts(InstructContext.class);
		}
		public InstructContext instruct(int i) {
			return getRuleContext(InstructContext.class,i);
		}
		public IfanidadoContext(Sentes_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterIfanidado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitIfanidado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitIfanidado(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends Sentes_ifContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InstructContext> instruct() {
			return getRuleContexts(InstructContext.class);
		}
		public InstructContext instruct(int i) {
			return getRuleContext(InstructContext.class,i);
		}
		public IfContext(Sentes_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfelseContext extends Sentes_ifContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InstructContext> instruct() {
			return getRuleContexts(InstructContext.class);
		}
		public InstructContext instruct(int i) {
			return getRuleContext(InstructContext.class,i);
		}
		public List<IntElseContext> intElse() {
			return getRuleContexts(IntElseContext.class);
		}
		public IntElseContext intElse(int i) {
			return getRuleContext(IntElseContext.class,i);
		}
		public IfelseContext(Sentes_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentes_ifContext sentes_if() throws RecognitionException {
		Sentes_ifContext _localctx = new Sentes_ifContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentes_if);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__15);
				setState(268);
				match(T__4);
				setState(269);
				expr(0);
				setState(270);
				match(T__5);
				setState(271);
				match(T__16);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(272);
					instruct();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				match(T__2);
				setState(279);
				match(T__15);
				}
				break;
			case 2:
				_localctx = new IfelseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__15);
				setState(282);
				match(T__4);
				setState(283);
				expr(0);
				setState(284);
				match(T__5);
				setState(285);
				match(T__16);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(286);
					instruct();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				match(T__17);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(293);
					intElse();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				match(T__2);
				setState(300);
				match(T__15);
				}
				break;
			case 3:
				_localctx = new IfanidadoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(T__15);
				setState(303);
				match(T__4);
				setState(304);
				expr(0);
				setState(305);
				match(T__5);
				setState(306);
				match(T__16);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(307);
					instruct();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
				match(T__17);
				setState(314);
				sentes_if();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentes_doContext extends ParserRuleContext {
		public Sentes_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentes_do; }
	 
		public Sentes_doContext() { }
		public void copyFrom(Sentes_doContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoforContext extends Sentes_doContext {
		public Token d;
		public ExprContext num1;
		public ExprContext num2;
		public ExprContext paso;
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<InstructContext> instruct() {
			return getRuleContexts(InstructContext.class);
		}
		public InstructContext instruct(int i) {
			return getRuleContext(InstructContext.class,i);
		}
		public DoforContext(Sentes_doContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterDofor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitDofor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitDofor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoContext extends Sentes_doContext {
		public Token d;
		public ExprContext number1;
		public ExprContext number2;
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<InstructContext> instruct() {
			return getRuleContexts(InstructContext.class);
		}
		public InstructContext instruct(int i) {
			return getRuleContext(InstructContext.class,i);
		}
		public DoContext(Sentes_doContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentes_doContext sentes_do() throws RecognitionException {
		Sentes_doContext _localctx = new Sentes_doContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sentes_do);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new DoforContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((DoforContext)_localctx).d = match(T__18);
				setState(319);
				match(ID);
				setState(320);
				match(T__11);
				setState(321);
				((DoforContext)_localctx).num1 = expr(0);
				setState(322);
				match(T__6);
				setState(323);
				((DoforContext)_localctx).num2 = expr(0);
				setState(324);
				match(T__6);
				setState(325);
				((DoforContext)_localctx).paso = expr(0);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(326);
					instruct();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				match(T__2);
				setState(333);
				match(T__18);
				}
				break;
			case 2:
				_localctx = new DoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				((DoContext)_localctx).d = match(T__18);
				setState(336);
				match(ID);
				setState(337);
				match(T__11);
				setState(338);
				((DoContext)_localctx).number1 = expr(0);
				setState(339);
				match(T__6);
				setState(340);
				((DoContext)_localctx).number2 = expr(0);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(341);
					instruct();
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347);
				match(T__2);
				setState(348);
				match(T__18);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentes_do_whileContext extends ParserRuleContext {
		public Token d;
		public ExprContext ex;
		public List<InstructContext> instruct() {
			return getRuleContexts(InstructContext.class);
		}
		public InstructContext instruct(int i) {
			return getRuleContext(InstructContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Sentes_do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentes_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterSentes_do_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitSentes_do_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitSentes_do_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentes_do_whileContext sentes_do_while() throws RecognitionException {
		Sentes_do_whileContext _localctx = new Sentes_do_whileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sentes_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			((Sentes_do_whileContext)_localctx).d = match(T__18);
			setState(353);
			match(T__19);
			setState(354);
			match(T__4);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << NUMBER) | (1L << FLOAT) | (1L << CHARACTER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(355);
				((Sentes_do_whileContext)_localctx).ex = expr(0);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(T__5);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
				{
				{
				setState(362);
				instruct();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			match(T__2);
			setState(369);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_cicleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public Control_cicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterControl_cicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitControl_cicle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitControl_cicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_cicleContext control_cicle() throws RecognitionException {
		Control_cicleContext _localctx = new Control_cicleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_control_cicle);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(T__20);
				setState(372);
				match(ID);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(T__21);
				setState(374);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cycle_tagContext extends ParserRuleContext {
		public Token c1;
		public Token c2;
		public Sentes_doContext sentes_do() {
			return getRuleContext(Sentes_doContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticasParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticasParser.ID, i);
		}
		public Cycle_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterCycle_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitCycle_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitCycle_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cycle_tagContext cycle_tag() throws RecognitionException {
		Cycle_tagContext _localctx = new Cycle_tagContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cycle_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			((Cycle_tagContext)_localctx).c1 = match(ID);
			setState(378);
			match(T__14);
			setState(379);
			sentes_do();
			setState(380);
			((Cycle_tagContext)_localctx).c2 = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decla_arrayContext extends ParserRuleContext {
		public Decla_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decla_array; }
	 
		public Decla_arrayContext() { }
		public void copyFrom(Decla_arrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayContext extends Decla_arrayContext {
		public ExprContext f;
		public ExprContext c;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayContext(Decla_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MdinamicContext extends Decla_arrayContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public MdinamicContext(Decla_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterMdinamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitMdinamic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitMdinamic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VectorContext extends Decla_arrayContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public VectorContext(Decla_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VdinamicContext extends Decla_arrayContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public VdinamicContext(Decla_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterVdinamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitVdinamic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitVdinamic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decla_arrayContext decla_array() throws RecognitionException {
		Decla_arrayContext _localctx = new Decla_arrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decla_array);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new VectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				type();
				setState(383);
				match(T__6);
				setState(384);
				match(T__22);
				setState(385);
				match(T__4);
				setState(386);
				expr(0);
				setState(387);
				match(T__5);
				setState(388);
				match(T__8);
				setState(389);
				match(ID);
				}
				break;
			case 2:
				_localctx = new VectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				type();
				setState(392);
				match(T__8);
				setState(393);
				match(ID);
				setState(394);
				match(T__4);
				setState(395);
				expr(0);
				setState(396);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				type();
				setState(399);
				match(T__6);
				setState(400);
				match(T__22);
				setState(401);
				match(T__4);
				setState(402);
				((ArrayContext)_localctx).f = expr(0);
				setState(403);
				match(T__6);
				setState(404);
				((ArrayContext)_localctx).c = expr(0);
				setState(405);
				match(T__5);
				setState(406);
				match(T__8);
				setState(407);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				type();
				setState(410);
				match(T__8);
				setState(411);
				match(ID);
				setState(412);
				match(T__4);
				setState(413);
				((ArrayContext)_localctx).f = expr(0);
				setState(414);
				match(T__6);
				setState(415);
				((ArrayContext)_localctx).c = expr(0);
				setState(416);
				match(T__5);
				}
				break;
			case 5:
				_localctx = new VdinamicContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				type();
				setState(419);
				match(T__6);
				setState(420);
				match(T__23);
				setState(421);
				match(T__8);
				setState(422);
				match(ID);
				setState(423);
				match(T__4);
				setState(424);
				match(T__14);
				setState(425);
				match(T__5);
				}
				break;
			case 6:
				_localctx = new MdinamicContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				type();
				setState(428);
				match(T__6);
				setState(429);
				match(T__23);
				setState(430);
				match(T__8);
				setState(431);
				match(ID);
				setState(432);
				match(T__4);
				setState(433);
				match(T__14);
				setState(434);
				match(T__6);
				setState(435);
				match(T__14);
				setState(436);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Asignacion_arrayContext extends ParserRuleContext {
		public Asignacion_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_array; }
	 
		public Asignacion_arrayContext() { }
		public void copyFrom(Asignacion_arrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsigMatrixContext extends Asignacion_arrayContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AsigMatrixContext(Asignacion_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterAsigMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitAsigMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitAsigMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DesasignarContext extends Asignacion_arrayContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public DesasignarContext(Asignacion_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterDesasignar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitDesasignar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitDesasignar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigMatrixDinContext extends Asignacion_arrayContext {
		public ExprContext f;
		public ExprContext c;
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AsigMatrixDinContext(Asignacion_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterAsigMatrixDin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitAsigMatrixDin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitAsigMatrixDin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigVectorDinContext extends Asignacion_arrayContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsigVectorDinContext(Asignacion_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterAsigVectorDin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitAsigVectorDin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitAsigVectorDin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AMatrixContext extends Asignacion_arrayContext {
		public ExprContext f;
		public ExprContext c;
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AMatrixContext(Asignacion_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterAMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitAMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitAMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigVectorContext extends Asignacion_arrayContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AsigVectorContext(Asignacion_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterAsigVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitAsigVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitAsigVector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AVectorContext extends Asignacion_arrayContext {
		public ExprContext tam;
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AVectorContext(Asignacion_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterAVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitAVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitAVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_arrayContext asignacion_array() throws RecognitionException {
		Asignacion_arrayContext _localctx = new Asignacion_arrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_asignacion_array);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new AsigMatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				type();
				setState(441);
				match(T__8);
				setState(442);
				asignacion();
				}
				break;
			case 2:
				_localctx = new AsigVectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(ID);
				setState(445);
				match(T__11);
				setState(446);
				match(T__4);
				setState(447);
				match(T__24);
				setState(448);
				expr(0);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(449);
					match(T__6);
					setState(450);
					expr(0);
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(456);
				match(T__24);
				setState(457);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new AVectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				match(ID);
				setState(460);
				match(T__25);
				setState(461);
				((AVectorContext)_localctx).tam = expr(0);
				setState(462);
				match(T__26);
				setState(463);
				match(T__11);
				setState(464);
				expr(0);
				}
				break;
			case 4:
				_localctx = new AMatrixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(ID);
				setState(467);
				match(T__25);
				setState(468);
				((AMatrixContext)_localctx).f = expr(0);
				setState(469);
				match(T__6);
				setState(470);
				((AMatrixContext)_localctx).c = expr(0);
				setState(471);
				match(T__26);
				setState(472);
				match(T__11);
				setState(473);
				expr(0);
				}
				break;
			case 5:
				_localctx = new AsigVectorDinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(475);
				match(T__27);
				setState(476);
				match(T__4);
				setState(477);
				match(ID);
				setState(478);
				match(T__4);
				setState(479);
				expr(0);
				setState(480);
				match(T__5);
				setState(481);
				match(T__5);
				}
				break;
			case 6:
				_localctx = new AsigMatrixDinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(483);
				match(T__27);
				setState(484);
				match(T__4);
				setState(485);
				match(ID);
				setState(486);
				match(T__4);
				setState(487);
				((AsigMatrixDinContext)_localctx).f = expr(0);
				setState(488);
				match(T__6);
				setState(489);
				((AsigMatrixDinContext)_localctx).c = expr(0);
				setState(490);
				match(T__5);
				setState(491);
				match(T__5);
				}
				break;
			case 7:
				_localctx = new DesasignarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				match(T__28);
				setState(494);
				match(T__4);
				setState(495);
				match(ID);
				setState(496);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__29);
			setState(500);
			match(ID);
			setState(501);
			match(T__4);
			setState(502);
			e();
			setState(503);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_sin_paramsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public Call_sin_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_sin_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterCall_sin_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitCall_sin_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitCall_sin_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_sin_paramsContext call_sin_params() throws RecognitionException {
		Call_sin_paramsContext _localctx = new Call_sin_paramsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_call_sin_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(T__29);
			setState(506);
			match(ID);
			setState(507);
			match(T__4);
			setState(508);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			expr(0);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(511);
				match(T__6);
				setState(512);
				expr(0);
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AContext extends ParserRuleContext {
		public List<InstructContext> instruct() {
			return getRuleContexts(InstructContext.class);
		}
		public InstructContext instruct(int i) {
			return getRuleContext(InstructContext.class,i);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			instruct();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
				{
				{
				setState(519);
				instruct();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructContext extends ParserRuleContext {
		public Token cc;
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Decla_arrayContext decla_array() {
			return getRuleContext(Decla_arrayContext.class,0);
		}
		public Asignacion_arrayContext asignacion_array() {
			return getRuleContext(Asignacion_arrayContext.class,0);
		}
		public Sentes_ifContext sentes_if() {
			return getRuleContext(Sentes_ifContext.class,0);
		}
		public Sentes_doContext sentes_do() {
			return getRuleContext(Sentes_doContext.class,0);
		}
		public Sentes_do_whileContext sentes_do_while() {
			return getRuleContext(Sentes_do_whileContext.class,0);
		}
		public Control_cicleContext control_cicle() {
			return getRuleContext(Control_cicleContext.class,0);
		}
		public Cycle_tagContext cycle_tag() {
			return getRuleContext(Cycle_tagContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Call_sin_paramsContext call_sin_params() {
			return getRuleContext(Call_sin_paramsContext.class,0);
		}
		public InstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterInstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitInstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitInstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructContext instruct() throws RecognitionException {
		InstructContext _localctx = new InstructContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instruct);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				imprimir();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				asignacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				decla_array();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(529);
				asignacion_array();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(530);
				sentes_if();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(531);
				sentes_do();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(532);
				sentes_do_while();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(533);
				control_cicle();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(534);
				((InstructContext)_localctx).cc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
					((InstructContext)_localctx).cc = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(535);
				cycle_tag();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(536);
				call();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(537);
				call_sin_params();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntElseContext extends ParserRuleContext {
		public Token cc;
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Decla_arrayContext decla_array() {
			return getRuleContext(Decla_arrayContext.class,0);
		}
		public Asignacion_arrayContext asignacion_array() {
			return getRuleContext(Asignacion_arrayContext.class,0);
		}
		public Sentes_ifContext sentes_if() {
			return getRuleContext(Sentes_ifContext.class,0);
		}
		public Sentes_doContext sentes_do() {
			return getRuleContext(Sentes_doContext.class,0);
		}
		public Sentes_do_whileContext sentes_do_while() {
			return getRuleContext(Sentes_do_whileContext.class,0);
		}
		public Control_cicleContext control_cicle() {
			return getRuleContext(Control_cicleContext.class,0);
		}
		public Cycle_tagContext cycle_tag() {
			return getRuleContext(Cycle_tagContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Call_sin_paramsContext call_sin_params() {
			return getRuleContext(Call_sin_paramsContext.class,0);
		}
		public IntElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterIntElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitIntElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitIntElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntElseContext intElse() throws RecognitionException {
		IntElseContext _localctx = new IntElseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_intElse);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				imprimir();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				asignacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				decla_array();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				asignacion_array();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(545);
				sentes_if();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(546);
				sentes_do();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(547);
				sentes_do_while();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(548);
				control_cicle();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(549);
				((IntElseContext)_localctx).cc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
					((IntElseContext)_localctx).cc = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(550);
				cycle_tag();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(551);
				call();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(552);
				call_sin_params();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharExprContext extends ExprContext {
		public Token char_;
		public TerminalNode CHARACTER() { return getToken(GramaticasParser.CHARACTER, 0); }
		public CharExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterCharExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitCharExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitCharExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolfExprContext extends ExprContext {
		public Token bool;
		public BoolfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterBoolfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitBoolfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitBoolfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AccesoMContext extends ExprContext {
		public ExprContext f;
		public ExprContext c;
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AccesoMContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterAccesoM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitAccesoM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitAccesoM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnteroExprContext extends ExprContext {
		public Token entero;
		public TerminalNode NUMBER() { return getToken(GramaticasParser.NUMBER, 0); }
		public EnteroExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterEnteroExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitEnteroExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitEnteroExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FsinparamsContext extends ExprContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public FsinparamsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterFsinparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitFsinparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitFsinparams(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TamVecContext extends ExprContext {
		public Token tam;
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public TamVecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterTamVec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitTamVec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitTamVec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpRelaContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpRelaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterOpRela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitOpRela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitOpRela(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FconparamsContext extends ExprContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FconparamsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterFconparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitFconparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitFconparams(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AccesoVContext extends ExprContext {
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AccesoVContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterAccesoV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitAccesoV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitAccesoV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExprContext {
		public Token bool;
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpLogicaContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpLogicaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterOpLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitOpLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitOpLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeciExprContext extends ExprContext {
		public Token deci;
		public TerminalNode FLOAT() { return getToken(GramaticasParser.FLOAT, 0); }
		public DeciExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterDeciExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitDeciExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitDeciExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpStrExprContext extends ExprContext {
		public Token impStr;
		public TerminalNode STRING() { return getToken(GramaticasParser.STRING, 0); }
		public ImpStrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterImpStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitImpStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitImpStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public Token id;
		public TerminalNode ID() { return getToken(GramaticasParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticasListener ) ((GramaticasListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticasVisitor ) return ((GramaticasVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(558);
				match(T__52);
				setState(559);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(560);
				match(T__4);
				setState(561);
				expr(0);
				setState(562);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new DeciExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(564);
				((DeciExprContext)_localctx).deci = match(FLOAT);
				}
				break;
			case 4:
				{
				_localctx = new EnteroExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(565);
				((EnteroExprContext)_localctx).entero = match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new CharExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(566);
				((CharExprContext)_localctx).char_ = match(CHARACTER);
				}
				break;
			case 6:
				{
				_localctx = new ImpStrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(567);
				((ImpStrExprContext)_localctx).impStr = match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(568);
				((IdExprContext)_localctx).id = match(ID);
				}
				break;
			case 8:
				{
				_localctx = new BoolfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(569);
				((BoolfExprContext)_localctx).bool = match(T__53);
				}
				break;
			case 9:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(570);
				((BoolExprContext)_localctx).bool = match(T__54);
				}
				break;
			case 10:
				{
				_localctx = new FconparamsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(571);
				match(ID);
				setState(572);
				match(T__4);
				setState(573);
				params();
				setState(574);
				match(T__5);
				}
				break;
			case 11:
				{
				_localctx = new FsinparamsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(576);
				match(ID);
				setState(577);
				match(T__4);
				setState(578);
				match(T__5);
				}
				break;
			case 12:
				{
				_localctx = new TamVecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(579);
				((TamVecContext)_localctx).tam = match(T__55);
				setState(580);
				match(T__4);
				setState(581);
				match(ID);
				setState(582);
				match(T__5);
				}
				break;
			case 13:
				{
				_localctx = new AccesoVContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(583);
				match(ID);
				setState(584);
				match(T__25);
				setState(585);
				expr(0);
				setState(586);
				match(T__26);
				}
				break;
			case 14:
				{
				_localctx = new AccesoMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(588);
				match(ID);
				setState(589);
				match(T__25);
				setState(590);
				((AccesoMContext)_localctx).f = expr(0);
				setState(591);
				match(T__6);
				setState(592);
				((AccesoMContext)_localctx).c = expr(0);
				setState(593);
				match(T__26);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(614);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(612);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(597);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(598);
						((OpExprContext)_localctx).op = match(T__35);
						setState(599);
						((OpExprContext)_localctx).right = expr(20);
						}
						break;
					case 2:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(600);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(601);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__24) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(602);
						((OpExprContext)_localctx).right = expr(19);
						}
						break;
					case 3:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(603);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(604);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(605);
						((OpExprContext)_localctx).right = expr(18);
						}
						break;
					case 4:
						{
						_localctx = new OpRelaContext(new ExprContext(_parentctx, _parentState));
						((OpRelaContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(606);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(607);
						((OpRelaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
							((OpRelaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(608);
						((OpRelaContext)_localctx).right = expr(17);
						}
						break;
					case 5:
						{
						_localctx = new OpLogicaContext(new ExprContext(_parentctx, _parentState));
						((OpLogicaContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(609);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(610);
						((OpLogicaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__50 || _la==T__51) ) {
							((OpLogicaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(611);
						((OpLogicaContext)_localctx).right = expr(16);
						}
						break;
					}
					} 
				}
				setState(616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001?\u026a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001?\b\u0001\n\u0001\f\u0001B\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002S\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006t\b\u0006"+
		"\u000b\u0006\f\u0006u\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0005\n\u00ab\b\n\n\n\f\n\u00ae\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00b6\b\u000b\n\u000b\f\u000b\u00b9\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00c4\b\f\n\f\f\f\u00c7"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00d6\b\f\n\f\f\f\u00d9\t\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00e2"+
		"\b\f\n\f\f\f\u00e5\t\f\u0001\f\u0001\f\u0003\f\u00e9\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00f6\b\r\n\r\f\r\u00f9\t\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u0101\b\r\n\r\f\r\u0104\t\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u010a\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0112\b\u000e\n\u000e\f\u000e"+
		"\u0115\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0120\b\u000e"+
		"\n\u000e\f\u000e\u0123\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0127"+
		"\b\u000e\n\u000e\f\u000e\u012a\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0135\b\u000e\n\u000e\f\u000e\u0138\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u013d\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0148\b\u000f\n\u000f\f\u000f\u014b\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0157\b\u000f\n\u000f"+
		"\f\u000f\u015a\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u015f\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0165\b\u0010\n\u0010\f\u0010\u0168\t\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u016c\b\u0010\n\u0010\f\u0010\u016f\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0178\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u01b7\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01c4\b\u0014\n\u0014"+
		"\f\u0014\u01c7\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u01f2\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0202\b\u0017\n\u0017\f\u0017\u0205\t\u0017\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0209\b\u0018\n\u0018\f\u0018\u020c\t\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u021b\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u022a\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0254\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u0265\b\u001c\n\u001c\f\u001c\u0268\t\u001c\u0001"+
		"\u001c\u0000\u00018\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0006\u0001\u0000"+
		"\u0015\u0016\u0001\u0000\u001f#\u0002\u0000\u000e\u000e\u0019\u0019\u0001"+
		"\u0000%&\u0001\u0000\'2\u0001\u000034\u02ae\u0000:\u0001\u0000\u0000\u0000"+
		"\u0002<\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000\u0006T"+
		"\u0001\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000"+
		"\u0000\fs\u0001\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010"+
		"}\u0001\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000\u0014\u00a7"+
		"\u0001\u0000\u0000\u0000\u0016\u00af\u0001\u0000\u0000\u0000\u0018\u00e8"+
		"\u0001\u0000\u0000\u0000\u001a\u0109\u0001\u0000\u0000\u0000\u001c\u013c"+
		"\u0001\u0000\u0000\u0000\u001e\u015e\u0001\u0000\u0000\u0000 \u0160\u0001"+
		"\u0000\u0000\u0000\"\u0177\u0001\u0000\u0000\u0000$\u0179\u0001\u0000"+
		"\u0000\u0000&\u01b6\u0001\u0000\u0000\u0000(\u01f1\u0001\u0000\u0000\u0000"+
		"*\u01f3\u0001\u0000\u0000\u0000,\u01f9\u0001\u0000\u0000\u0000.\u01fe"+
		"\u0001\u0000\u0000\u00000\u0206\u0001\u0000\u0000\u00002\u021a\u0001\u0000"+
		"\u0000\u00004\u0229\u0001\u0000\u0000\u00006\u022b\u0001\u0000\u0000\u0000"+
		"8\u0253\u0001\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000;\u0001\u0001"+
		"\u0000\u0000\u0000<@\u0003\u0004\u0002\u0000=?\u0003\u0004\u0002\u0000"+
		">=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A\u0003\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CS\u0003\b\u0004\u0000DS\u0003\u0010\b\u0000ES\u0003"+
		"\u0006\u0003\u0000FS\u0003\u0016\u000b\u0000GS\u0003\u0018\f\u0000HS\u0003"+
		"\u001a\r\u0000IS\u0003&\u0013\u0000JS\u0003(\u0014\u0000KS\u0003*\u0015"+
		"\u0000LS\u0003\u001c\u000e\u0000MS\u0003\u001e\u000f\u0000NS\u0003 \u0010"+
		"\u0000OS\u0003\n\u0005\u0000PS\u0003\u0012\t\u0000QS\u0003,\u0016\u0000"+
		"RC\u0001\u0000\u0000\u0000RD\u0001\u0000\u0000\u0000RE\u0001\u0000\u0000"+
		"\u0000RF\u0001\u0000\u0000\u0000RG\u0001\u0000\u0000\u0000RH\u0001\u0000"+
		"\u0000\u0000RI\u0001\u0000\u0000\u0000RJ\u0001\u0000\u0000\u0000RK\u0001"+
		"\u0000\u0000\u0000RL\u0001\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000"+
		"RN\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000S\u0005\u0001\u0000\u0000\u0000TU\u0005"+
		"\u0001\u0000\u0000UV\u0005=\u0000\u0000VW\u0005\u0002\u0000\u0000WX\u0003"+
		"\u0002\u0001\u0000XY\u0005\u0003\u0000\u0000YZ\u0005\u0001\u0000\u0000"+
		"Z[\u0005=\u0000\u0000[\u0007\u0001\u0000\u0000\u0000\\]\u0005\u0004\u0000"+
		"\u0000]^\u0005=\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0003\u0014\n"+
		"\u0000`a\u0005\u0006\u0000\u0000ab\u0005\u0002\u0000\u0000bc\u0003\f\u0006"+
		"\u0000cd\u0003\u0002\u0001\u0000de\u0005\u0003\u0000\u0000ef\u0005\u0004"+
		"\u0000\u0000fg\u0005=\u0000\u0000g\t\u0001\u0000\u0000\u0000hi\u0005\u0004"+
		"\u0000\u0000ij\u0005=\u0000\u0000jk\u0005\u0005\u0000\u0000kl\u0005\u0006"+
		"\u0000\u0000lm\u0005\u0002\u0000\u0000mn\u0003\u0002\u0001\u0000no\u0005"+
		"\u0003\u0000\u0000op\u0005\u0004\u0000\u0000pq\u0005=\u0000\u0000q\u000b"+
		"\u0001\u0000\u0000\u0000rt\u0003\u000e\u0007\u0000sr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000v\r\u0001\u0000\u0000\u0000wx\u00036\u001b\u0000xy\u0005\u0007"+
		"\u0000\u0000yz\u0005\b\u0000\u0000z{\u0005\t\u0000\u0000{|\u0005=\u0000"+
		"\u0000|\u000f\u0001\u0000\u0000\u0000}~\u0005\n\u0000\u0000~\u007f\u0005"+
		"=\u0000\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080\u0081\u0003\u0014"+
		"\n\u0000\u0081\u0082\u0005\u0006\u0000\u0000\u0082\u0083\u0005\u000b\u0000"+
		"\u0000\u0083\u0084\u0005\u0005\u0000\u0000\u0084\u0085\u0005=\u0000\u0000"+
		"\u0085\u0086\u0005\u0006\u0000\u0000\u0086\u0087\u0005\u0002\u0000\u0000"+
		"\u0087\u0088\u0003\f\u0006\u0000\u0088\u0089\u0003\u0002\u0001\u0000\u0089"+
		"\u008a\u00036\u001b\u0000\u008a\u008b\u0005\t\u0000\u0000\u008b\u008c"+
		"\u0005=\u0000\u0000\u008c\u008d\u0005=\u0000\u0000\u008d\u008e\u0005\f"+
		"\u0000\u0000\u008e\u008f\u00038\u001c\u0000\u008f\u0090\u0005\u0003\u0000"+
		"\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091\u0092\u0005=\u0000\u0000"+
		"\u0092\u0011\u0001\u0000\u0000\u0000\u0093\u0094\u0005\n\u0000\u0000\u0094"+
		"\u0095\u0005=\u0000\u0000\u0095\u0096\u0005\u0005\u0000\u0000\u0096\u0097"+
		"\u0005\u0006\u0000\u0000\u0097\u0098\u0005\u000b\u0000\u0000\u0098\u0099"+
		"\u0005\u0005\u0000\u0000\u0099\u009a\u0005=\u0000\u0000\u009a\u009b\u0005"+
		"\u0006\u0000\u0000\u009b\u009c\u0005\u0002\u0000\u0000\u009c\u009d\u0003"+
		"\u0002\u0001\u0000\u009d\u009e\u00036\u001b\u0000\u009e\u009f\u0005\t"+
		"\u0000\u0000\u009f\u00a0\u0005=\u0000\u0000\u00a0\u00a1\u0005=\u0000\u0000"+
		"\u00a1\u00a2\u0005\f\u0000\u0000\u00a2\u00a3\u00038\u001c\u0000\u00a3"+
		"\u00a4\u0005\u0003\u0000\u0000\u00a4\u00a5\u0005\n\u0000\u0000\u00a5\u00a6"+
		"\u0005=\u0000\u0000\u00a6\u0013\u0001\u0000\u0000\u0000\u00a7\u00ac\u0003"+
		"8\u001c\u0000\u00a8\u00a9\u0005\u0007\u0000\u0000\u00a9\u00ab\u00038\u001c"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u0015\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005\r\u0000\u0000\u00b0\u00b1\u0005\u000e\u0000\u0000"+
		"\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2\u00b7\u00038\u001c\u0000\u00b3"+
		"\u00b4\u0005\u0007\u0000\u0000\u00b4\u00b6\u00038\u001c\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u0017"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u00036\u001b\u0000\u00bb\u00bc\u0005\t\u0000\u0000\u00bc\u00bd\u0005"+
		"=\u0000\u0000\u00bd\u00e9\u0001\u0000\u0000\u0000\u00be\u00bf\u00036\u001b"+
		"\u0000\u00bf\u00c0\u0005\t\u0000\u0000\u00c0\u00c5\u00038\u001c\u0000"+
		"\u00c1\u00c2\u0005\u0007\u0000\u0000\u00c2\u00c4\u00038\u001c\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00e9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u00036\u001b\u0000\u00c9\u00ca\u0005\t\u0000\u0000\u00ca\u00cb"+
		"\u0005=\u0000\u0000\u00cb\u00cc\u0005\f\u0000\u0000\u00cc\u00cd\u0003"+
		"8\u001c\u0000\u00cd\u00e9\u0001\u0000\u0000\u0000\u00ce\u00cf\u00036\u001b"+
		"\u0000\u00cf\u00d0\u0005\t\u0000\u0000\u00d0\u00d1\u0005=\u0000\u0000"+
		"\u00d1\u00d2\u0005\f\u0000\u0000\u00d2\u00d7\u00038\u001c\u0000\u00d3"+
		"\u00d4\u0005\u0007\u0000\u0000\u00d4\u00d6\u00038\u001c\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u00036\u001b\u0000\u00db\u00dc\u0005\t\u0000\u0000\u00dc\u00dd\u0005"+
		"=\u0000\u0000\u00dd\u00de\u0005\u0005\u0000\u0000\u00de\u00e3\u00038\u001c"+
		"\u0000\u00df\u00e0\u0005\u0007\u0000\u0000\u00e0\u00e2\u00038\u001c\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0006\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ba\u0001\u0000\u0000\u0000\u00e8\u00be\u0001\u0000\u0000\u0000"+
		"\u00e8\u00c8\u0001\u0000\u0000\u0000\u00e8\u00ce\u0001\u0000\u0000\u0000"+
		"\u00e8\u00da\u0001\u0000\u0000\u0000\u00e9\u0019\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005=\u0000\u0000\u00eb\u00ec\u0005\f\u0000\u0000\u00ec"+
		"\u010a\u00038\u001c\u0000\u00ed\u00ee\u0005=\u0000\u0000\u00ee\u00ef\u0005"+
		"\u0005\u0000\u0000\u00ef\u00f0\u0005\u000f\u0000\u0000\u00f0\u00f1\u0005"+
		"\u0007\u0000\u0000\u00f1\u00f2\u0005\u000f\u0000\u0000\u00f2\u00f3\u0005"+
		"\u0006\u0000\u0000\u00f3\u00f7\u0005\f\u0000\u0000\u00f4\u00f6\u00038"+
		"\u001c\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u010a\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0005=\u0000\u0000\u00fb\u00fc\u0005\u0005\u0000"+
		"\u0000\u00fc\u00fd\u0005\u000f\u0000\u0000\u00fd\u00fe\u0005\u0006\u0000"+
		"\u0000\u00fe\u0102\u0005\f\u0000\u0000\u00ff\u0101\u00038\u001c\u0000"+
		"\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u010a\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0005=\u0000\u0000\u0106\u0107\u0005\u0005\u0000\u0000\u0107"+
		"\u0108\u00059\u0000\u0000\u0108\u010a\u0005\u0006\u0000\u0000\u0109\u00ea"+
		"\u0001\u0000\u0000\u0000\u0109\u00ed\u0001\u0000\u0000\u0000\u0109\u00fa"+
		"\u0001\u0000\u0000\u0000\u0109\u0105\u0001\u0000\u0000\u0000\u010a\u001b"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0010\u0000\u0000\u010c\u010d"+
		"\u0005\u0005\u0000\u0000\u010d\u010e\u00038\u001c\u0000\u010e\u010f\u0005"+
		"\u0006\u0000\u0000\u010f\u0113\u0005\u0011\u0000\u0000\u0110\u0112\u0003"+
		"2\u0019\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000"+
		"\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000"+
		"\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0005\u0003\u0000\u0000\u0117\u0118\u0005\u0010"+
		"\u0000\u0000\u0118\u013d\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0010"+
		"\u0000\u0000\u011a\u011b\u0005\u0005\u0000\u0000\u011b\u011c\u00038\u001c"+
		"\u0000\u011c\u011d\u0005\u0006\u0000\u0000\u011d\u0121\u0005\u0011\u0000"+
		"\u0000\u011e\u0120\u00032\u0019\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0128\u0005\u0012\u0000\u0000"+
		"\u0125\u0127\u00034\u001a\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0003\u0000\u0000\u012c"+
		"\u012d\u0005\u0010\u0000\u0000\u012d\u013d\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0005\u0010\u0000\u0000\u012f\u0130\u0005\u0005\u0000\u0000\u0130"+
		"\u0131\u00038\u001c\u0000\u0131\u0132\u0005\u0006\u0000\u0000\u0132\u0136"+
		"\u0005\u0011\u0000\u0000\u0133\u0135\u00032\u0019\u0000\u0134\u0133\u0001"+
		"\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001"+
		"\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0005"+
		"\u0012\u0000\u0000\u013a\u013b\u0003\u001c\u000e\u0000\u013b\u013d\u0001"+
		"\u0000\u0000\u0000\u013c\u010b\u0001\u0000\u0000\u0000\u013c\u0119\u0001"+
		"\u0000\u0000\u0000\u013c\u012e\u0001\u0000\u0000\u0000\u013d\u001d\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0005\u0013\u0000\u0000\u013f\u0140\u0005"+
		"=\u0000\u0000\u0140\u0141\u0005\f\u0000\u0000\u0141\u0142\u00038\u001c"+
		"\u0000\u0142\u0143\u0005\u0007\u0000\u0000\u0143\u0144\u00038\u001c\u0000"+
		"\u0144\u0145\u0005\u0007\u0000\u0000\u0145\u0149\u00038\u001c\u0000\u0146"+
		"\u0148\u00032\u0019\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b"+
		"\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u0003\u0000\u0000\u014d\u014e"+
		"\u0005\u0013\u0000\u0000\u014e\u015f\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0005\u0013\u0000\u0000\u0150\u0151\u0005=\u0000\u0000\u0151\u0152\u0005"+
		"\f\u0000\u0000\u0152\u0153\u00038\u001c\u0000\u0153\u0154\u0005\u0007"+
		"\u0000\u0000\u0154\u0158\u00038\u001c\u0000\u0155\u0157\u00032\u0019\u0000"+
		"\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0005\u0003\u0000\u0000\u015c\u015d\u0005\u0013\u0000\u0000"+
		"\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u013e\u0001\u0000\u0000\u0000"+
		"\u015e\u014f\u0001\u0000\u0000\u0000\u015f\u001f\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0005\u0013\u0000\u0000\u0161\u0162\u0005\u0014\u0000\u0000"+
		"\u0162\u0166\u0005\u0005\u0000\u0000\u0163\u0165\u00038\u001c\u0000\u0164"+
		"\u0163\u0001\u0000\u0000\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166"+
		"\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167"+
		"\u0169\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169"+
		"\u016d\u0005\u0006\u0000\u0000\u016a\u016c\u00032\u0019\u0000\u016b\u016a"+
		"\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0170"+
		"\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0005\u0003\u0000\u0000\u0171\u0172\u0005\u0013\u0000\u0000\u0172!\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0005\u0015\u0000\u0000\u0174\u0178\u0005"+
		"=\u0000\u0000\u0175\u0176\u0005\u0016\u0000\u0000\u0176\u0178\u0005=\u0000"+
		"\u0000\u0177\u0173\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000"+
		"\u0000\u0178#\u0001\u0000\u0000\u0000\u0179\u017a\u0005=\u0000\u0000\u017a"+
		"\u017b\u0005\u000f\u0000\u0000\u017b\u017c\u0003\u001e\u000f\u0000\u017c"+
		"\u017d\u0005=\u0000\u0000\u017d%\u0001\u0000\u0000\u0000\u017e\u017f\u0003"+
		"6\u001b\u0000\u017f\u0180\u0005\u0007\u0000\u0000\u0180\u0181\u0005\u0017"+
		"\u0000\u0000\u0181\u0182\u0005\u0005\u0000\u0000\u0182\u0183\u00038\u001c"+
		"\u0000\u0183\u0184\u0005\u0006\u0000\u0000\u0184\u0185\u0005\t\u0000\u0000"+
		"\u0185\u0186\u0005=\u0000\u0000\u0186\u01b7\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u00036\u001b\u0000\u0188\u0189\u0005\t\u0000\u0000\u0189\u018a"+
		"\u0005=\u0000\u0000\u018a\u018b\u0005\u0005\u0000\u0000\u018b\u018c\u0003"+
		"8\u001c\u0000\u018c\u018d\u0005\u0006\u0000\u0000\u018d\u01b7\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u00036\u001b\u0000\u018f\u0190\u0005\u0007\u0000"+
		"\u0000\u0190\u0191\u0005\u0017\u0000\u0000\u0191\u0192\u0005\u0005\u0000"+
		"\u0000\u0192\u0193\u00038\u001c\u0000\u0193\u0194\u0005\u0007\u0000\u0000"+
		"\u0194\u0195\u00038\u001c\u0000\u0195\u0196\u0005\u0006\u0000\u0000\u0196"+
		"\u0197\u0005\t\u0000\u0000\u0197\u0198\u0005=\u0000\u0000\u0198\u01b7"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u00036\u001b\u0000\u019a\u019b\u0005"+
		"\t\u0000\u0000\u019b\u019c\u0005=\u0000\u0000\u019c\u019d\u0005\u0005"+
		"\u0000\u0000\u019d\u019e\u00038\u001c\u0000\u019e\u019f\u0005\u0007\u0000"+
		"\u0000\u019f\u01a0\u00038\u001c\u0000\u01a0\u01a1\u0005\u0006\u0000\u0000"+
		"\u01a1\u01b7\u0001\u0000\u0000\u0000\u01a2\u01a3\u00036\u001b\u0000\u01a3"+
		"\u01a4\u0005\u0007\u0000\u0000\u01a4\u01a5\u0005\u0018\u0000\u0000\u01a5"+
		"\u01a6\u0005\t\u0000\u0000\u01a6\u01a7\u0005=\u0000\u0000\u01a7\u01a8"+
		"\u0005\u0005\u0000\u0000\u01a8\u01a9\u0005\u000f\u0000\u0000\u01a9\u01aa"+
		"\u0005\u0006\u0000\u0000\u01aa\u01b7\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u00036\u001b\u0000\u01ac\u01ad\u0005\u0007\u0000\u0000\u01ad\u01ae\u0005"+
		"\u0018\u0000\u0000\u01ae\u01af\u0005\t\u0000\u0000\u01af\u01b0\u0005="+
		"\u0000\u0000\u01b0\u01b1\u0005\u0005\u0000\u0000\u01b1\u01b2\u0005\u000f"+
		"\u0000\u0000\u01b2\u01b3\u0005\u0007\u0000\u0000\u01b3\u01b4\u0005\u000f"+
		"\u0000\u0000\u01b4\u01b5\u0005\u0006\u0000\u0000\u01b5\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b6\u017e\u0001\u0000\u0000\u0000\u01b6\u0187\u0001\u0000"+
		"\u0000\u0000\u01b6\u018e\u0001\u0000\u0000\u0000\u01b6\u0199\u0001\u0000"+
		"\u0000\u0000\u01b6\u01a2\u0001\u0000\u0000\u0000\u01b6\u01ab\u0001\u0000"+
		"\u0000\u0000\u01b7\'\u0001\u0000\u0000\u0000\u01b8\u01b9\u00036\u001b"+
		"\u0000\u01b9\u01ba\u0005\t\u0000\u0000\u01ba\u01bb\u0003\u001a\r\u0000"+
		"\u01bb\u01f2\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005=\u0000\u0000\u01bd"+
		"\u01be\u0005\f\u0000\u0000\u01be\u01bf\u0005\u0005\u0000\u0000\u01bf\u01c0"+
		"\u0005\u0019\u0000\u0000\u01c0\u01c5\u00038\u001c\u0000\u01c1\u01c2\u0005"+
		"\u0007\u0000\u0000\u01c2\u01c4\u00038\u001c\u0000\u01c3\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\u0019"+
		"\u0000\u0000\u01c9\u01ca\u0005\u0006\u0000\u0000\u01ca\u01f2\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0005=\u0000\u0000\u01cc\u01cd\u0005\u001a\u0000"+
		"\u0000\u01cd\u01ce\u00038\u001c\u0000\u01ce\u01cf\u0005\u001b\u0000\u0000"+
		"\u01cf\u01d0\u0005\f\u0000\u0000\u01d0\u01d1\u00038\u001c\u0000\u01d1"+
		"\u01f2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005=\u0000\u0000\u01d3\u01d4"+
		"\u0005\u001a\u0000\u0000\u01d4\u01d5\u00038\u001c\u0000\u01d5\u01d6\u0005"+
		"\u0007\u0000\u0000\u01d6\u01d7\u00038\u001c\u0000\u01d7\u01d8\u0005\u001b"+
		"\u0000\u0000\u01d8\u01d9\u0005\f\u0000\u0000\u01d9\u01da\u00038\u001c"+
		"\u0000\u01da\u01f2\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u001c\u0000"+
		"\u0000\u01dc\u01dd\u0005\u0005\u0000\u0000\u01dd\u01de\u0005=\u0000\u0000"+
		"\u01de\u01df\u0005\u0005\u0000\u0000\u01df\u01e0\u00038\u001c\u0000\u01e0"+
		"\u01e1\u0005\u0006\u0000\u0000\u01e1\u01e2\u0005\u0006\u0000\u0000\u01e2"+
		"\u01f2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\u001c\u0000\u0000\u01e4"+
		"\u01e5\u0005\u0005\u0000\u0000\u01e5\u01e6\u0005=\u0000\u0000\u01e6\u01e7"+
		"\u0005\u0005\u0000\u0000\u01e7\u01e8\u00038\u001c\u0000\u01e8\u01e9\u0005"+
		"\u0007\u0000\u0000\u01e9\u01ea\u00038\u001c\u0000\u01ea\u01eb\u0005\u0006"+
		"\u0000\u0000\u01eb\u01ec\u0005\u0006\u0000\u0000\u01ec\u01f2\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0005\u001d\u0000\u0000\u01ee\u01ef\u0005\u0005"+
		"\u0000\u0000\u01ef\u01f0\u0005=\u0000\u0000\u01f0\u01f2\u0005\u0006\u0000"+
		"\u0000\u01f1\u01b8\u0001\u0000\u0000\u0000\u01f1\u01bc\u0001\u0000\u0000"+
		"\u0000\u01f1\u01cb\u0001\u0000\u0000\u0000\u01f1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01f1\u01db\u0001\u0000\u0000\u0000\u01f1\u01e3\u0001\u0000\u0000"+
		"\u0000\u01f1\u01ed\u0001\u0000\u0000\u0000\u01f2)\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0005\u001e\u0000\u0000\u01f4\u01f5\u0005=\u0000\u0000\u01f5"+
		"\u01f6\u0005\u0005\u0000\u0000\u01f6\u01f7\u0003.\u0017\u0000\u01f7\u01f8"+
		"\u0005\u0006\u0000\u0000\u01f8+\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005"+
		"\u001e\u0000\u0000\u01fa\u01fb\u0005=\u0000\u0000\u01fb\u01fc\u0005\u0005"+
		"\u0000\u0000\u01fc\u01fd\u0005\u0006\u0000\u0000\u01fd-\u0001\u0000\u0000"+
		"\u0000\u01fe\u0203\u00038\u001c\u0000\u01ff\u0200\u0005\u0007\u0000\u0000"+
		"\u0200\u0202\u00038\u001c\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202"+
		"\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0001\u0000\u0000\u0000\u0204/\u0001\u0000\u0000\u0000\u0205\u0203"+
		"\u0001\u0000\u0000\u0000\u0206\u020a\u00032\u0019\u0000\u0207\u0209\u0003"+
		"2\u0019\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000"+
		"\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b1\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020d\u021b\u0003\u0016\u000b\u0000\u020e\u021b\u0003\u0018\f\u0000"+
		"\u020f\u021b\u0003\u001a\r\u0000\u0210\u021b\u0003&\u0013\u0000\u0211"+
		"\u021b\u0003(\u0014\u0000\u0212\u021b\u0003\u001c\u000e\u0000\u0213\u021b"+
		"\u0003\u001e\u000f\u0000\u0214\u021b\u0003 \u0010\u0000\u0215\u021b\u0003"+
		"\"\u0011\u0000\u0216\u021b\u0007\u0000\u0000\u0000\u0217\u021b\u0003$"+
		"\u0012\u0000\u0218\u021b\u0003*\u0015\u0000\u0219\u021b\u0003,\u0016\u0000"+
		"\u021a\u020d\u0001\u0000\u0000\u0000\u021a\u020e\u0001\u0000\u0000\u0000"+
		"\u021a\u020f\u0001\u0000\u0000\u0000\u021a\u0210\u0001\u0000\u0000\u0000"+
		"\u021a\u0211\u0001\u0000\u0000\u0000\u021a\u0212\u0001\u0000\u0000\u0000"+
		"\u021a\u0213\u0001\u0000\u0000\u0000\u021a\u0214\u0001\u0000\u0000\u0000"+
		"\u021a\u0215\u0001\u0000\u0000\u0000\u021a\u0216\u0001\u0000\u0000\u0000"+
		"\u021a\u0217\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000"+
		"\u021a\u0219\u0001\u0000\u0000\u0000\u021b3\u0001\u0000\u0000\u0000\u021c"+
		"\u022a\u0003\u0016\u000b\u0000\u021d\u022a\u0003\u0018\f\u0000\u021e\u022a"+
		"\u0003\u001a\r\u0000\u021f\u022a\u0003&\u0013\u0000\u0220\u022a\u0003"+
		"(\u0014\u0000\u0221\u022a\u0003\u001c\u000e\u0000\u0222\u022a\u0003\u001e"+
		"\u000f\u0000\u0223\u022a\u0003 \u0010\u0000\u0224\u022a\u0003\"\u0011"+
		"\u0000\u0225\u022a\u0007\u0000\u0000\u0000\u0226\u022a\u0003$\u0012\u0000"+
		"\u0227\u022a\u0003*\u0015\u0000\u0228\u022a\u0003,\u0016\u0000\u0229\u021c"+
		"\u0001\u0000\u0000\u0000\u0229\u021d\u0001\u0000\u0000\u0000\u0229\u021e"+
		"\u0001\u0000\u0000\u0000\u0229\u021f\u0001\u0000\u0000\u0000\u0229\u0220"+
		"\u0001\u0000\u0000\u0000\u0229\u0221\u0001\u0000\u0000\u0000\u0229\u0222"+
		"\u0001\u0000\u0000\u0000\u0229\u0223\u0001\u0000\u0000\u0000\u0229\u0224"+
		"\u0001\u0000\u0000\u0000\u0229\u0225\u0001\u0000\u0000\u0000\u0229\u0226"+
		"\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u0228"+
		"\u0001\u0000\u0000\u0000\u022a5\u0001\u0000\u0000\u0000\u022b\u022c\u0007"+
		"\u0001\u0000\u0000\u022c7\u0001\u0000\u0000\u0000\u022d\u022e\u0006\u001c"+
		"\uffff\uffff\u0000\u022e\u022f\u00055\u0000\u0000\u022f\u0254\u00038\u001c"+
		"\u000e\u0230\u0231\u0005\u0005\u0000\u0000\u0231\u0232\u00038\u001c\u0000"+
		"\u0232\u0233\u0005\u0006\u0000\u0000\u0233\u0254\u0001\u0000\u0000\u0000"+
		"\u0234\u0254\u0005:\u0000\u0000\u0235\u0254\u00059\u0000\u0000\u0236\u0254"+
		"\u0005;\u0000\u0000\u0237\u0254\u0005<\u0000\u0000\u0238\u0254\u0005="+
		"\u0000\u0000\u0239\u0254\u00056\u0000\u0000\u023a\u0254\u00057\u0000\u0000"+
		"\u023b\u023c\u0005=\u0000\u0000\u023c\u023d\u0005\u0005\u0000\u0000\u023d"+
		"\u023e\u0003\u0014\n\u0000\u023e\u023f\u0005\u0006\u0000\u0000\u023f\u0254"+
		"\u0001\u0000\u0000\u0000\u0240\u0241\u0005=\u0000\u0000\u0241\u0242\u0005"+
		"\u0005\u0000\u0000\u0242\u0254\u0005\u0006\u0000\u0000\u0243\u0244\u0005"+
		"8\u0000\u0000\u0244\u0245\u0005\u0005\u0000\u0000\u0245\u0246\u0005=\u0000"+
		"\u0000\u0246\u0254\u0005\u0006\u0000\u0000\u0247\u0248\u0005=\u0000\u0000"+
		"\u0248\u0249\u0005\u001a\u0000\u0000\u0249\u024a\u00038\u001c\u0000\u024a"+
		"\u024b\u0005\u001b\u0000\u0000\u024b\u0254\u0001\u0000\u0000\u0000\u024c"+
		"\u024d\u0005=\u0000\u0000\u024d\u024e\u0005\u001a\u0000\u0000\u024e\u024f"+
		"\u00038\u001c\u0000\u024f\u0250\u0005\u0007\u0000\u0000\u0250\u0251\u0003"+
		"8\u001c\u0000\u0251\u0252\u0005\u001b\u0000\u0000\u0252\u0254\u0001\u0000"+
		"\u0000\u0000\u0253\u022d\u0001\u0000\u0000\u0000\u0253\u0230\u0001\u0000"+
		"\u0000\u0000\u0253\u0234\u0001\u0000\u0000\u0000\u0253\u0235\u0001\u0000"+
		"\u0000\u0000\u0253\u0236\u0001\u0000\u0000\u0000\u0253\u0237\u0001\u0000"+
		"\u0000\u0000\u0253\u0238\u0001\u0000\u0000\u0000\u0253\u0239\u0001\u0000"+
		"\u0000\u0000\u0253\u023a\u0001\u0000\u0000\u0000\u0253\u023b\u0001\u0000"+
		"\u0000\u0000\u0253\u0240\u0001\u0000\u0000\u0000\u0253\u0243\u0001\u0000"+
		"\u0000\u0000\u0253\u0247\u0001\u0000\u0000\u0000\u0253\u024c\u0001\u0000"+
		"\u0000\u0000\u0254\u0266\u0001\u0000\u0000\u0000\u0255\u0256\n\u0013\u0000"+
		"\u0000\u0256\u0257\u0005$\u0000\u0000\u0257\u0265\u00038\u001c\u0014\u0258"+
		"\u0259\n\u0012\u0000\u0000\u0259\u025a\u0007\u0002\u0000\u0000\u025a\u0265"+
		"\u00038\u001c\u0013\u025b\u025c\n\u0011\u0000\u0000\u025c\u025d\u0007"+
		"\u0003\u0000\u0000\u025d\u0265\u00038\u001c\u0012\u025e\u025f\n\u0010"+
		"\u0000\u0000\u025f\u0260\u0007\u0004\u0000\u0000\u0260\u0265\u00038\u001c"+
		"\u0011\u0261\u0262\n\u000f\u0000\u0000\u0262\u0263\u0007\u0005\u0000\u0000"+
		"\u0263\u0265\u00038\u001c\u0010\u0264\u0255\u0001\u0000\u0000\u0000\u0264"+
		"\u0258\u0001\u0000\u0000\u0000\u0264\u025b\u0001\u0000\u0000\u0000\u0264"+
		"\u025e\u0001\u0000\u0000\u0000\u0264\u0261\u0001\u0000\u0000\u0000\u0265"+
		"\u0268\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266"+
		"\u0267\u0001\u0000\u0000\u0000\u02679\u0001\u0000\u0000\u0000\u0268\u0266"+
		"\u0001\u0000\u0000\u0000!@Ru\u00ac\u00b7\u00c5\u00d7\u00e3\u00e8\u00f7"+
		"\u0102\u0109\u0113\u0121\u0128\u0136\u013c\u0149\u0158\u015e\u0166\u016d"+
		"\u0177\u01b6\u01c5\u01f1\u0203\u020a\u021a\u0229\u0253\u0264\u0266";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}