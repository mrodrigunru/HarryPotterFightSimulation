

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CharacterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CharacterTest
{
    private Character harry;
    private Wand n1;
    private Potion invigoritationPotion;
    /**
     * Default constructor for test class CharacterTest
     */
    public CharacterTest()
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
           n1 = new HawthornWandBehavior("Larch");
           invigoritationPotion=new InvigoritationPotion(); 
    }
    @Test
    public void testAssignWandAndGetWand()
    {
        harry.assignWand(n1);
        assertEquals(n1,harry.getWand());
    }
     @Test
    public void testDeleteWand()
    {
        harry.assignWand(n1);
        harry.deleteWand();
        assertEquals(null,harry.getWand());
    }
     @Test
    public void testAssignPotiAndGetPoti()
    {
        harry.assignPoti(invigoritationPotion);
        assertEquals(invigoritationPotion,harry.getPoti());
    }
      @Test
    public void testGetName()
    {
        assertEquals("Harry Potter",harry.getName());
    }
     @Test
    public void testUsePotion()
    {
        harry.assignPoti(invigoritationPotion);
        harry.setOffensiveP(10);
        harry.usePoti();
        assertEquals(28,harry.getDefensiveP(),0);
    }
     @Test
    public void testGetAndSetOffensive()
    {
        harry.setOffensiveP(12);
        assertEquals(12,harry.getOffensiveP(),0);
    }
     @Test
    public void testGetAndSetDefensive()
    {
        harry.setDefensiveP(12);
        assertEquals(12,harry.getDefensiveP(),0);
    }
     @Test
    public void testGetAndSetEnergy()
    {
        harry.setEnergyP(12);
        assertEquals(12,harry.getEnergyP(),0);
    }
     @Test
    public void testGetOffensiveAndDefensiveP()
    {
         harry.setOffensiveP(12);
         harry.setDefensiveP(12);
        assertEquals(24,harry.getOffensiveAndDefensiveP(),0);
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
