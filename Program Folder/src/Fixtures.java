import java.util.Random;

public class Fixtures {

    private final String[]fixtures;

    public Fixtures(String[] fixtures){
        this.fixtures=fixtures;

    }

   public void displayFixtures() {
       for (int i = 0; i < fixtures.length; i += 2) {
           System.out.printf("Fixture - %s vs %s\n" , fixtures[i] , fixtures[i+1] );
       }
    }

    public void simulateMatches(){
        final String[] matches = recurseMatches(fixtures);
        System.out.printf("The winner is %s Who beat %s\n", matches[0] , matches[1]);
    }

    private static String[] recurseMatches(String[] matches) {
        if ( matches.length == 2 ) {
            return matches;
        }
        if (matches.length == 3) {
            return new String[]{matches[0], matches[1]};
        }
        final String[] vacantArr;
        if (matches.length  % 2 != 0) {
            vacantArr = new String[(matches.length / 2) + 1];
            vacantArr[vacantArr.length - 1] = "";
        } else {
            vacantArr = new String[matches.length / 2];
        }
        int count = 0 ;
        final Random random = new Random();
        int goBack = 0;
        if (matches.length % 2 != 0) {
            goBack = 1;
        }
        for (int i = 0; i < matches.length - goBack; i+=2) {
            if (matches[i].equals("")) {
                vacantArr[count] = matches[i+1];
            } else if (matches[i + 1].equals("")) {
                vacantArr[count] = matches[i];
            } else if (random.nextBoolean()) {
                vacantArr[count] =matches[i];
            } else { vacantArr[count] = matches[i+1];
            }
            count++;
        }
        return recurseMatches(vacantArr);
    }
    }

