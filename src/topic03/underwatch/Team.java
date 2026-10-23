package topic03.underwatch;

public class Team implements Comparable<Team> {
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

    @Override
    public int compareTo(Team other) {

        //step 1 - compare by name
        //  return this._name.compareTo(other.get_name());

        //step 2 - replace with Color comparison
        //return this._color.compareTo(other.get_color());

        //step 3 - compare by name, then color
        int compareNameResult = this._name.compareTo(other.get_name());

        if(compareNameResult == 0)  //same name
            return this._color.compareTo(other.get_color());
        else
            return compareNameResult;
    }

    //TODO - equals, hashCode, ArrayList<Player>
}

