import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class EuroFootballTournament{

    public static void main (String args[] ) throws IOException {
        Integer option;
        do {
            final Fixtures fixtures= new Fixtures(readFile());
            System.out.println("--- Euro 2021 Tournament ---");
            System.out.println("1: Display Teams");
            System.out.println("2: Display Fixtures");
            System.out.println("3: Simulate Tournament");
            System.out.println("4: Quit");
            option = Input.getInteger("Option: ");
            switch (option) {
                case 1:
                    Teams.displayTeams();
                    break;
                case 2:
                    fixtures.displayFixtures();
                    break;
                case 3:
                    fixtures.simulateMatches();
                    break;
                case 4:
                    System.out.println("Quitting Program");
                    System.out.println("Thank You For Using our Euro Tournament Simulator !");
                    System.exit(0);
                    break;
            }

        }while (option != 0) ;

    }

    private static String[] readFile() throws IOException {
        final BufferedReader br = new BufferedReader(new FileReader("List_Of_Fixtures.csv"));
        final StringBuilder fixtures = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            fixtures.append(line).append(",");
        }
        final String[] splitFixtures = fixtures.toString().split(",");

        return splitFixtures;
    }
}






