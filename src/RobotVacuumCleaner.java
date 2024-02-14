public class RobotVacuumCleaner extends Robot {

    RobotVacuumCleaner(int x, int y, Direction direction) {
        super(x, y, direction);
    }

    @Override
    public void stepForward() {
        super.stepForward();
        System.out.println("Пыль убрана");
    }
}