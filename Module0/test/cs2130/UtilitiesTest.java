package cs2130;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void hello() {
        Utilities.hello("Bob");
        assertEquals("Hello Bob\n", outContent.toString());
        outContent.reset();
        Utilities.hello("Jane");
        assertEquals("Hello Jane\n", outContent.toString());
    }

    @Test
    void add() {
        assertEquals(8, Utilities.add(5,3));
        assertEquals(8, Utilities.add(3,5));
        assertEquals(6, Utilities.add(2,4));
    }

    @Test
    void sub() {
        assertEquals(2, Utilities.sub(5,3));
        assertEquals(-2, Utilities.sub(3,5));
    }
}