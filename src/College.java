import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

/**
 * Created by Nandoo on 7/31/2015.
 */
public class College {
    private boolean con=true;
    private boolean lc=true;
    private int choice;
    private int bookChoice;
    private int lt=2000;
    Scanner sc = new Scanner(System.in);
    public College(){

    }

    public void CollegeMenu(String name, Map m1, Character p1){
       do {
           System.out.println("Welcome to College of " + name);
           System.out.println("-------College Menu-------");
           System.out.println("1. Enter the Library");
           System.out.println("2. Meet Leader of the Vallarth");
           System.out.println("3. Back to the city");
           choice = sc.nextInt();
           switch (choice){
               case 1:
                   LibraryMenu();
                   break;
               case 2:
                   break;
               case 3:
                   con = false;
                   break;
           }
       }while(con);
    }

    public void LibraryMenu(){
        int libraryChoice;
        do {
            System.out.println("--------List of Books-------");
            System.out.println("1. History of Bremar Tribe");
            System.out.println("2. History of Stenmar Tribe");
            System.out.println("3. Duty of Vallarth");
            System.out.println("4. Gollur the Might");
            System.out.println("5. Visar the Bright");
            System.out.println("6. Tovast the Witch");
            System.out.println("7. Prologue");
            System.out.println("8. Exit");
            System.out.println("----------------------------");
            libraryChoice = sc.nextInt();
            switch (libraryChoice){
                case 1:
                    Bremar();
                    break;
                case 2:
                    Stanmar();
                    break;
                case 3:
                    Vallarth();
                    break;
                case 4:
                    Gollur();
                    break;
                case 7:
                    break;
                case 8:
                	lc=false;
                	break;
            }
        }while(lc);

    }

    private void Bremar(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~History of Bremar~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tBremar has settle in Trywood Region for the last two century");
        System.out.println("They have strong build and wide jaw. Hunting was very important");
        System.out.println("skill for them. They have tradition that every boy age of 5,");
        System.out.println("will be pair two be rival for the rest of their life's");
        System.out.println("Just one of them will allow to be married. (Due to woman is rare");
        System.out.println("In Bremar.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter 1 to finish reading the book");
        bookChoice = sc.nextInt();
        if(bookChoice != 1) Bremar();
    }

    private void Stanmar(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~History of Stanmar~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tStanmar Tribe has been extinct for over a decade. Due to great flood");
        System.out.println("by Giha River. But some people said that they are still exist.");
        System.out.println("Their existence can only be confirmed with a spear with words 'Stanmar'");
        System.out.println("carved in the handle, and the sharp edge of the spear coated with");
        System.out.println("Yeyar. Some kind of poisonous plants that also extinct in the great flood.");
        System.out.println("Stanmar live in Giha River long before Bremar arrived in ");
        System.out.println("Trywood Region. They have black hair, small, short and smart. Because ");
        System.out.println("of their brilliant mind, they manage to create irrigation system ");
        System.out.println("for their crops. ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter 1 to finish reading the book");
        bookChoice = sc.nextInt();
        if(bookChoice != 1) Bremar();
    }

    private void Vallarth(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~Duty of Vallarth~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tVallarth (some kind of priest) that study in the College. Most");
        System.out.println("of them is settler comes from across the sea. They're tall, and ");
        System.out.println("have blue eyes. They have rather peculiar lifestyle. Most of the");
        System.out.println("they meditate either in the forest or temple. They can perform");
        System.out.println("sacred ritual, due to their pure heart.");
        System.out.println("On the tongues of men, Vallarth leader can see a person past.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter 1 to finish reading the book");
        bookChoice = sc.nextInt();
        if(bookChoice != 1) Bremar();
    }

    public void Gollur(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~Gollur the Might~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Gollur Valahar, born as Bremar, has spend most of his life in the");
        System.out.println("wilderness. Since the young age has shown his remarkable running ");
        System.out.println("speed and his accuracy throwing hunting spear. Although he's famous");
        System.out.println("in his village, Gollur spend most of his time in solitude. He would");
        System.out.println("climb over a tall tree and start sinking into himself.");
        System.out.println("At the age of 21, he left his village behind and start to try the ");
        System.out.println("Sacred Path to lift the cursed by Tovast. 20 years later, he ");
        System.out.println("came back to his village and show that he didn't have cursed marked ");
        System.out.println("anymore. He died on the age of 50 in his favorite tree. The cause");
        System.out.println("of his death is still unknown.");
        bookChoice = sc.nextInt();
        if(bookChoice != 1) Bremar();
    }

    //-------------Membuat loading dengan titik---------------------------
    public void Loading(int b){
        int x;
        try{
            for(x=0 ; x<b; x+=250){

                Thread.sleep(250);
            }
            System.out.println("");
        }catch(InterruptedException e){

        }
    }
}
