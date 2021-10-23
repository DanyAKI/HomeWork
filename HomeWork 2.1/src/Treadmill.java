public class Treadmill implements obstacle {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;


    }

    @Override
    public String toString() {
        return " successfully ran Treadmill " + distance;
    }


    public int getDistance() {
        return distance;
    }

    @Override
    public void overcome(participants p) {
        p.run();
    }


}

