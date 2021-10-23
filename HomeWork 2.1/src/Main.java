public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Ron", 101, 101);
        Cat cat1 = new Cat("Bob", 101, 101);
        Robot robot1 = new Robot("Vali", 100, 100);
        Treadmill treadmill1 = new Treadmill(100);
        Wall wall1 = new Wall(100);


        human1.run();
        human1.jump();

        if (human1.getRunningUnits() < treadmill1.getDistance()) {
            System.out.println(human1 + " won't be able to run");
        } else {
            System.out.println(human1 + " was able to run");
        }

        if (human1.getJumpUnits() <= wall1.getHeight()) {
            System.out.println(human1 + " won't jump over");
        } else {
            System.out.println(human1 + " jumped over");

        }
        System.out.println();


        cat1.run();
        cat1.jump();

        if (cat1.getRunningUnits() < treadmill1.getDistance()) {
            System.out.println(cat1 + " won't be able to run");
        } else {
            System.out.println(cat1 + " was able to run");
        }

        if (cat1.getJumpUnits() <= wall1.getHeight()) {
            System.out.println(cat1 + " won't jump over");
        } else {
            System.out.println(cat1 + " jumped over");
        }
        System.out.println();

        robot1.run();
        robot1.jump();

        if (robot1.getRunningUnits() < treadmill1.getDistance()) {
            System.out.println(robot1 + " won't be able to run");
        } else {
            System.out.println(robot1 + " was able to run");
        }

        if (robot1.getJumpUnits() <= wall1.getHeight()) {
            System.out.println(robot1 + " won't jump over");
        } else {
            System.out.println(robot1 + " jumped over");
        }
        System.out.println();


        obstacle[] obstacles = {new Wall(40), new Treadmill(100)};
        participants[] participants = {new Cat("Bob", 34, 54), new Robot("Valli", 100, 80), new Human("Ron", 100, 100)};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                obstacles[j].overcome(participants[i]);

            }

        }


    }
}
