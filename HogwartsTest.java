
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.io.*;

/**
 * The test class HogwartsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HogwartsTest
{
    private House gryffindor;
    private MegaComparator mg1; 
    private Character harry;
    private Wand n1;
    private Potion invigoritationPotion;

    /**
     * Default constructor for test class HogwartsTest
     */
    public HogwartsTest()
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
        Hogwarts hogwarts = Hogwarts.getInstance();
        mg1 = new ComparatorGryffindor();
        gryffindor = new House("Gryffindor", mg1);
        harry = new Offensives("Harry Potter",new HawthornWandBehavior("HarryW"));
        gryffindor.addMember(harry);

        invigoritationPotion=new InvigoritationPotion(); 

    }

    @Test
    public void testNewAndGetWand()
    {
        Hogwarts hogwarts = Hogwarts.getInstance();
        Wand n = new HawthornWandBehavior("Varita");
        hogwarts.newWand(n);
        assertEquals(n,hogwarts.getWand(n));
        hogwarts.deleteWand(n);
    }

    @Test
    public void testDeleteWand()
    {
        Hogwarts hogwarts = Hogwarts.getInstance(); 
        Wand n = new HawthornWandBehavior("Varita");
        hogwarts.newWand(n);
        
        
        hogwarts.deleteWand(n);
        
        Set<Wand> wands =hogwarts.getSet();
        assertEquals(0,wands.size());

    }

    @Test
    public void testNewHouse()
    {
        Hogwarts hogwarts = Hogwarts.getInstance();
        
        House nuevaCasa = new House("nuevacasa", mg1);
        hogwarts.newHouse("nueva", nuevaCasa);
        Map<String, House> houses = hogwarts.getMap();
        assertEquals(false,houses.isEmpty());
    }

    @Test
    public void testCheckEnergy()
    {
        Hogwarts hogwarts = Hogwarts.getInstance();
        
        Character harrypopoter = new Offensives("Harry Popotter",new HawthornWandBehavior("HarryW"));
        Character roncola = new Offensives("Ron Cola",new HawthornWandBehavior("RonW"));
        hogwarts.newFighter(harrypopoter);
        hogwarts.newFighter(roncola);
        
        ArrayList<Character> characters = hogwarts.getArrayList();
        
        boolean test = hogwarts.checkEnergy(0,1);
        assertEquals(true,test);

    }

    @Test
    public void damageCalculation()
    {
        Hogwarts hogwarts = Hogwarts.getInstance();
        Character harrypopoter = new Offensives("Harry Popotter",new HawthornWandBehavior("HarryW"));
        Character roncola = new Offensives("Ron Cola",new HawthornWandBehavior("RonW"));
        double test = hogwarts.damageCalculation(harrypopoter, roncola);
        assertEquals(27,test,0);

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
