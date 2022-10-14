

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FelixFelicisPotionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FelixFelicisPotionTest
{
    private Character harry;
    private Potion felixFelicisPotion;
    /**
     * Default constructor for test class FelixFelicisPotionTest
     */
    public FelixFelicisPotionTest()
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
          harry = new Offensives("Harry Potter",new HawthornWandBehavior("HarryW"));
          felixFelicisPotion=new FelixFelicisPotion(); 
    }
    @Test
    public void testUsePotion()
    {
        harry.assignPoti(felixFelicisPotion);
        harry.usePoti();
        assertEquals(32.5,harry.getOffensiveP(),1);
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
