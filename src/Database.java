import java.io.File;

public class Database {

    public Database(String csvPath) {
        File csv = new File(csvPath);
        if (!csv.exists()) {
            System.out.println("CSV file does not exist. FATAL_ERROR EXITING.");
            System.exit(1);
        }

    }

    private void initDatabase(File csv) {
        
    }
    
}
