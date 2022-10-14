
/**
 * The model of a Wand with all its characteristics
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo Gonzalez, Angel Romero Trigo & Manuel Rodriguez Rodriguez 
 * @version 1.0
 */

public interface Potion
{
    /**
     * It applies the potion characteristics to a wizard 
     * @param w The wizard who will be assigned the potion to
     */
    public abstract void usePotion(Character w);
}
