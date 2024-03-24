public class FootballMatchReports {
    public static String onField(int shirtNum) {
        String[] playerDescriptions = {"goalie","left back","center back","right back","midfielder","left wing","striker","right wing"};
        String returnString = "";
        switch (shirtNum) {
            case 1 -> returnString = playerDescriptions[0];
            case 2 -> returnString = playerDescriptions[1];
            case 3, 4 -> returnString = playerDescriptions[2];
            case 5 -> returnString = playerDescriptions[3];
            case 6, 7, 8 -> returnString = playerDescriptions[4];
            case 9 -> returnString = playerDescriptions[5];
            case 10 -> returnString = playerDescriptions[6];
            case 11 -> returnString = playerDescriptions[7];
        }
        return returnString;
    }
}
