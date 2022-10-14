
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ComparatorGryffindorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ComparatorGryffindorTest
{
    private Character c1;
    private Character c2;
    private Character c3;
    private MegaComparator mg1;
    /**
     * Default constructor for test class ComparatorGryffindorTest
     */
    public ComparatorGryffindorTest()
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
        c1 = new Defensives("Amancio",new HawthornWandBehavior("c1W"));
        c2 = new Defensives("Benzema",new HawthornWandBehavior("c2W"));
        c3 = new Defensives("Zoorro",new HawthornWandBehavior("c3W"));
        c1.setDefensiveP(20.0);
        c2.setDefensiveP(10.0);
        c3.setDefensiveP(10.0);
        mg1 = new ComparatorGryffindor();
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
