package bagsolver;

class Thing {
    private int weight, cost;

    Thing(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    double getUnitCost() {
        return weight / cost;
    }

    int getWeight() {
        return weight;
    }

    int getCost() {
        return cost;
    }
}