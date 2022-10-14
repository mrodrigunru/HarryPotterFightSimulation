import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.io.*;

/**
 * Model some details of Hogwarts 
 *Nombre del grupo: Depé SL
 * @author Daniel Corzo González, Ángel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class Hogwarts
{ 
    /**
     * A comparator of the energy points 
     */
    public class ComparatorEnergy implements Comparator<Character>
    {

        public int compare (Character c1, Character c2){
            int i =0;
            if (c1.getEnergyP() < c2.getEnergyP()) i = -1;
            if (c1.getEnergyP() > c2.getEnergyP()) i = 1;
            if(c1.getEnergyP() == c2.getEnergyP()){
                if (c1.getName().compareTo(c2.getName()) < 0) i = -1;
                if (c1.getName().compareTo(c2.getName()) > 0) i = 1;
            }
            return i;
        }
    }

    /**
     * A comparator of Wands
     */
    public class ComparatorWands implements Comparator<Wand>
    {

        public int compare (Wand w1, Wand w2){
            int i =0;
            if (w1.getName().compareTo(w2.getName()) < 0) i = -1;
            if (w1.getName().compareTo(w2.getName()) > 0) i = 1;
            return i;
        }
    }

    /**
     * A comparator of Characters
     */
    public class ComparatorMembers implements Comparator<House>
    {

        public int compare (House h1, House h2){
            int i =0;
            if (h1.getmembers().size() > h2.getmembers().size()) i = 1;
            if (h1.getmembers().size() < h2.getmembers().size()) i = -1;
            return i;
        }
    }

    //An instance of Hogwarts
    private static Hogwarts instance = null;
    //A hashmap of the houses
    private HashMap<String, House> houses;
    //An arraylist of the characters
    private ArrayList<Character> characters;
    //An arraylist of the characters
    private ArrayList<Character> fighters;
    //An arraylist of the characters on the dungeon
    private ArrayList<Character> dungeon;
    //A Linked hashmap of the wands
    private LinkedHashSet<Wand> wands;
    /**
     * Constructor for objects of class Hogwarts
     */
    private Hogwarts()
    {
        characters = new ArrayList<Character>();
        dungeon = new ArrayList<Character>();
        wands = new LinkedHashSet<Wand>();
        houses = new LinkedHashMap <String, House> ();
        fighters = new ArrayList<Character>();
    }

    /**
     * PRE:{There is not another Hogwarts created}
     * 
     * POST:{It creates a Hogwarts object}
     * 
     * Creates an Instace of a Hogwarts
     * @return The instance of Hogwarts
     */
    public static Hogwarts getInstance(){
        if(instance ==null){
            instance = new Hogwarts();
        }
        return instance;
    }

    /**
     * PRE:{The item has to be initialized}
     * 
     * POST:{It sets an instance of Hogwarts}
     * 
     * @param instance The instance of Hogwarts
     */
    public static void setInstance(Hogwarts instance){
        Hogwarts.instance = instance;
    }

    /**
     * PRE:{The item has to be initialized}
     * 
     * POST:{it returns a Set}
     * 
     * @return A set with the wands
     */
    public Set getSet()
    {
        return wands;
    }

    /**
     * PRE:{The item has to be initialized}
     * 
     * POST:{it returns an Array List}
     * 
     * @return An Array list with the characters
     */
    public ArrayList getArrayList()
    {
        return characters;
    }

    /**
     * PRE:{The item has to be initialized}
     * 
     * POST:{it returns a Map}
     * 
     * @return A map with the houses
     */
    public Map getMap(){
        return houses;
    }

    /**
     * PRE:{The wands set has to be initialized}
     * POST:{void return}
     * It adds a wand to the set
     * 
     * @param w The wands which is going to be added to the set
     */
    public void newWand(Wand w){
        wands.add(w);
    }

    /**
     * PRE:{The wands set has to be initialized}
     * POST:{it return a Wand}
     * It gets a wand from the set
     * 
     * @param w The wands which is going to be taken from the set
     * @return The wand taken from the set
     */
    public Wand getWand(Wand w){
        ArrayList<Wand> aux = new ArrayList<Wand> (wands);
        return aux.get(aux.indexOf(w));
    }

    /**
     * PRE:{The wands set has to be initialized}
     * POST:{void return}
     * It deletes a wand from the set
     * 
     * @param w The wands which is going to be deleted from the set
     */
    public void deleteWand(Wand w){
        if(wands.contains(w)){
            wands.remove(w);
        }
    }

    /**
     * PRE:{The houses map has to be initialized}
     * POST:{void return}
     * It puts a house to the map
     * 
     * @param n The name of the house
     * @param h The house itself
     */
    public void newHouse(String n, House h){
        houses.put(n, h);
    }

    /**
     * PRE:{The characters list has to be initialized}
     * POST:{void return}
     * It puts a new character in the list
     * 
     * @param c The character who is going to be added
     */
    public void newFighter(Character c){
        fighters.add(c);
    }
    
    /**
     *
     * It checks the energy of the fighters
     * 
     * @param attacker The attacker 
     * @param defender The defender
     * @return True if both EP are greater than 0, false on the other case
     */
    public boolean checkEnergy(int attacker, int defender){
        boolean flag = true;
        if (fighters.get(attacker).getEnergyP() == 0 || fighters.get(defender).getEnergyP() == 0) flag = false;
        return flag;
    }

    /**
     *
     * It gets the total damage produced
     * 
     * @param c1 One of the fighters 
     * @param c2 The other fighter
     * @return the total damage
     */
    public double damageCalculation(Character c1, Character c2){
        double total = 0;
        double attacker = c2.getWand().getAtkPoints(c2.getEnergyP(), c2.getOffensiveP());
        double defender = c1.getWand().getResPoints(c1.getEnergyP(), c1.getDefensiveP());
        if(defender < attacker){
            total = attacker - defender;
        }

        return total;
    }

    /**
     *
     * It prints the houses with all his characters
     * 
     * @throws IOException if there is an error in Input/Output operations
     */
    public void showHouses() throws IOException
    {

        printing("houses:");
        printing("------------");

        for (House house : houses.values()){
            printing(house.toString());
            house.showHouseByOne();
            printing(" ");
        }

    }

    /**
     *
     * It returns if there is only one house with members
     * 
     * @return if the simulation has to finish
     */
    public boolean winCondition(){
        boolean win = false;
        int alive = 0;
        for(House h1 : houses.values()){
            if(h1.getmembers().size() != 0){
                alive++;
            }
        }
        if(alive == 1) win = true;
        return win;
    }

    /**
     *
     * It prints the wands lsit
     * 
     * @throws IOException if there is an error in Input/Output operations
     */
    public void showWands() throws IOException
    {
        printing("new wands");
        printing("---------- ");
        List<Wand> list = new ArrayList<Wand>(wands); 
        Collections.sort(list,new ComparatorWands());
        wands.clear();
        wands.addAll(list);

        Iterator<Wand> it=wands.iterator();
        while(it.hasNext())
        {
            printing(it.next().toString());

        }

        printing(" ");
    }

    /**
     *
     * It prints the characters in the dangeon 
     * 
     * @throws IOException if there is an error in Input/Output operations
     */
    public void showDungeon()throws IOException{
        Iterator<Character> it=dungeon.iterator();

        printing("dungeon characters:");
        printing("-------------------");
        while(it.hasNext())
        {
            printing(it.next().toString());
        }

        printing(" ");
    }

    /**
     *
     * It gets and prints the winner house with all his characteristics
     * 
     * @throws IOException if there is an error in Input/Output operations
     */
    public void showWinnerHouse()throws IOException{
        House winner = null; 
        House aux=null;
        printing("the winner house is:");
        printing("-------------------");
        double save3=0;
        double save4=0;
        double save5=0;
        double save6=0;

        for(House h0: houses.values()){
            winner=h0;

        }
        for(House h1 : houses.values()){
            for (House h2 : houses.values()){
                if(h1.getmembers().size() >= h2.getmembers().size() && !h1.equals(h2)){
                    aux=h1;

                    if(aux.getmembers().size()>winner.getmembers().size()){
                        winner = aux;

                    }else if(aux.getmembers().size()==winner.getmembers().size()&& !aux.equals(winner))
                    { 

                        List Membersh3=aux.getmembers();
                        List Membersh4=winner.getmembers();
                        Iterator<Character> c3=Membersh3.iterator();
                        Iterator<Character> c4=Membersh4.iterator();
                        while(c3.hasNext()){
                            save3=save3+c3.next().getEnergyP();
                        }
                        while(c4.hasNext()){
                            save4=save4+c4.next().getEnergyP();
                        }
                        if(save3>save4){
                            winner=aux;
                        }else if(save3==save4 )
                        {
                            List Membersh5=aux.getmembers();
                            List Membersh6=winner.getmembers();
                            Iterator<Character> c5=Membersh5.iterator();
                            Iterator<Character> c6=Membersh6.iterator();
                            while(c5.hasNext()){
                                save5=save5+c5.next().getOffensiveAndDefensiveP();
                            }
                            while(c6.hasNext()){
                                save6=save6+c6.next().getOffensiveAndDefensiveP();
                            }
                            if(save5<save6){
                                winner=aux;
                            }
                        }
                    }

                } 
            }
        }

        printing(winner.toString());
        winner.showHouseByOne();
    }

    /**
     *
     * It prints a chain both in logFile and console
     * 
     * @throws IOException if there is an error in Input/Output operations
     */
    public void printing (String chain)throws IOException{
        LogFile lg = LogFile.getInstance();
        lg.write(chain);
        System.out.println(chain);

    } 

    /**
     * It corrects the float numbers approximation error
     * 
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
     *
     * It does the battle and prints all its characteristics
     * 
     * @throws IOException if there is an error in Input/Output operations
     */
    public void fight() throws IOException{
        List<Wand> list = new ArrayList<Wand>(wands); 
        Collections.sort(list, new ComparatorWands());
        wands.clear();

        printing("characters who are going to duel: ");
        printing("--------------------------------------------");

        for (House house : houses.values()){
            if(house.characterDemanded() != null){
                fighters.add(house.characterDemanded());
            }
        }

        Collections.sort(fighters, new ComparatorEnergy());

        for (int k = 0 ; k<fighters.size() ; k++){
            printing(fighters.get(k).toString());
        }
        printing("duels:");
        printing("-----");
        int attacker = 0;
        for(Character wizard : fighters){

            for (int j = 0; j < fighters.size(); j++){
                if (attacker != j){
                    printing("<" + wizard.getName() + "> is dueling against <" + fighters.get(j).getName() + ">");
                    if(checkEnergy(attacker, j)){

                        printing("attack points of <" + wizard.getName() + "> are: <" + decimals(wizard.getWand().getAtkPoints(wizard.getEnergyP(), wizard.getOffensiveP()),2)+ ">");

                        printing("resistance points of <"+ fighters.get(j).getName() + "> are: <" + decimals(fighters.get(j).getWand().getResPoints(fighters.get(j).getEnergyP(), fighters.get(j).getDefensiveP()),2) + ">");

                        fighters.get(j).setEnergyP(fighters.get(j).getEnergyP() - damageCalculation(fighters.get(j), wizard));

                        printing("the remaining energy of <" + fighters.get(j).getName() + "> after the duel are: <"+ decimals(fighters.get(j).getEnergyP(),2) + ">");
                        printing(" ");
                    }
                }
            }
            attacker ++;
        }

        printing("duel results:");
        printing("------------");

        for (int i = 0; i < fighters.size(); i++){
            if(wands.size() > 0){
                fighters.get(i).deleteWand();
            }

            if(fighters.get(i).getEnergyP() <= 0){
                dungeon.add(fighters.get(i));
                for(House house : houses.values()){
                    if(house.getmembers().contains(fighters.get(i))){
                        house.removeCharacter(fighters.get(i));

                    }

                }
                printing(fighters.get(i).toString() + "goes to the dungeon");
            }
            else{
                for(House house : houses.values()){
                    if(house.getmembers().contains(fighters.get(i))){
                        house.removeCharacter(fighters.get(i));
                        house.addMember(fighters.get(i));
                    }

                }
                printing(fighters.get(i).toString() + "returns to the house");

                if(!list.isEmpty()){
                    fighters.get(i).assignWand(list.get(0));
                    printing("new wand assigned: <" + list.get(0).getName() + " (" + list.get(0).getClass().getName() + ")>");
                    list.remove(0);
                }

            }

        }

        printing(" ");
        wands.addAll(list);
        fighters.clear();

    }
}
