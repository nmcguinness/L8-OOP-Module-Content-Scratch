package topic07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class UniqueNumberGenerator implements IGenerateNumber, IResetable {

    private int min, max;
    private HashSet<Integer> sentinel;
    private ArrayList<Integer> numbers;

    public UniqueNumberGenerator(int min, int max) {
        this.min = min;
        this.max = max;

        numbers = new ArrayList<>(max - min + 1);
        sentinel = new HashSet<>(max - min + 1);
    }

    @Override
    public int getNext() throws Exception {

        //initialize random number system
        Random rand = new Random(System.nanoTime());
        int randInt = 0;
        boolean bContinue = true;
        do{
            //get random number
            randInt = rand.nextInt(min, max + 1);
            //check in sentinel
            if(!sentinel.contains(randInt)){
                sentinel.add(randInt);
                numbers.add(randInt);
                bContinue = false;
            }
        }while(bContinue);

        return randInt;
    }

    @Override
    public void display() {
        for(int n : numbers)
            System.out.println(n);
    }

    public UniqueNumberGenerator(){
        this.min = min;
        this.max = max;
    }



    @Override
    public void reset() {
        //defensive coding
        if(numbers == null)
            return;

        //clear list and the sentinel if it's not empty
        if(!numbers.isEmpty()){
            numbers.clear();
            sentinel.clear();
        }
    }
}
