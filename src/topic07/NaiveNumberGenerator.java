package topic07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NaiveNumberGenerator {

    private final int min;
    private final int max;
    private List<Integer> history;

    public NaiveNumberGenerator(int min, int max){
        this.min = min;
        this.max = max;
        this.history = new ArrayList<>();
    }

    public int getNext(){
        Random rand = new Random();

        boolean bExists = false;

        do {
            int randInt = rand.nextInt(min, max);
            for (int n : history) {
                if (n == randInt) {
                    bExists = true;
                    continue;
                }
            }
            bExists = false;
            history.add(randInt);
        }while(bExists);


        //generate a random integer, nextInt()
        //iterate across the list and see if we have this number
        //repeat generation until we dont have the number in the list i.e. its unique
        //do...
        //while...
    }
}
