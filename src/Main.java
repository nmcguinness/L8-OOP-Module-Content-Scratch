//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

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

    // v3 is a variable that can store a Vector3 but doesnt yet!
    Vector3 v3 = null;

    // this statement (because it ends with semicolon) instantiates a new Vector3 in RAM
    // and assigns its address to the variable v3
    v3 = new Vector3(5,6,7);
    System.out.println(v3);

    Vector3 v4 = v1;
    System.out.println(v4.getX());
    v4 = null;

    Student s1  = new Student();
    Student s2 = new Student("jane", (byte)55);


}
