public class RoverSimulation {
    public static void main(String[] args) {
        // Create a grid with obstacles
        Grid grid = new Grid(10, 10);
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);

        // Initialize the rover
        Rover rover = new Rover(0, 0, Direction.NORTH, grid);

        // Define commands
        Command[] commands = {
            new MoveCommand(rover),
            new MoveCommand(rover),
            new TurnRightCommand(rover),
            new MoveCommand(rover),
            new TurnLeftCommand(rover),
            new MoveCommand(rover)
        };

        // Execute commands
        for (Command command : commands) {
            command.execute();
        }

        // Print the status report
        System.out.println(rover.getStatusReport());
    }
}
