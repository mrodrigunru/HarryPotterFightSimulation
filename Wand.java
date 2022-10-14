
/**
 * The model of a Wand with all its characteristics
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo Gonzalez, Angel Romero Trigo & Manuel Rodriguez Rodriguez 
 * @version 1.0
 */
public abstract class Wand
{
    //Attack points of the wizard
    protected double atkPoints;
    //resistance points of the wizard
    protected double resPoints;
    //The name of the wand
    protected String name;

    /**
     * Constructor for objects of class Wand
     * 
     * @param name The name of the wand
     */
    public Wand(String name)
    {
        this.name = name;
    }
    
    /**
     * PRE:{atkPoints must be initialized}
     * POST:{Returns a double} 
     * It returns the attack points
     * @return the attack points
     * 
     */
    public double getAtkPoints(double energy, double offensive){
        atkMode(energy, offensive);
        return atkPoints;
    }
    
    /**
     * PRE:{resPoints must be initialized}
     * POST:{Returns a double} 
     * It returns the resistance points
     * @return the resistance points
     * 
     */
    public double getResPoints(double energy, double defense){
        defMode(energy, defense);
        return resPoints;
    }
    
    /**
     * PRE:{name has to be initialized}
     * POST:{returns a string}
     * It returns the name of the wand
     * @return the name of the wand
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * It prepares the attack mode 
     */
    public abstract void atkMode (double energy, double offensive);
    
    /**
     * It prepares the defensive mode 
     */
    public abstract void defMode (double energy, double defense);
    
    /**
     * PRE:{the object must be created} 
     * POST:{it converts an objetc to a string}
     * It returns a string
     * @return The object converted into a string
     */
    public String toString(){
        return "wand: <" + getName() + " (" + getClass().getName() + ")>";
    }
}
