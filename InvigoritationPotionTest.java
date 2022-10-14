

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InvigoritationPotionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InvigoritationPotionTest
{
    private Character harry;
    private Potion invigoritationPotion;
    /**
     * Default constructor for test class InvigoritationPotionTest
     */
    public InvigoritationPotionTest()
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
           invigoritationPotion=new InvigoritationPotion(); 
    }
     @Test
    public void testUsePotion()
    {
        harry.assignPoti(invigoritationPotion);
        harry.usePoti();
        assertEquals(28,harry.getDefensiveP(),0);
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
