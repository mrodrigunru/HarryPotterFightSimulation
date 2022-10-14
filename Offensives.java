
/**
 * A type of wizard, the offensive one
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo González, Ángel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class Offensives extends Character
{
    
    /**
     * Constructor for objects of class Offensives
     * 
     * @param name The name of the Wizard.
     * @param w The Wand of the Wizard.
     */
    public Offensives(String name, Wand w)
    {
        super(name, w);
        setOffensiveP(getOffensiveP() + 5.0);
    }

    
}
