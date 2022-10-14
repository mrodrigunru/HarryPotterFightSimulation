

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HawthornWandBehaviorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HawthornWandBehaviorTest
{
    private Wand wand;
    /**
     * Default constructor for test class HawthornWandBehaviorTest
     */
    public HawthornWandBehaviorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        wand= new HawthornWandBehavior("Larch");
    }
    @Test
    public void testgetAtkPoints()
    {
        assertEquals(20,wand.getAtkPoints(10,10),0);
    }
    @Test
    public void testgetResPoints()
    {
        assertEquals(10,wand.getResPoints(10,10),0);
    }
     @Test
    public void testgetName()
    {
        assertEquals("Larch",wand.getName());
    }
 
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
