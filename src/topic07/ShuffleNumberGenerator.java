package topic07;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleNumberGenerator {

    private final int min;
    private final int max;
    private ArrayList<Integer> numbers;

    public ShuffleNumberGenerator(int min, int max){
        this.min = min;
        this.max = max;

        int size = max-min+1;
        //initialize an arraylist
        numbers = new ArrayList<>(size);

        //add numbers from min to max
        for(int i = 0; i < size; i++)
            numbers.add(min + i);

        //shuffle list
        Collections.shuffle(numbers);
    }

    public int getNext() throws Exception {

        //get last number in the list
        //remove last number
        //return last number
        return -1;
    }
}