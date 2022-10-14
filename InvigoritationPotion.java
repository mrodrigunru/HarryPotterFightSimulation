
/**
 * A model of a defensive potion
 * Nombre del grupo: Depé SL
 * @author Daniel Corgo Gonzalez, Angel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class InvigoritationPotion implements Potion
{
    /**
     * It uses the potion and modifies the characteristics of a character
     * @param w The wizard who will be assigned the potion to
     */
    @Override
    public void usePotion(Character w){         
       double defPAux = w.getDefensiveP();
       defPAux = defPAux * 1.4;
       w.setDefensiveP(defPAux);
    }
}
