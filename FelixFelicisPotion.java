
/**
 * A model of an Ofensive Potion
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo Gonzalez, Ángel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class FelixFelicisPotion implements Potion
{
    /**
     * It uses the potion and modifies the characteristics of a character
     * @param w The wizard who will be assigned the potion to
     */
    @Override
    public void usePotion(Character w){
        
       double atkPAux = w.getOffensiveP();
       atkPAux = atkPAux * 1.3;
       w.setOffensiveP(atkPAux);
    }
}
