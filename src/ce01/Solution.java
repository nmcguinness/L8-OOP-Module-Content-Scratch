package ce01;

import java.util.ArrayList;

public class Solution {

    public void execute(){
        //step 1 - load the data
        ArrayList<String> licencePlateList = FileUtils.readDelimitedFile("ce01_data.txt", ',');

        //step 2 - show the data
        System.out.println(licencePlateList);
    }

}
