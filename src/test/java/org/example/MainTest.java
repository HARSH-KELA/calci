package org.example;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSquareRootFunction() {
        String input = "1\n16\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});

        // Check the output here
        // Example: assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFactorialFunction() {
        String input = "2\n5\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});

        // Check the output here
        // Example: assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNaturalLogarithm() {
        String input = "3\n10\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});

        // Check the output here
        // Example: assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testPowerFunction() {
        String input = "4\n2\n3\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});

        // Check the output here
        // Example: assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testExitFunction() {
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});

        // Check if the program exits gracefully
        // Example: assertTrue(checkIfProgramExitedGracefully);
    }
}
