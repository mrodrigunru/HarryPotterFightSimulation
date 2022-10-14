import java.util.Comparator;
/**
 * A class which compares the wizards at Hufflepuff from least to greatest according to offensive points
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo González, Ángel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class ComparatorHufflepuff extends MegaComparator
{
    
   public int compare (Character c1, Character c2){
        int i =0;
        if (c1.getOffensiveP() < c2.getOffensiveP()) i = -1;
        if (c1.getOffensiveP() > c2.getOffensiveP()) i = 1;
        if(c1.getOffensiveP() == c2.getOffensiveP()){
                if (c1.getName().compareTo(c2.getName()) < 0) i = -1;
                if (c1.getName().compareTo(c2.getName()) > 0) i = 1;
            }
        return i;
    }
   }