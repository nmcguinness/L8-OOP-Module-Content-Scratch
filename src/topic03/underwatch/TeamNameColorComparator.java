package topic03.underwatch;

import java.util.Comparator;

public class TeamNameColorComparator implements Comparator<Team> {
    @Override
    public int compare(Team o1, Team o2) {

        int compareByName = o1.get_name().compareTo(o2.get_name());

        //color is a tie-breaker
        if(compareByName == 0)
            return o1.get_color().compareTo(o2.get_color());
        else
            return compareByName;
    }
}
