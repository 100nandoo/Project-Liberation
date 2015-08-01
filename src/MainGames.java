import java.util.Scanner;

public class MainGames {

	public static void main(String[] args) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		Character p1 = new Character();
		Map NorthSacros = new Map(p1);
		//p1.setLvl(5);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~Welcome to Liberation Games~~~~~~~~~~~~~~~~~~~~~~~~");
        prologue();
		System.out.print("Enter your character name? ");
		p1.setName(sc.nextLine()); 
		System.out.println("Hello " + p1.getName());
		NorthSacros.openMap(p1, NorthSacros);

	}

	public static void prologue(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~PROLOGUE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" In the early age of civilization, in the dark forest where" +
                "\n strage voice terror the night. There is a village surrounded by huge" +
                "\n jungle. They're called people of Gremar. They live by hunting wilds," +
                "\n day after day. There are not much tools that they can use, just spears" +
                "\n with the word 'Bremar' carved in handle side. " +
                "\n\t In the evening, of Twinn years. There is a boy was born. His body is" +
                "\n small for a Bremar, and his forehead is little big. The Vallarth say," +
                "\n 'This child is peculiar. I believe he will become terrible hunter.'" +
                "\n Although this child is strage, his mother look him with a very joyful" +
                "\n smile. " +
                "\n\t Five years has past and it's time for Matching Path Ceremony. Where" +
                "\n every boy age of five will be pair and be rival until age of thirty." +
                "\n Another ceremony will be held to see who is one of them is a better" +
                "\n hunter and the winner will be married. Due to population of men is twice" +
                "\n than woman. The loser won't be married for the rest of their lives." +
                "\n\t 'Jerra you need to focus if you wanna catch something big today' said" +
                "\n his father. Jerra is always thin for whole of his life, because of his" +
                "\n small body, he can't throw spear straight. People of Bremar start to hunt" +
                "\n their food in the age of twelve. 'Ok father, I'll try my best' said Jerra." +
                "\n His face is a bit sad because he didn't catch anything since yesterday. He" +
                "\n take a deep breath, and grab his spear that is hanged on the wall. As he" +
                "\n walk to the forest, people will start to see him with a smirk smile," +
                "\n nobody respect him." +
                "\n\t It's three hours until sunset. His heart is beating fast, his body is " +
                "\n mucky. 'I have to find at least a squirrel today' he said to himself." +
                "\n Jerra start to worry and he try as his best to be calm." +
                "\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}