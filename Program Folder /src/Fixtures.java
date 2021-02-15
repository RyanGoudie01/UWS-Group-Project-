import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fixtures {

    static void displayFixtures() {
        String line = "";
        String splitBy = ",";
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("List_Of_Fixtures.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] fixtures = line.split(splitBy);    // use comma as separator
                System.out.println("Fixture = " + fixtures[0] + " VS " + fixtures[1]);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
