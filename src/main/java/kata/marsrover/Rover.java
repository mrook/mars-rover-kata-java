package kata.marsrover;

public class Rover {
    public Rover() {

    }

    public boolean receiveSingleCommand(char command) throws Exception {
        switch (Character.toUpperCase(command)) {
            default:
                throw new Exception("Command " + command + " is unknown.");
        }
    }
}