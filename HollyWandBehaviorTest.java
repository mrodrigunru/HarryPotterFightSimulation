

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HollyWandBehaviorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HollyWandBehaviorTest
{
     private Wand wand;
    /**
     * Default constructor for test class HollyWandBehaviorTest
     */
    public HollyWandBehaviorTest()
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
        wand= new HollyWandBehavior("Rowan");
    }
    @Test
    public void testgetAtkPoints()
    {
        assertEquals(10,wand.getAtkPoints(10,10),0);
    }
    @Test
    public void testgetResPoints()
    {
        assertEquals(20,wand.getResPoints(10,10),0);
    }
     @Test
    public void testgetName()
    {
        assertEquals("Rowan",wand.getName());
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
