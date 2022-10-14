import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.io.*;
/**
 * Model some details of the Wizard
 * Nombre del grupo: Depé SL
 * @author Daniel Corzo González, Ángel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class House
{

    // An Array List with the members of each house
    private ArrayList<Character> members;
    //The name of the house
    private String name;
    //The comparator of the house
    private MegaComparator mg;
    
    /**
     * Constructor for objects of class House
     * 
     * @param name The name of the house
     */
    public House(String name, MegaComparator mg)
    {
        members = new ArrayList<Character> ();
        this.name=name;
        this.mg = mg;
    }

    /**
     * PRE: {c has to be initialized}
     * POST :{void return}
     * Add a member to a house
     * 
     * @param c The character who is going to be added
     */  
    public void addMember(Character c){
        members.add(c);
    }

    /**
     * PRE: {c has to be initialized}
     * POST :{it returns a Character}
     * It gets a character from a house
     * 
     * @param c The character who is going to be taken
     * @return The character taken
     */  
    public Character getCharacter(Character c){
        Character character = null;
        if(members.contains(c)){
            character = c;
        }
        return character;
    }

    /**
     * It gets a the name of the house
     * 
     * @return The name of the house
     */  
    public String getName(){
        return name;
    }

    /**
     * PRE: {c has to be initialized}
     * POST :{void return}
     * It removes a character from a house
     * 
     * @param c The character who is going to be removed
     */  
    public void removeCharacter(Character c){
        if(members.contains(c)){
            members.remove(c);
        }
    }

    /**
     * PRE:{The house has to be initilized}
     * POST:{Returns a character}
     * It gets the first character of the house list
     * 
     * @return The fisrt character of the list
     */  
    public Character characterDemanded(){
        if(members.size() > 0){
            return members.get(0);
        }
        else{
            return null;
        }
    }

    /**
     * PRE:{The houses have to be initialized}
     * POST:{void return}
     * It sorts the wizards on a house lis, it depends on the house
     * 
     */  
    public void orderWizards(){
       
        Collections.sort(members, mg);
        
    }

    /**
     * PRE: {The arraylist has to be initialized}
     * POST :{It returns a List of characters}
     * it returns the members of the list
     * @return The members of the List
     */  
    public ArrayList<Character> getmembers()
    {
        return members;
    }

    /**
     * PRE: {The arraylist has to be initialized}
     * POST :{void return}
     * it shows the members of the house
     * @throws IOException if there is an error in Input/Output operations
     */  
    public void showHouseByOne() throws IOException
    {   
        LogFile lg = LogFile.getInstance();
        String chain;

        ArrayList<Character> Members=getmembers();
        for(Character c : members)
        {
            chain = c.toString();
            System.out.println(chain);
            lg.write(chain);             
        }
    }

    /**
     * PRE:{the object must be created} 
     * POST:{it converts an object to a string}
     * It returns a string
     * @return The object converted into a string
     */
    public String toString(){
        return "house: <" + getName() + ">";
    }
}

