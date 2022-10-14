import java.util.Comparator;
/**
 * The abstract class for accesing the other comparators for Houses
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo Gonzalez, Angel Romero Trigo & Manuel Rodriguez Rodriguez
 * 
 * @version 1.0
 */

public abstract class MegaComparator implements Comparator<Character>
{
   
    public abstract int compare(Character c1, Character c2);
}
