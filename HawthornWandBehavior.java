/**
 * A model of a Offensive wand
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo Gonzalez, Angel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class HawthornWandBehavior extends Wand
{
    /**
     * Constructor for objects of class OffensiveHawthorn
     * 
     * @param w The wizard who the wand is going to be assign to
     */
    public HawthornWandBehavior(String n)
    {
       super(n);
    }

    /**
     * It obtains the total attack points
     */
    @Override
    public void atkMode (double energy, double offensive){
       atkPoints = (0.6 * energy) + (1.4 * offensive);  
    }
    
    /**
     * It obtains the total resistance points
     */
    @Override
    public void defMode (double energy, double defense){
        resPoints = (0.8 * energy) + (0.2 * defense);
    }
}
