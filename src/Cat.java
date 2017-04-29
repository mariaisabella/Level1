import javax.swing.JOptionPane;

/** Copyright The League of Amazing Programmers 2013-2017
 *    Level 1
 *    Cat
 *    Duration=0.5
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=Create your own object
*/

public class Cat {

    private String name;
    private int lives = 9;

    Cat(String name) {
        this.name = name;
    }

    void meow() {
        System.out.println("meeeeeooooooooooowwwwwwwww!!");
    }

    public void printName() {
        if (name == null)
            System.out.println("i don't know my own name!");
        else
            System.out.println("my name is " + name);
    }

    void kill() {
        lives--;
        if (lives > 0)
            System.out.println("nice try, but I still have " + lives + " lives left");
        else if (lives < 0)
            System.out.println("that's overkill yo!");
        else
            System.out.println("DEAD CAT :(");
    }
    
    void printLives() {
    	if(lives == 0)
    		System.out.println("I am a dead cat :( .");
    	else 
    		System.out.println("I have " +lives+ " lives left.");   
    }
    
    int getLives() {
    	return lives;
    }

    public static void main(String[] args) {
        /* Do the following things without changing the Cat class */
    	Cat kitty = new Cat("Mr. Wiskers");
        // 1. Make the Cat meow
        kitty.meow();
        // 2. Get the Cat to print it's name
        kitty.printName();
        // 3. Kill the Cat!
      //  for(int i=0 ; i<9 ; i++){
        	kitty.kill();
        	kitty.getLives();
        }
    }

