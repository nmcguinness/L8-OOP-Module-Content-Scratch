public class Vector3 {

    //fields
    private double _x, _y, _z;

    //accessor methods
    public double getX() {
        return _x;
    }

//    public double setX(double x) {
//        if(x < 0)  //input validation on setter
//            _x = 0;
//        else
//            _x = x;
//        return _x;
//    }

    public double setX(double x) {
        _x = x < 0 ? 0: x;  //use ternary operator for input validation
        return _x;
    }

    //constructors
    public Vector3() {
        _x = _y = _z = 0;
    }
    public Vector3(double x, double y, double z) {
        //this.x = x;
        _x = x;
        _y = y;
        _z = z;
    }
}
