package topic07;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleNumberGenerator implements IGenerateNumber {

    private final int min;
    private final int max;
    private final int size;
    private ArrayList<Integer> numbers;

    public ShuffleNumberGenerator(int min, int max){
        this.min = min;
        this.max = max;
        this.size = max-min+1;

        //intialize the list
        initialize();
    }

    public int getNext() throws Exception {

        if(numbers != null && numbers.size() == 0)
            throw new Exception("All numbers generated, please call reset!");

        //return last number
        return numbers.removeLast();
    }

    private void initialize(){
        //initialize an arraylist
        numbers = new ArrayList<>(size);

        reset();
    }

    public void reset() {

        //defensive coding
        if(numbers == null)
            return;

        //clear list just in case its not empty
        numbers.clear();

        //add numbers from min to max
        for(int i = 0; i < size; i++)
            numbers.add(min + i);

        //shuffle list
        Collections.shuffle(numbers);
    }
}