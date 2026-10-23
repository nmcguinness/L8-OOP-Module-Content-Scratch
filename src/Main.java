import ce01.FileUtils;
import ce01.LicencePlate;
import ce01.LicencePlateValidator;
import topic03.underwatch.Color;
import topic03.underwatch.Team;
import topic03.underwatch.TeamNameComparator;

/*
    //tesla cannon, rheinhardt hammer, grav cannon, plasma cannon

    //characteristic
        //health (no max)
        //same speed
        //weapon difference
    //abilities
        //rheinhardt (fire strike, charge, shield)
        //zarya (dynamic protective bubble, charge from bubble attack)
        //winston (jump, land damage, stationary bubble (only protection)

    //accumulate ultimate charge
      //use on buffs
        //damage boost (20)
        //overhealth (HP+600)

    //characters
        //50+
            //rheinhardt
            //zarya
            //winston

    //objectives
        //flag (vacant possession)
        //playload (push, enemy in range, slides back to checkpoint)
*/

void main() {
    topic03_UnderwatchDemo();
}

private void topic03_UnderwatchDemo() {

    //step 1 - make some teams and add to an arraylist
    ArrayList<Team> teamsList = new ArrayList<>();

    teamsList.add(new Team("Team B", Color.BLACK));
    teamsList.add(new Team("Team R", Color.RED));
    teamsList.add(new Team("Team G", Color.GREEN));
    teamsList.add(new Team("Team W", Color.WHITE));

    //step 2 - order by (a) Comparable (b) Comparator (c) Comparator factory
  //  System.out.println("(a) Comparable ");
  //  teamsList.sort(null);
   // System.out.println(teamsList);

    System.out.println("(b) Comparator");
    teamsList.sort(new TeamNameComparator());
    System.out.println(teamsList);

    //step 3 - print output
    //Use Comparator.compare()
}


















private void topic1_2DArrays() {

    // Rectangular: same columns in every row
    int[][] rect = new int[3][4]; // 3 rows, 4 cols each

    rect[0][2] = 101;

    int rows = rect.length;
    System.out.println(rows);

    int cols = rect[0].length;
    System.out.println(cols);
    print2D(rect);
}

private void print2D(int[][] data)
{
    for(int row = 0; row < data.length; row++){
        for(int col = 0; col < data[row].length; col++){
            System.out.print(data[row][col] + "\t");
        }
        System.out.println();
    }
}

private void challengeExercise01() {

    // Create a license plate.
    LicencePlate l1 = new LicencePlate("262 L 11662");
        System.out.println(l1);

    // Create a validator.
        LicencePlateValidator validator = new LicencePlateValidator();

    // Define validation criteria.
        int yearTargetSum = 10;
        String countyRegex = ".*L.*";  //any char {0,} L
        String numberRegex = ".*6.*6.*";

    // Test the year.
        boolean isYearValid = validator.validateYear(
                l1.getYear(), yearTargetSum);

        System.out.println("Year valid: " + isYearValid);

    // Test the county.
        boolean isCountyValid = validator.validateCounty(
                l1.getCounty(), countyRegex);

        System.out.println("County valid: " + isCountyValid);

    // Test the number.
        boolean isNumberValid = validator.validateNumber(
                l1.getNumber(), numberRegex);

        System.out.println("Number valid: " + isNumberValid);

    // Test the complete license plate.
        boolean isLicensePlateValid = validator.validate(
                l1,
                numberRegex,
                countyRegex,
                yearTargetSum);

        System.out.println("License plate valid: " + isLicensePlateValid);

//    ArrayList<String> rawLicences = FileUtils.readDelimitedFile("ce01_data.txt", ',');
//
//    LicencePlate licence;
//
//    long startTime = System.nanoTime();
//
//    for(String rawLicence : rawLicences){
//        licence = new LicencePlate(rawLicence);
//
//        if(validator.validateYear(licence.getYear(), 10)
//                && validator.validateCounty(licence.getCounty(), countyRegex)
//                    && validator.validateNumber(licence.getNumber(), numberRegex))
//                {
//                    System.out.println("Valid licence is: " + licence);
//                }
//    }
//
//    long diffTime = System.nanoTime() - startTime;
//    diffTime /= 1E6;
//    System.out.println("Running time(ms): " + diffTime);

    ArrayList<String> rawLicences = FileUtils.readDelimitedFile("ce01_data.txt", ',');

    LicencePlate licence;

    long startTime = System.nanoTime();

    for(int i = 0; i < rawLicences.size(); i++){
        licence = new LicencePlate(rawLicences.get(i));

        if(validator.validateYear(licence.getYear(), 10)
                && validator.validateCounty(licence.getCounty(), countyRegex)
                && validator.validateNumber(licence.getNumber(), numberRegex))
        {
            System.out.println("Valid licence is: " + licence);
        }
    }

    long diffTime = System.nanoTime() - startTime;
    diffTime /= 1E6;
    System.out.println("Running time(ms): " + diffTime);
}





















//
//private void topic1Demo() {
//
//    // Literal (known values now)
//    int[] nums = {3, 5, 8};  //nums stores ADDR of first element in an array of integers
//
//    // With length (values default to 0)
//    int[] grades =  {1, 2, 3, 4, 5, 6, 7, 8};
//
//    //read
//    int v1 = nums[2];
//    System.out.println(v1);
//
//    //write
//    nums[1] = 6 * nums[2];
//    System.out.println(nums[1]);
//
//    //get size
//    int l = grades.length;
//    System.out.println("Grades array is " + l + " in length");
//
//    //iterate across
//    for(int i = 0; i < grades.length; i++) {
//        System.out.println(grades[i]);
//    }
//
//    //print the array in reverse order
//    for(int i = grades.length - 1; i >= 0; i--) {
//        System.out.println(grades[i]);
//    }
//
//    System.out.println("--------------");
//
//    //print every odd indexed element in the array
//    for(int i = 1; i < grades.length; i+=2)
//        System.out.println(grades[i]);
//
//    System.out.println("--------------");
//
//    //print contents if multiple of 3 (Hint: use % operator and an if())
//
//    for(int i = 0; i < grades.length; i++) {
//
//        int value = grades[i]; //accessing an array costs TIME so do it once only per loop
//
//        if(value%3 == 0)
//            System.out.println(value);
//    }
//
//    System.out.println("--------------");
//
//    //make another array of ints, same size as grades, add ints, then compare two arrays
//    int[] otherGrades = {1,2,3,4,55555,6,7,8};
//
//    if(grades.length == otherGrades.length)
//    {
//        for(int i = 0; i < grades.length; i++)
//        {
//            if(grades[i] != otherGrades[i])
//                System.out.println("Different at index " + i);
//        }
//    }
//    else
//        System.out.println("Cannot compare two arrays of different length!");
//
////    PrintUtility x = new PrintUtility();
////    x.printArray("Other grades", otherGrades);
//
//    ArrayUtility.print("Other grades", otherGrades);
//    ArrayUtility.print("My nums", nums, PrintDirection.Forward);
//    ArrayUtility.print("My nums", nums, PrintDirection.Backward);
//
//    int[] p1 = {3, 6, 9};
//    int[] p2 = {10, 6, 3};
//
//    int index = ArrayUtility.findFirstDifference(p1, p2);
//    System.out.println("First difference is index [" + index + "] with values p1[" + p1[index] + "] and p2[" + p2[index] + "]");
//
//
//    System.out.println("Compare reverse: " + ArrayUtility.compareReverse(p1, p2));
//
//    int[] badData = null; //variable does not point to a valid first address in an array of ints
//
//    ArrayUtility.sum(badData);
//
//    badData = new int[2];
//    badData[0] = 34;
//    badData[1] = 10;
//
//    ArrayUtility.sum(badData);
//
//    System.out.println("Mean of p1 is " + ArrayUtility.mean(p1));
//
//    float meanP2 = ArrayUtility.mean(p2);
//    System.out.println("Mean of p2 is " + meanP2);
//    //...
//    //use meanp2 later - i can
//
//
//}
//// //create a printArray(int[] array) method that prints an array
////private void printArray(String header, int[] data){
////    System.out.println(header);
////    for(int i = 0; i < data.length; i++)
////        System.out.println(data[i]);
////}
////
//////create a printArray method that prints an array backwards or forwards
////private void printArray(String header, int[] data, PrintDirection direction)
////{
////    if(direction == PrintDirection.Forward){ //forwards
////        printArray(header, data);
////    }
////    else {  //backwards
////        System.out.println(header);
////        for(int i = data.length-1; i >= 0; i--)
////            System.out.println(data[i]);
////    }
////}
//
//
//
//
//
//
//private void topic0Demo(){
//    //region Intro Demo
//    System.out.println("Hello World");
//    System.out.println("Hello World");
//
//    String day = "Thursday";
//    float temp = 12;
//
//    //write code to output
//    // "it's chilly this Thursday" if temp < 15
//    // "it's not too cold today" if temp >= 15
//
//    String msg = temp >= 15 ? "it's not too cold today" : "it's chilly this " + day;
//    System.out.println(msg);
//    //endregion
//
//    Vector3 v1 = new Vector3(1,2,3);
//    Vector3 v2 = new Vector3(4,5,6);
//
//    double x  = v1.getX();
//    v2.setX(x);
//    System.out.println(v1);
//
//    // v3 is a variable that can store a topic0.Vector3 but doesnt yet!
//    Vector3 v3 = null;
//
//    // this statement (because it ends with semicolon) instantiates a new topic0.Vector3 in RAM
//    // and assigns its address to the variable v3
//    v3 = new Vector3(5,6,7);
//    System.out.println(v3);
//
//    Vector3 v4 = v1;
//    System.out.println(v4.getX());
//    v4 = null;
//
//    Student s1  = new Student();
//    Student s2 = new Student("jane", (byte)55);
//
//}