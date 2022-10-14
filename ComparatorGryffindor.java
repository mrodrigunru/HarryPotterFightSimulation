import java.util.Comparator;
/**
 * A class which compares the wizards at Gryffindor from least to greatest according to defense points
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo González, Ángel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class ComparatorGryffindor extends MegaComparator
{
    
   public int compare (Character c1, Character c2){
        int i = 0;
        if (c1.getDefensiveP() < c2.getDefensiveP()) i = -1;
        if (c1.getDefensiveP() > c2.getDefensiveP()) i = 1;
        if(c1.getDefensiveP() == c2.getDefensiveP()){
                if (c1.getName().compareTo(c2.getName()) < 0) i = -1;
                if (c1.getName().compareTo(c2.getName()) > 0) i = 1;
            }
        return i;
    }
    }
    

