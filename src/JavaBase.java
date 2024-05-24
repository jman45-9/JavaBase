import java.util.Arrays;

public class JavaBase {
    public static void main(String[] args) {
        //Database test = new Database("test.csv");
        
        String[] testFields = {"hi", "foo", "bar"};
        String[] testRow = {"foo", "bob", "like"};

        Table test = new Table(testFields);
        test.addRow(testRow);
        System.err.println(Arrays.deepToString(test.getTable()));
    }
}