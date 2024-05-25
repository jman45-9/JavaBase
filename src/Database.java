public class Database {
    private Table[] tables;

    public Table[] getTables() {
        return tables;
    }

    public Database(Table[] tables) {
        this.tables = tables;
    }

    public void newTable(String[] fields, String title) {
        newTable(new Table(fields, title));

    }

    public void newTable(Table newTable) {
        Table[] newTables = new Table[tables!=null ? tables.length : 1];
        for(int iii = 0; iii < (tables!=null?tables.length:0); iii++)
            newTables[iii] = tables[iii];
        tables = newTables;
        tables[tables.length-1] = newTable;
    }

    public String[] query(String queryString) {
        String[] queryArray = queryString.split("[\s\\n\\t]");

        return queryArray;
    }
}
