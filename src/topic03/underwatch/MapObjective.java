package topic03.underwatch;

import topic0.Vector3;

public class MapObjective extends GameObject{
    private Team ownedBy;


    public MapObjective(String name){
        super(name);
    }

    public MapObjective(String name, Vector3 position){
        super(name, position);
    }
}
