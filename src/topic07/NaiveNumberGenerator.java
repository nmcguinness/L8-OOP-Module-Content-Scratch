package topic07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NaiveNumberGenerator implements IGenerateNumber, IResetable
{
    private Random rand;
    private final int min;
    private final int max;
    private List<Integer> history;

    public NaiveNumberGenerator(int min, int max){

        //defensive coding
        if(max < min)
            throw new IllegalArgumentException("max must be <= min");

        this.max = max;
        this.min = min;
        this.history = new ArrayList<>();

        //initialize random number system
        this.rand = new Random(System.nanoTime());
    }

    public void reset(){
        if(history.size() != 0)
            history.clear();
    }

    public int getNext() throws Exception {

        if(history.size() == ((max - min) + 1))
            throw new Exception("We have run out of numbers!");



        boolean bExists = false;
        int randInt = 0;
        do {
            bExists = false;
            randInt = rand.nextInt(min, max+1);
            for (int n : history) {
                if (n == randInt) {
                    bExists = true;
                    break;
                }
            }
        }while(bExists);
        history.add(randInt);
        return randInt;
    }

    @Override
    public void display() {
        for(int n : history)
            System.out.println(n);
    }

}
