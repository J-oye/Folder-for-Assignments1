public class TestDriller {
    private int copy;

    public void purchase(int copy) {
        this.copy = copy;
    }


    public int amount() {
        if (copy >= 1 && copy <= 4) {
            return copy * 2000;
        }
        if (copy >= 5 && copy <= 9) {
            return copy * 1800;
        }
        if (copy >= 10 && copy <= 29) {
            return copy * 1600;
        }
        if (copy >= 30 && copy <= 49) {
            return copy * 1500;
        }
        if (copy >= 50 && copy <= 99) {
            return copy * 1300;
        }
        if (copy >= 100 && copy <= 199) {
            return copy * 1200;
        }
        if (copy >= 200 && copy <= 499) {
            return copy * 1100;
        }
        if (copy == 500) {
            return copy * 1000;
        }
        return copy;
    }
}