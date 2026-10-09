package ce01;

import java.util.ArrayList;

public class Solution {

    //only call instance method when we use `new Solution`
    public void execute(){
        //step 1 - load the data
        ArrayList<String> licencePlateList = FileUtils.readDelimitedFile("ce01_data.txt", ',');

        //step 2 - show the data
        System.out.println(licencePlateList);
    }

    //call only using class name and no instance i.e. Solution.executeV2
    public static void executeV2(){
        //step 1 - load the data
        ArrayList<String> licencePlateList = FileUtils.readDelimitedFile("ce01_data.txt", ',');

        //step 2 - show the data
        System.out.println(licencePlateList);
    }

}
