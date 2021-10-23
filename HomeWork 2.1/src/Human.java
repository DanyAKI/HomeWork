public class Human implements participants {

    private String name;
    private int runningUnits;
    private int jumpUnits;


    public Human(String name, int runningUnits, int jumpUnit) {
        this.name = name;
        this.runningUnits = runningUnits;
        this.jumpUnits = jumpUnit;


    }

    @Override
    public String toString() {
        return "Human " + name;
    }

    public int getRunningUnits() {
        return runningUnits;
    }

    public int getJumpUnits() {
        return jumpUnits;
    }


    @Override
    public void run() {
        System.out.println("Human is running");

    }

    @Override
    public void jump() {
        System.out.println("Human is jumping ");
        System.out.println();
    }

}



