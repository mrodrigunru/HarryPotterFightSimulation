

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
/**
 * The test class HouseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HouseTest
{
    private House gryffindor;
    private MegaComparator mg1; 
    private Character harry;
    /**
     * Default constructor for test class HouseTest
     */
    public HouseTest()
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
        
        mg1 = new ComparatorGryffindor();
        gryffindor = new House("Gryffindor", mg1);
         harry = new Offensives("Harry Potter",new HawthornWandBehavior("HarryW"));
        gryffindor.addMember(harry);
    }
    @Test
    public void testAddMememberAndGetCharacter()
    {
        Defensives character=new Defensives("Character",new HawthornWandBehavior("HarryW"));
        gryffindor.addMember(character);
        
        assertEquals(character,gryffindor.getCharacter(character));
    }
     @Test
    public void testGetName()
    
    {    
        assertEquals("Gryffindor",gryffindor.getName());
    }
     @Test
    public void testRemoveCharacter()
    
    { 
        gryffindor.removeCharacter(harry);
        ArrayList<Character> aux= gryffindor.getmembers(); 
        assertEquals(0,aux.size());
    }
     @Test
    public void testcharacterDemanded()
    
    { 
        assertEquals(harry,gryffindor.characterDemanded());
    }
       @Test
    public void testgetMemebers()
    
    { 
        ArrayList<Character> aux= gryffindor.getmembers(); 
        assertEquals(aux,gryffindor.getmembers());
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
