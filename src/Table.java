public class Table {
    private String[][] table;
    private String title;

    public String[][] getTable() {
        return table;

    }

    public String getTitle() {
        return title;
    }

    public String[] getFields() {
        return table[0];
    }

    public String[] getRow(int row) {
        return table[row];
    }

    public String[] getColumn(int columnNum) {
        String[] column = new String[table.length];
        for(int iii = 0; iii < table.length; iii++) {
            column[iii] = table[iii][columnNum];
        }
        return column;
    }

    public Table(String[][] table, String title) {
        this.table = table;
        this.title = title;
    }

    public Table(String[] fields, String title) {
        table = new String[1][fields.length];
        table[0] = fields;
        this.title = title;
    }

    public void addRow(String[] newRow) {
        String[][] newTable = new String[this.table.length+1][this.table[0].length];
        for(int iii = 0; iii < table.length; iii++)
            newTable[iii] = table[iii];
        newTable[newTable.length-1] = newRow;
        table = newTable;
    }
} 