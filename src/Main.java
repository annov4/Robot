public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(0, 0, Direction.UP);

        moveRobot(robot, 3, -5);
        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner(0,0, Direction.DOWN);
        moveRobot(robotVacuumCleaner, 3, 3);

    }

    private static void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();

        if (toX > startX) {
            turn(robot, Direction.RIGHT);
            moveIn(robot, startX, toX);
        } else if (toX < startX) {
            turn(robot, Direction.LEFT);
            moveIn(robot, startX, toX);
        }

        if (toY > startY) {
            turn(robot, Direction.UP);
            moveIn(robot, startY, toY);
        } else if (toY < startY) {
            turn(robot, Direction.DOWN);
            moveIn(robot, startY, toY);
        }

        System.out.println(robot.getX());
        System.out.println(robot.getY());
        System.out.println(robot.getDirection());
    }

    private static void turn(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    private static void moveIn(Robot robot, int start, int end) {
        int step;
        if (start < end) {
            step = 1;
        } else
            step = -1;
        for (int i = start; i != end; i += step) {
            robot.stepForward();
        }
    }
}
