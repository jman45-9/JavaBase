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
        for(int iii = 0; iii < queryArray.length; iii++)
            queryArray[iii] = (queryArray[iii].trim()).toUpperCase();
        queryArray = removeBlanks(queryArray);
        return queryArray;
    }

    private String[] removeBlanks(String[] input) {
        String[] preOutput = new String[input.length];
        int jjj = 0;
        for(int iii = 0; iii < input.length; iii++) {
            if (input[iii].length() != 0) {
                preOutput[jjj] = input[iii];
                jjj++;
            }
        }

        int counter = 0;
        while (counter < preOutput.length) {
            if (preOutput[counter] == null) 
                break;
            counter++;
        }

        String[] output = new String[counter];
        for (int iii = 0; iii < output.length; iii++)
            output[iii] = preOutput[iii];

        return output;
    }
}
