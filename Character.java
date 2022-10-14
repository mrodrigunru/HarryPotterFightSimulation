import java.util.ArrayList;
/**
 * Model some details of the Wizard
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo González, Ángel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class Character
{
   // the name of the wizard
    private String name;
    //Number of energy points of the wizard
    private double energyP;
    //Number of offensive points of the wizard
    private double offensiveP;
    //Number of defensive points of the wizard
    private double defensiveP;
    //The wand assign to the wizard
    private Wand wand;
    //The potion a wizard can use
    private Potion poti;
    
    
    /**
     * Constructor for objects of class Character
     * 
     * @param name The name of the wizard
     * @param w The wand assigned to the wizard
     */
    public Character(String name, Wand w)
    {
        this.name = name;
        energyP = 20.0;
        offensiveP = 20.0;
        defensiveP = 20.0;
        wand = w;
    }

    /**
     * PRE: {w has to be initialized}
     * POST :{void return}
     * Assigns a wand to a character
     * 
     * @param w The wand which is going to be assigned
     */    
    public void assignWand(Wand w){
        wand = w;
    }
    
    /**
     * PRE:{wand != null}
     * POST:{void return}
     * It deletes a wand
     */
    public void deleteWand(){
        wand = null;
    } 
    
    /**
     * PRE: {p has to be initialized}
     * POST :{void return}
     * @param p The potion which is going to be used
     */
    public void assignPoti(Potion p){
        poti = p;
    }
     /**
     * PRE: {p has to be initialized}
     * POST :{ return a potion }
     */
    public Potion getPoti(){
        return poti;
    }
    /**
     * PRE:{DefensiveP>0}
     * POST:{Returns a double}
     * It gets the defensive points of the wizard 
     * 
     * @return the defensive points of the wizard
     */
    public double getDefensiveP(){
        return defensiveP;
    }
    /**
     * PRE:{DefensiveP>0 && Offensive >0}
     * POST:{Returns a double}
     * It gets the defensive points plus the offensive points of the wizard 
     * 
     * @return the defensive plus the offnsive  points of the wizard
     */
    public double getOffensiveAndDefensiveP(){
        return defensiveP+offensiveP;
    }
    /**
     * PRE:{OffensiveP>0}
     * POST:{Returns a double}
     * It gets the offensive points of the wizard 
     * 
     * @return the offensive points of the wizard
     */
    public double getOffensiveP(){
        return offensiveP;
    }
    
    /**
     * PRE:{EnergyP>=0}
     * POST:{Returns a double}
     * It gets the Energy points of the wizard 
     * 
     * @return the Energy points of the wizard
     */
    public double getEnergyP(){
        return energyP;
    }
    
    /**
     * PRE:{name has to be initialized}
     * POST:{Returns a string}
     * It gets name of the wizard 
     * 
     * @return the name of the wizard
     */
    public String getName(){
        return name;
    }
    
    /**
     * PRE:{Wand has to be initialized}
     * POST:{Returns a Wand}
     * It gets the wand of the wizard 
     * 
     * @return the wand of the wizard
     */
    public Wand getWand(){
        return wand;
    }
    
    /**
     * PRE:{OffensiveP has to be inicialized}
     * POST:{void return}
     * It sets the offensive points of the wizard 
     * @param p the new value of Offensive points
     * 
     */
    public void setOffensiveP(double p){
        offensiveP = p;
    }
    
    /**
     * PRE:{DefensiveP has to be inicialized}
     * POST:{void return}
     * It sets the defensive points of the wizard 
     * @param p the new value of Defensive points
     * 
     */
    public void setDefensiveP(double p){
        defensiveP = p;
    }
    
    /**
     * PRE:{energyP has to be inicialized}
     * POST:{void return}
     * It sets the energy points of the wizard 
     * @param p the new value of energy points, p<=0
     *          
     * 
     */
    public void setEnergyP(double p){
        energyP = p;
        if (energyP <= 0) {
            energyP = 0;
        }
    }
    
    /**
     * PRE:{There must be a potion tu use}
     * POST:{void return}
     * It uses a potion
     * 
     */
    public void usePoti(){
        if(poti != null){
            poti.usePotion(this);
        }
    }
    /**
     * @param number the number which precision we want to correct
     * @param digits the number of decimals we want number to have
     * 
     * @return the number with his presision corrected
     */
    
      public static double decimals(double number, int digits) {
        double result;
        result = number * Math.pow(10, digits);
        result = Math.round(result);
        result = result/Math.pow(10, digits);
        return result;
    }
    /**
     * PRE:{the object must be created} 
     * POST:{it converts an objetc to a string}
     * It returns a string
     * @return The object converted into a string
     */
    public String toString(){
        return "character:"+"<" + getName() + ">" + " <e: " + decimals(getEnergyP(),2) + 
        "> " + "<o: " + decimals(getOffensiveP(),2) + "> " + "<d: " + decimals(getDefensiveP(),2) + "> " 
        + "<" + getWand().toString() + ">";
    }
}

