package Environment;

public class TableSymbol {
    public int row_table_symbol;
    public int columns_table_symbol;
    public String environment_table_symbol;
    public String name_Table_symbol;
    public String value_Table_symbol;
    public String function_table_symbol;

    public TableSymbol(int row, int columns, String environment, String name, Symbol value, Symbol.SymbolType function) {
        this.row_table_symbol = row;
        this.columns_table_symbol = columns;
        this.environment_table_symbol = environment;
        this.name_Table_symbol = name;
        this.value_Table_symbol = (String)value.Symbol_value;
        this.function_table_symbol = String.valueOf(function);
    }

    @Override
    public String toString(){
        return "<TR><TD>" + (row_table_symbol < 0 ? "FILA" : row_table_symbol) + "</TD>" +
                "<TD>" + (columns_table_symbol < 0 ? "COLUMNA" : columns_table_symbol) + "</TD>" +
                "<TD>" + environment_table_symbol + "</TD>" +
                "<TD>" + value_Table_symbol + "</TD>" +
                "<TD>" + function_table_symbol + "</TD>";
    }
}
