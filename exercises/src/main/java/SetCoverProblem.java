import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Problem pokrycia zbioru na przykładzie rozmieszczenia stacji nadawczych i obszaru, który musi być pokryty sygnałem.
// Celem jest znalezienie minimalnej liczby stacji nadawczych,
// które zapewnią pokrycie całego obszaru. Każda stacja nadawcza ma określony zasięg, w którym może działać.
public class SetCoverProblem {


    public static Set<String> findStationsToCover(Set<String> states, Set<String> stations) {


        Set<String> finalStations = new HashSet<>();

        while (!states.isEmpty()) {
            Set<String> statesCovered = new HashSet<>();
            String theBestStation = null;
            for (String station : stations) {
                Set<String> coveredStates = new HashSet<>(states);
                coveredStates.retainAll(getStationAndState.get(station));
                if (coveredStates.size() > statesCovered.size()) {
                    theBestStation = station;
                    statesCovered = coveredStates;
                }
            }
            if (theBestStation != null) {
                finalStations.add(theBestStation);
                states.removeAll(statesCovered);
            } else {
                break;
            }
        }
        return finalStations;

    }

    private static final Map<String, Set<String>> getStationAndState = new HashMap<>();

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        states.add("Washington");
        states.add("Oregon");
        states.add("Idaho");
        states.add("Montana");
        states.add("California");
        states.add("Nevada");

        Set<String> stations = new HashSet<>();
        stations.add("KONE");
        stations.add("KTWO");
        stations.add("KTHREE");
        stations.add("KFOUR");
        stations.add("KFIVE");

        getStationAndState.put("KONE", Set.of("Idaho", "Montana", "Washington"));
        getStationAndState.put("KTWO", Set.of("Oregon", "Idaho", "Nevada"));
        getStationAndState.put("KTHREE", Set.of("California", "Nevada", "Arizona"));
        getStationAndState.put("KFOUR", Set.of("Washington", "Oregon"));
        getStationAndState.put("KFIVE", Set.of("Nevada", "Utah"));
        System.out.println(findStationsToCover(states, stations));
    }
}

