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
        int randInt = 0;
        do {
            randInt = rand.nextInt(min, max);
            for (int n : history) {
                if (n == randInt) {
                    bExists = true;
                    continue;
                }
            }
            bExists = false;
            history.add(randInt);
        }while(bExists);

        return randInt;
    }
}
