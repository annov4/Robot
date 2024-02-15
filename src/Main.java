public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(0, 0, Direction.UP);

        moveRobot(robot, 3, -5);

        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner(0, 0, Direction.DOWN);

        moveRobot(robotVacuumCleaner, 3, 3);

    }

    private static void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();

        if (toX > startX) {
            turn(robot, Direction.RIGHT);
        } else if (toX < startX) {
            turn(robot, Direction.LEFT);
        }
        move(robot, Math.abs(toX - startX));

        if (toY > startY) {
            turn(robot, Direction.UP);
        } else if (toY < startY) {
            turn(robot, Direction.DOWN);
        }
        move(robot, Math.abs(toY - startY));

        System.out.println(robot.getX());
        System.out.println(robot.getY());
        System.out.println(robot.getDirection());
    }

    private static void turn(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    private static void move(Robot robot, int countSteps) {
        while (countSteps > 0) {
            robot.stepForward();
            countSteps--;
        }
    }
}