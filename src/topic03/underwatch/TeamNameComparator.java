package topic03.underwatch;

import java.util.Comparator;

public class TeamNameComparator implements Comparator<Team> {
    @Override
    public int compare(Team first, Team second) {
        return first.get_name().compareTo(second.get_name());
    }
}
