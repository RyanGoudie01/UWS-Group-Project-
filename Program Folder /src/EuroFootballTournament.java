public class EuroFootballTournament{

    public static void main (String args[] ) {
        Integer option;
        do {
            System.out.println("--- Euro 2021 Tournament ---");
            System.out.println("1: Display Teams");
            System.out.println("2: Display Fixtures");
            System.out.println("3: Simulate Matches");
            System.out.println("4: Next MatchDay");
            System.out.println("5 : Quit");
            option = Input.getInteger("option: ");
            switch (option) {
                case 1:
                    Teams.displayTeams();
                    break;
                case 2:
                    Fixtures.displayFixtures();
                    break;
                case 5:
                    System.out.println("quitting program");
                    System.exit(0);
                    break;
            }

        }while (option != 0) ;
    }
}






