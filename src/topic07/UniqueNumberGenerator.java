package topic07;

import java.util.HashSet;
import java.util.Random;

public class UniqueNumberGenerator implements IGenerateNumber, IResetable {

    private int min, max;
    private HashSet<Integer> sentinel;

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
                bContinue = false;
            }
        }while(bContinue);

        return randInt;
    }

    public UniqueNumberGenerator(){
        this.min = min;
        this.max = max;
    }



    @Override
    public void reset() {

    }
}
