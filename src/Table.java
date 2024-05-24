public class Table {
    private String[][] table;

    public String[][] getTable() {
        return table;
    }

    public Table(String[][] table) {
        this.table = table;
    }

    public Table(String[] fields) {
        table = new String[1][fields.length];
        table[0] = fields;
    }

    public String[] getFields() {
        return table[0];
    }
} 