import topic0.Student;
import topic0.Vector3;


void main() {
    topic0Demo();

    topic1Demo();
}

private void topic1Demo() {

    // Literal (known values now)
    int[] nums = {3, 5, 8};  //nums stores ADDR of first element in an array of integers

    // With length (values default to 0)
    int[] grades =  {1, 2, 3, 4, 5, 6, 7, 8};

    //read
    int v1 = nums[2];
    System.out.println(v1);

    //write
    nums[1] = 6 * nums[2];
    System.out.println(nums[1]);

    //get size
    int l = grades.length;
    System.out.println("Grades array is " + l + " in length");

    //iterate across
    for(int i = 0; i < grades.length; i++) {
        System.out.println(grades[i]);
    }

    //print the array in reverse order
    for(int i = grades.length - 1; i >= 0; i--) {
        System.out.println(grades[i]);
    }

    System.out.println("--------------");

    //print every odd indexed element in the array
    for(int i = 1; i < grades.length; i+=2)
        System.out.println(grades[i]);

    System.out.println("--------------");

    //print contents if multiple of 3 (Hint: use % operator and an if())

    for(int i = 0; i < grades.length; i++) {

        int value = grades[i]; //accessing an array costs TIME so do it once only per loop

        if(value%3 == 0)
            System.out.println(value);
    }

    System.out.println("--------------");

    //make another array of ints, same size as grades, add ints, then compare two arrays
    int[] otherGrades = {1,2,3,4,55555,6,7,8};

    if(grades.length == otherGrades.length)
    {
        for(int i = 0; i < grades.length; i++)
        {
            if(grades[i] != otherGrades[i])
                System.out.println("Different at index " + i);
        }
    }
    else
        System.out.println("Cannot compare two arrays of different length!");

    printArray("Other grades", otherGrades);

    printArray("My nums", nums, true);

    printArray("My nums", nums, false);

}
 //create a printArray(int[] array) method that prints an array
private void printArray(String header, int[] data){
    System.out.println(header);
    for(int i = 0; i < data.length; i++)
        System.out.println(data[i]);
}

//create a printArray method that prints an array backwards or forwards
private void printArray(String header, int[] data, boolean isForwards)
{
    if(isForwards){ //forwards
        printArray(header, data);
    }
    else {  //backwards
        System.out.println(header);
        for(int i = data.length-1; i >= 0; i--)
            System.out.println(data[i]);
    }
}






private void topic0Demo(){
    //region Intro Demo
    System.out.println("Hello World");
    System.out.println("Hello World");

    String day = "Thursday";
    float temp = 12;

    //write code to output
    // "it's chilly this Thursday" if temp < 15
    // "it's not too cold today" if temp >= 15

    String msg = temp >= 15 ? "it's not too cold today" : "it's chilly this " + day;
    System.out.println(msg);
    //endregion

    Vector3 v1 = new Vector3(1,2,3);
    Vector3 v2 = new Vector3(4,5,6);

    double x  = v1.getX();
    v2.setX(x);
    System.out.println(v1);

    // v3 is a variable that can store a topic0.Vector3 but doesnt yet!
    Vector3 v3 = null;

    // this statement (because it ends with semicolon) instantiates a new topic0.Vector3 in RAM
    // and assigns its address to the variable v3
    v3 = new Vector3(5,6,7);
    System.out.println(v3);

    Vector3 v4 = v1;
    System.out.println(v4.getX());
    v4 = null;

    Student s1  = new Student();
    Student s2 = new Student("jane", (byte)55);

}
