package bagsolver;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparingDouble;

class BagSolver {
    static List<Thing> solve(List<Thing> things, int L) {
        things.sort(comparingDouble(Thing::getUnitCost));

        List<Thing> result = new ArrayList<>();
        int currentL = 0;

        for (Thing thing : things) {
            if ((currentL + thing.getWeight()) <= L) {
                currentL += thing.getCost();
                result.add(thing);
            }
        }
        return result;
    }
}
