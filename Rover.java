public class Rover {
    private Position position;
    private Direction direction;
    private Grid grid;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.position = new Position(x, y);
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        Position newPosition = position.moveInDirection(direction);

        if (grid.isWithinBounds(newPosition) && !grid.isObstacle(newPosition)) {
            position = newPosition;
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public String getStatusReport() {
        return String.format("Rover is at (%d, %d) facing %s.",
                position.getX(), position.getY(), direction);
    }
}
