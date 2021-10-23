public class Cat implements participants {

    private String name;
    private int runningUnits;
    private int jumpUnits;


    public Cat(String name, int runningUnits, int jumpUnit) {
        this.name = name;
        this.runningUnits = runningUnits;
        this.jumpUnits = jumpUnit;


    }

    @Override
    public String toString() {
        return "Cat " + name;

    }

    public int getRunningUnits() {
        return runningUnits;
    }

    public int getJumpUnits() {
        return jumpUnits;
    }


    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping ");
        System.out.println();
    }

}
