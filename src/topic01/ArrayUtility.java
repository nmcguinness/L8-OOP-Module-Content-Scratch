package topic01;

public class ArrayUtility
{
    //create a printArray(int[] array) method that prints an array
    public static void print(String header, int[] data){
        System.out.println(header);
        for(int i = 0; i < data.length; i++)
            System.out.println(data[i]);
    }

    //create a printArray method that prints an array backwards or forwards
    public static void print(String header, int[] data, PrintDirection direction)
    {
        if(direction == PrintDirection.Forward){ //forwards
            print(header, data);
        }
        else {  //backwards
            System.out.println(header);
            for(int i = data.length-1; i >= 0; i--)
                System.out.println(data[i]);
        }
    }

    //A

    //write a method to compare two arrays of ints and return index of first difference
    //(1,2,3,4) with (1,2,5,3) = index is 2
    public static int findFirstDifference(int[] first, int[] second)
    {
        //defensive programming (a guard clause is an example of this)
        if(first == null || second == null)
            return -1;
        if(first.length == 0 && second.length == 0)   //(4,5,6) and (5,8,9) = index is 0
            return -1;
        if(first.length != second.length)
            return -1;

        for(int i = 0; i < first.length; i++)
        {
            if(first[i] != second[i])
                return i;
        }

        //if same, what do we return?
        return -1;
    }

    //write a method to see if one array is the reverse of the other array
    public static int compareReverse(int[] first, int[] second)
    {
        //defensive programming (a guard clause is an example of this)
        if(first == null || second == null)
            return -1;
        if(first.length == 0 && second.length == 0)   //(4,5,6) and (5,8,9) = index is 0
            return -1;
        if(first.length != second.length)
            return -1;

        int j = second.length - 1;

        for(int i = 0; i < first.length; i++)  //0...length-1
        {
            //if(first[i] == second[second.length - 1 - i])
            if(first[i] != second[j])
                return i;
            j--;
        }

        return -1;
    }
    //B

    //write a method to get the sum of values

    //write a method to get the mean (average) of values

    //write a method to get the standard deviation of values
}
