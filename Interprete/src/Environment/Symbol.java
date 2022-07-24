package Environment;

public class Symbol {
    public String Symbol_type;
    public Object Symbol_value;
    public String Symbol_id;
    public SymbolType SymbolTypes;
    public int Symbol_position;

    public enum SymbolType{
        variable,
        Function,
        Subroutine,
        Params,
        Native,
        Program,
        If_Sentence,
        Array,
        C3D,
        Return
    }

    public Symbol(String id, String symbol_type, Object value, SymbolType type_symbol, int position){
     this.Symbol_id = id;
     this.Symbol_type = symbol_type;
     this.Symbol_value = value;
     this.SymbolTypes = type_symbol;
     this.Symbol_position = position;
    }

    public Symbol(SymbolType types, Object valor, String type){
        this.Symbol_type = type;
        this.Symbol_value = valor;
        this.Symbol_id = "";
        this.SymbolTypes = types;
        this.Symbol_position = -1;
    }
}
