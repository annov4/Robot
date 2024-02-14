public class Robot {
    private int x;
    private int y;
    private Direction direction;

    Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if (direction == Direction.LEFT) {
            direction = Direction.DOWN;
        } else if (direction == Direction.DOWN) {
            direction = Direction.RIGHT;
        } else if (direction == Direction.RIGHT) {
            direction = Direction.UP;
        } else if (direction == Direction.UP) {
            direction = Direction.LEFT;

        }

    }

    public void stepForward() {
        if (direction == Direction.UP) {
            y++;
        }
        if (direction == Direction.RIGHT) {
            x++;
        }
        if (direction == Direction.DOWN) {
            y--;
        }
        if (direction == Direction.LEFT) {
            x--;
        }
    }
}