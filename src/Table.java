public class Table {
    private String[][] table;

    public String[][] getTable() {
        return table;

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

    public Table(String[][] table) {
        this.table = table;
    }

    public Table(String[] fields) {
        table = new String[1][fields.length];
        table[0] = fields;
    }



    public void addRow(String[] newRow) {
        String[][] newTable = new String[this.table.length+1][this.table[0].length];
        for(int iii = 0; iii < table.length; iii++)
            newTable[iii] = table[iii];
        newTable[newTable.length-1] = newRow;
        table = newTable;
    }
} 