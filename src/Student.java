public class Student {

    private String name;
    private byte grade;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null || name.length() == 0) //null, ""
            this.name = "default name";
        else
            this.name = name;
    }
    public byte getGrade() {
        return grade;
    }
    public void setGrade(byte grade) {
        this.grade = (grade >= 0 && grade <= 100) ? grade : 0;
    }

    public Student (String name, byte grade) {
        this.name = name;
        this.grade = grade;
    }

    public Student()
    {
        this("default name",  (byte)100);
    }

    /*
    1. Add fields (Apply Encapsulation)
    2. Add getters
    3. Add setters (add input validation using ternary operator)
    4. Constructors
    5. toString
    6. Add regions (Fields, Accessors, Constructors, Overrides
    * */

}
