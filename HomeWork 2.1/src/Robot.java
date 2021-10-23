public class Robot implements participants {

    private String name;
    private int runningUnits;
    private int jumpUnits;


    public Robot(String name, int runningUnits, int jumpUnit) {
        this.name = name;
        this.runningUnits = runningUnits;
        this.jumpUnits = jumpUnit;


    }

    @Override
    public String toString() {
        return "Robot " + name;

    }

    public int getRunningUnits() {
        return runningUnits;
    }

    public int getJumpUnits() {
        return jumpUnits;
    }


    @Override
    public void run() {
        System.out.println("Robot is running");
    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping");
        System.out.println();
    }


}

