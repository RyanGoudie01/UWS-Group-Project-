import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Teams {

    static void displayTeams() {
        String line = "";
        String splitBy = ",";
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("List_Of_Teams.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] teams = line.split(splitBy);    // use comma as separator
                System.out.println("Team = " + teams[0] + " , Group = " + teams[1]);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }


    }
}
