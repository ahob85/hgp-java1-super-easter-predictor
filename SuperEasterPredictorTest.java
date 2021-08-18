
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

/**
 * The test class TestEasterPredictor.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SuperEasterPredictorTest
{
    /**
     * Default constructor for test class SuperEasterPredictorTest
     */
    public SuperEasterPredictorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void superEasterPredictorTest1() 
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        InputStream originalIn = System.in;
        ByteArrayInputStream bis = new ByteArrayInputStream("2003".getBytes());
        System.setIn(bis);

        // action
        SuperEasterPredictor.main(null);

        // assertion
        assertTrue(bos.toString().contains("In 2003, Easter falls on 4/20.\n"));
        
        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
    
    @Test
    public void superEasterPredictorTest2() 
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        InputStream originalIn = System.in;
        ByteArrayInputStream bis = new ByteArrayInputStream("2004".getBytes());
        System.setIn(bis);

        // action
        SuperEasterPredictor.main(null);

        // assertion
        assertTrue(bos.toString().contains("In 2004, Easter falls on 4/11.\n"));
        
        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
    
    @Test
    public void superEasterPredictorTest3() 
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        InputStream originalIn = System.in;
        ByteArrayInputStream bis = new ByteArrayInputStream("1890".getBytes());
        System.setIn(bis);

        // action
        SuperEasterPredictor.main(null);

        // assertion
        assertTrue(bos.toString().contains("In 1890, Easter falls on 4/6.\n"));
        
        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
