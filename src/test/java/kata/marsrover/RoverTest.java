package kata.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoverTest {
    private Rover rover;

    @BeforeEach
    public void beforeRoverTest() {
        rover = new Rover();
    }

    @Test
    public void receiveSingleCommandShouldThrowExceptionWhenCommandIsUnknown() {
        assertThrows(Exception.class, () -> {
            rover.receiveSingleCommand('X');
        });
    }
}