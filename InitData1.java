import java.io.*;
/**
 * Initial data from the game
 *Nombre del grupo: Depé SL
 * @author Daniel Corzo González, Angel Romero Trigo & Manuel Rodriguez Rodriguez
 * @version 1.0
 */
public class InitData1
{
    //initialization of all the wands
    private Wand n1;
    private Wand n2;
    private Wand n3;
    private Wand n4;
    private Wand n5;
    private Wand n6;
    private Wand n7;
    private Wand n8;
    private Wand n9;
    private Wand n10;
    

    //initialization of all the houses
    private House gryffindor;
    private House hufflepuff;
    private House slytherin;

    //initialization of all the potions
    private Potion invigoritationPotion;
    private Potion felixFelicisPotion;

    //initialization of all the characters
    private Character harry;
    private Character hermione;
    private Character ron;
    private Character neville;
    
    private Character cedric;
    private Character nymphadora;
    private Character pomona;
    private Character rolf;
     
      
    
    private Character draco;
    private Character  dolores ;
      private Character    pansy ;
        private Character   albus;
    
    //initialization of comparators' house
    private MegaComparator mg1;
    private MegaComparator mg2;
    private MegaComparator mg3;

    /**
     * PRE:{All the clases must be initialized}
     * POST:{It doesnt's return any error}
     * 
     * It creates all the objects used on the game
     * 
     * @throws IOException
     */
    public InitData1() throws IOException
    {
        // New wands  
        //-----------------------
        n1 = new HawthornWandBehavior("Larch");
        n2 = new HollyWandBehavior("Rowan");
        n3 = new HawthornWandBehavior("Hazel");
        n4 = new HollyWandBehavior("Tamarack");
        n5 = new HawthornWandBehavior("Spruce");
        n6 = new HawthornWandBehavior("Laurel");
        n7 = new HawthornWandBehavior("Ivy");
        n8 = new HawthornWandBehavior("Yew");
        n9 = new HawthornWandBehavior("Pine");
        n10 = new HawthornWandBehavior("Pear");
        
       
        

        //Comparators
        //-----------
        mg1 = new ComparatorGryffindor();
        mg2 = new ComparatorSlytherin();
        mg3 = new ComparatorHufflepuff();
        
        // New houses  
        //-----------------------
        gryffindor = new House("Gryffindor", mg1);
        hufflepuff = new House("Hufflepuff", mg3);
        slytherin = new House("Slytherin", mg2);

        //New potions
        //----------------------
        invigoritationPotion=new InvigoritationPotion(); 
        felixFelicisPotion=new FelixFelicisPotion();

        //Gryffindor's characters
        //----------------------------
        harry = new Offensives("Harry Potter",new HawthornWandBehavior("HarryW"));
        hermione = new Defensives("Hermione Granger", new HollyWandBehavior("HermioneW"));
        ron = new Defensives("Ron Weasley",new HawthornWandBehavior("RonW"));
        neville      = new Defensives("Neville Longbottom", new HawthornWandBehavior("NevilleW"));

        //Hufflepuff's characters
        //------------------------------
        cedric = new Defensives("Cedric Diggory", new HawthornWandBehavior("CedricW")); 
        nymphadora = new Defensives("Nymphadora Tonks", new HawthornWandBehavior("NymphadoraW"));
        pomona = new Offensives("Pomona Sprout", new HawthornWandBehavior("PomonaW"));
        rolf = new Defensives("Rolf Scamander", new HawthornWandBehavior("RolfW") );
        

        //Slytherin's characters
        //----------------------
        draco = new Defensives("Draco Malfoy", new HollyWandBehavior("DracoW"));
         dolores = new Offensives("Dolores Umbridge",new HollyWandBehavior("DoloresW") );
        pansy  = new Offensives("Pansy Parkinson", new HawthornWandBehavior("PansyW"));
         albus = new Offensives("Albus Severus Potter",new HollyWandBehavior("AlbusW"));
        
        
    }

    /**
     * The main module of the game
     * Provide a very simple demonstration of how the game
     * might be used. Details of each class are shown, the
     * figh beguns, and then the details of the winner are shown
     * 
     * @throws IOException if there is an error in Input/Output operations
     */

    public void main() throws IOException{
        Hogwarts hogwarts = Hogwarts.getInstance();
        LogFile lg = LogFile.getInstance();
        String chain;

        harry.assignPoti(invigoritationPotion);
        harry.usePoti();
        harry.assignPoti(felixFelicisPotion);
        harry.usePoti();
        
        hermione.assignPoti(invigoritationPotion);
        hermione.usePoti();
        ron.assignPoti(felixFelicisPotion);
        ron.usePoti();

        hogwarts.newWand(n1);
        hogwarts.newWand(n2);
        hogwarts.newWand(n3);
        hogwarts.newWand(n4);
        hogwarts.newWand(n5);
        hogwarts.newWand(n6);
        hogwarts.newWand(n7);
        hogwarts.newWand(n8);
        hogwarts.newWand(n9);
        hogwarts.newWand(n10);
        
        

        
        gryffindor.addMember(harry);
        gryffindor.addMember(hermione);
        gryffindor.addMember(ron);
        gryffindor.addMember(neville);
   
        gryffindor.orderWizards();

        cedric.assignPoti(invigoritationPotion);
        cedric.usePoti();
        
        pomona.assignPoti(felixFelicisPotion);
        pomona.usePoti();
        
      
        
        hufflepuff.addMember(cedric);
        hufflepuff.addMember(nymphadora);
        hufflepuff.addMember(pomona);
        hufflepuff.addMember(rolf);
        
        
        hufflepuff.orderWizards();

        pansy.assignPoti(felixFelicisPotion);
        pansy.usePoti();
        
        slytherin.addMember(draco);
        slytherin.addMember(albus );
        slytherin.addMember(dolores );
        slytherin.addMember(pansy);
        
        
        slytherin.orderWizards();
        hogwarts.newHouse("Hufflepuff", hufflepuff);
        hogwarts.newHouse("Slytherin", slytherin);
        hogwarts.newHouse("Gryffindor", gryffindor);

        hogwarts.showHouses();
        hogwarts.showWands();
        for (int i = 0; i < 10 && !hogwarts.winCondition(); i++){
            chain = "turn: <" + i + ">";
            lg.write(chain);
            System.out.println(chain);

            hogwarts.fight();

            lg.write(" ");
            System.out.println(" ");
        }

        chain = "end of the simulation";
        lg.write(chain);
        System.out.println(chain);

        chain = "----------------------";
        lg.write(chain);
        System.out.println(chain);

        hogwarts.showHouses();
        hogwarts.showWands();
        hogwarts.showDungeon();
        hogwarts.showWinnerHouse();

        lg.close();
    }

}
