package bagsolver;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BagSolverTest {
    @Test
    void solveBagTask() {
        final List<Thing> things = Arrays.asList(
                new Thing(3, 1), new Thing(4, 6), new Thing(5, 4),
                new Thing(8, 7), new Thing(9, 6)
        );

        final List<Thing> expected = Arrays.asList(new Thing(4, 6), new Thing(5, 4), new Thing(3, 1));
        assertListContainsExactly(BagSolver.solve(things, 13), expected);
    }


    private void assertListContainsExactly(List<Thing> actual, List<Thing> expected) {
        for (int i = 0; i < actual.size(); i++) {
            assertEquals(actual.get(i).getCost(), expected.get(i).getCost());
            assertEquals(actual.get(i).getWeight(), expected.get(i).getWeight());
        }
    }
}