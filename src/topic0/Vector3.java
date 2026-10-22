package topic0;

import java.util.Vector;

public class Vector3 {

    //region Static Fields
    public static final Vector3 Zero = new Vector3(0,0,0);
    public static final Vector3 UnitX = new Vector3(1,0,0);
    public static final Vector3 UnitY = new Vector3(0,1,0);
    public static final Vector3 UnitZ = new Vector3(0,0,1);
    //endregion

    //region Fields
    private double _x, _y, _z;  //8 bytes x 3 = 24 bytes
    //endregion

    //region Accessor Methods
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
    //endregion

    //region Constructors
    public Vector3() {
        _x = _y = _z = 0;
    }
    public Vector3(double x, double y, double z) {
        //this.x = x;
        _x = x;
        _y = y;
        _z = z;
    }
    //endregion

    @Override
    public String toString() {
        return "(" + _x + "," + _y + "," + _z + ")";
    }
}