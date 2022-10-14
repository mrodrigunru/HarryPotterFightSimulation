
/**
 * A type of wizard, the Defensive one
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo González, Ángel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class Defensives extends Character
{
    
    /**
     * Constructor for objects of class Defensives
     * 
     * @param name The name of the Wizard
     * @param w The wand of the Wizard
     */
    public Defensives(String name, Wand w)
    {
        super(name, w);
        setDefensiveP(getDefensiveP() + 5.0);
    }

    
}
