public class JavaBase {
    public static void main(String[] args) {
        //Database test = new Database("test.csv");
        
        String[] testFields = {"hi", "foo", "bar"};

        Table test = new Table(testFields);
        System.err.println(test.getFields()[0]);

    }
}