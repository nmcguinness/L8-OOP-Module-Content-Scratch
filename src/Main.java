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
    int[] grades = new int[4]; // {0,0,0,0}

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
