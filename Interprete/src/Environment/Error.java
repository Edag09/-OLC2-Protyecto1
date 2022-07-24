package Environment;

public class Error {
    public int row;
    public int column;
    public String description;
    public TypeError typeError;

    public enum TypeError{
        Lexico,
        Syntactic,
        Semantic
    }

    public Error(int row, int column, String description, TypeError typeError) {
        this.row = row;
        this.column = column;
        this.description = description;
        this.typeError = typeError;
    }

    public String toString(){
        return "<TR><TD>" + (row < 0 ? "FILA" : row) + "</TD>" +
                "<TD>" + (column < 0 ? "COLUMNA" : column) + "</TD>" +
                "<TD>" + description + "</TD>" +
                "<TD>" + (typeError == null ? "TIPO DE ERROR" : typeError) + "</TD></TR>";

    }
}
