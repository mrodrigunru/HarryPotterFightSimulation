/**
 * A model of a Defensive wand
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo González, Ángel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class HollyWandBehavior extends Wand
{
    /**
     * Constructor for objects of class HollyDefensive
     * 
     * @param n The name of the Wizard
     */
    public HollyWandBehavior(String n)
    {
        super(n);
    }

    /**
     * It obtains the total attack points
     */
    @Override
    public void atkMode (double energy, double offensive){
       atkPoints = (0.7 * energy) + (0.3 * offensive);  
    }
    
    /**
     * It obtains the total resistance points
     */
    @Override
    public void defMode (double energy, double defense){
        resPoints = (0.9 * energy) + (1.1 * defense);
    }
}
