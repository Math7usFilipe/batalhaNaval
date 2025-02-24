public class SimpleDotCom {

    int[] locationCells;
    boolean[] hitStatus;
    int numOfHits = 0;


    public void setLocationCells(int[] locs) {
        locationCells = locs;
        hitStatus = new boolean[locs.length];
    }

    public String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int i = 0; i < locationCells.length; i++) {
            if(!hitStatus[i] && guess == locationCells[i]){
                result = "hit";
                hitStatus[i] = true;
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);

        return result;
    }
}