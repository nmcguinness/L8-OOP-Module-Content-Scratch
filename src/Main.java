//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("Hello World");
    System.out.println("Hello World");

    String day = "Thursday";
    float temp = 12;

    //write code to output
    // "it's chilly this Thursday" if temp < 15
    // "it's not too cold today" if temp >= 15

    String msg = temp >= 15 ? "it's not too cold today" : "it's chilly this " + day;
    System.out.println(msg);
}
