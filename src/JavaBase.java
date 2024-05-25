import java.util.Arrays;

public class JavaBase {
    public static void main(String[] args) {
        Database testData = new Database(null);
        String[] fields = {"hi", "foo", "bar"};
        Table testTable = new Table(fields, "test");

        testData.newTable(testTable);

        testTable = testData.getTables()[0];
        System.err.println(testTable.getTitle());
        
    }
}