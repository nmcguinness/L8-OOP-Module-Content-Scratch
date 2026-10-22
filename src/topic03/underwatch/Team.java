package topic03.underwatch;

public class Team {
    //ArrayList<Player> members;

    private String _name;
    private Color _color;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Color get_color() {
        return _color;
    }

    public void set_color(Color _color) {
        this._color = _color;
    }

    public Team(String name, Color color){
        _name = name;
        _color = color;
  }

  @Override
  public String toString()
  {
      return "Team(" + _name + "," + _color + ")";
  }

  //TODO - equals, hqashCode, ArrayList<Player>
}

