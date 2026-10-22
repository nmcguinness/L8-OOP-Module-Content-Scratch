package topic03.underwatch;
import topic0.Vector3;

public abstract class GameObject {
    private String _name;
    private Vector3 _position;

    public Vector3 get_position() {
        return _position;
    }

    public void set_position(Vector3 _position) {
        this._position = _position;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public GameObject(String name){
        this(name, Vector3.Zero);
    }

    public GameObject(String name, Vector3 position){
        _name = name;
        _position = position;
    }

    @Override
    public String toString(){
        return "GameObject(" + _name + "," + _position + ")";
    }

    //TODO - equals, hashCode


}
