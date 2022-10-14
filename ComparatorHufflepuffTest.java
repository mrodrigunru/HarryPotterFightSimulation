

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ComparatorHufflepuffTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ComparatorHufflepuffTest
{
    private Character c1;
    private Character c2;
    private Character c3;
    private MegaComparator mg1;
    /**
     * Default constructor for test class ComparatorHufflepuffTest
     */
    public ComparatorHufflepuffTest()
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
        c1 = new Offensives("Amancio",new HollyWandBehavior("c1W"));
        c2 = new Offensives("Benzema",new HollyWandBehavior("c2W"));
        c3 = new Offensives("Zoorro",new HollyWandBehavior("c3W"));
        c1.setOffensiveP(20.0);
        c2.setOffensiveP(10.0);
        c3.setOffensiveP(10.0);
        mg1 = new ComparatorHufflepuff();
    }

    @Test
    public void testBigger()
    {
        int comparacion = mg1.compare(c1,c2);
        assertEquals(1,comparacion);
    }

    @Test
    public void testLower()
    {
        int comparacion = mg1.compare(c2,c1);
        assertEquals(-1,comparacion);
    }

    @Test
    public void testEqual()
    {
        int comparacion = mg1.compare(c2,c3);
        assertEquals(-1,comparacion);
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
