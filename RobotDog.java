import java.lang.Thread;
import java.util.Scanner;

/** Defines a RobotDog class */
public class RobotDog implements Contract{

    /** Constructs the RobotDog object */
    public RobotDog(){
        System.out.println("You have constructed your Robot Dog! Meet Retro!");
        System.out.println("       /^-^\\");
        System.out.println("      / o o \\");
        System.out.println("     /   Y   \\   \"Woof!\"  ");
        System.out.println("     V \\ v / V");
        System.out.println("       / - \\  ");
        System.out.println("      /    |");
        System.out.println("(    /     |");
        System.out.println(" ===/___) || ");
    }

    /**
     * Plays an animation that simulates throwing an item
     * @param item the item that will be thrown
     * @throws InterruptedException
     */
    public void throwItem(String item) throws InterruptedException {
        System.out.println("\n \n \n \n \n");
        int x=0;
        int j=1;

        while (x < 100){

            String dots = ".".repeat(j);

            String message = "Throwing " + item + " "+ dots + "\n \n \n \n \n \n \n \n \n \n \n";

            System.out.println(message);

            x=x+25;
            j=j+1;

            Thread.sleep(350);
        }

        grab(item);
    }

    /**
     * Prints ASCII art depicting a dog holding an item
     * @param item the item that the dog is holding
     */
    public void grab(String item){

        String firstStr = item.substring(0, 0);

        System.out.println("\n \n \n \n \n");
        System.out.println("       (" + item + ")");
        System.out.println("       /^-^\\");
        System.out.println("      / o o \\");
        System.out.println("     /   Y   \\");
        System.out.println("     V \\ v / V");
        System.out.println("       / - \\  ");
        System.out.println("      /    |");
        System.out.println("(    /     |");
        System.out.println(" ===/___) || ");


        if(firstStr.equals("a")|| firstStr.equals("e") || firstStr.equals("i") || firstStr.equals("o") || firstStr.equals("u")){
            System.out.println("\n" + "Retro has caught an " + item +"!");
        }
        else{
            System.out.println("\n" + "Retro has caught a " + item +"!");}
    }

    /**
     * Prints ASCII Art a dog dropping an item
     * @param item the item the dog drops
     * @returns the item the dog has dropped
     */
    public String drop(String item){

        String firstStr = item.substring(0, 0);
        String message="";

        if (firstStr.equals("a")|| firstStr.equals("e") || firstStr.equals("i") || firstStr.equals("o") || firstStr.equals("u")){
            message="\n" + "Retro has dropped an " + item +"!";
        }
        else {
            message="\n" + "Retro has dropped a " + item +"!";}

        System.out.println("\n \n \n \n \n");
        System.out.println("       /^-^\\");
        System.out.println("      / o o \\");
        System.out.println("     /   Y   \\");
        System.out.println("     V \\ v / V");
        System.out.println("       / - \\  ");
        System.out.println("      /    |");
        System.out.println("(    /     |");
        System.out.println(" ===/___) ||      ("+item+")");
        System.out.println("\n" + message);
        return item; 
    }

    /**
     * Prints an animation of a dog examining an item
     * @param item the item the dog is examining
     * @throws InterruptedException
     */
    public void examine_animation(String item) throws InterruptedException{

        String firstStr = item.substring(0, 0);
        String message="";

        if (firstStr.equals("a")|| firstStr.equals("e") || firstStr.equals("i") || firstStr.equals("o") || firstStr.equals("u")){
            message="\n" + "Retro is examining an " + item +"...";
        }
        else {
            message="\n" + "Retro is examining a " + item +"...";}

        int x=0;

        while (x < 100){

            if (x % 2 == 0){ 

            System.out.println("\n \n \n \n \n");
            System.out.println("                _,)");
            System.out.println("        _..._.-;-'");
            System.out.println("     .-'     `(");
            System.out.println("    /      ;   \\");
            System.out.println("   ;.' ;`  ,;  ;");
            System.out.println("  .'' ``. (  \\ ;");
            System.out.println(" / f_ _L \\ ;  )\\");
            System.out.println(" \\/|` '|\\/;; <;/");
            System.out.println("((; \\_/  (()");
            System.out.println(" ");
            System.out.println("  ("+item+")");
            System.out.println("\n"+message);}
            else {

            System.out.println("\n \n \n \n \n");
            System.out.println("             (,_        ");
            System.out.println("              ';-");
            System.out.println("        _..._.-;");
            System.out.println("     .-'     `(");
            System.out.println("    /      ;   \\");
            System.out.println("   ;.' ;`  ,;  ;");
            System.out.println("  .'' ``. (  \\ ;");
            System.out.println(" / f_ _L \\ ;  )\\");
            System.out.println(" \\/|` '|\\/;; <;/");
            System.out.println("((; \\_/  (()");
            System.out.println(" ");
            System.out.println("  ("+item+")");
            System.out.println("\n"+message);}

            x=x+1;
            Thread.sleep(35);
        }
        examine(item);
    }


    /**
     * Prints ASCII art depicting a dog examining an item
     * @param item the item the dog is examining
     */
    public void examine(String item) {
        String firstStr = item.substring(0, 0);
        String message="";

        if (firstStr.equals("a")|| firstStr.equals("e") || firstStr.equals("i") || firstStr.equals("o") || firstStr.equals("u")){
            message="\n" + "Retro has examined an " + item +"!";
        }
        else {
            message="\n" + "Retro has examined a " + item +"!";}

        System.out.println("\n \n \n \n \n");
        System.out.println("                _,)");
        System.out.println("        _..._.-;-'");
        System.out.println("     .-'     `(");
        System.out.println("    /      ;   \\");
        System.out.println("   ;.' ;`  ,;  ;");
        System.out.println("  .'' ``. (  \\ ;");
        System.out.println(" / f_ _L \\ ;  )\\");
        System.out.println(" \\/|` '|\\/;; <;/");
        System.out.println("((; \\_/  (()");
        System.out.println(" ");
        System.out.println("  ("+item+")");
        System.out.println("\n"+message);
    }


    /**
     * Prints ASCII art of a dog using an item
     * @param item the item the dog will use
     */
    public void use(String item){
        System.out.println("\n \n \n \n \n");
        if (item.equals("bathroom") || item.equals("Bathroom")){
            System.out.println("\n" + "Retro is using the " + item);

            System.out.println("        |\\");
            System.out.println("        /     /\\/o\\_");
            System.out.println("       (.-.__.(   __o");
            System.out.println("    /\\_(      .----'");
            System.out.println("     .' \\____/");
            System.out.println("    /   /  / \\");
            System.out.println("___:____\\__\\__\\__________________");
            System.out.println("\nSome privacy please! :)");}
        else{ 
            System.out.println("Retro doesn't know how to use a(n) " + item);
        }
    }


    /**
     * Prints ASCII art depicting a dog walking in a certain direction
     * @param direction the direction the dog will be walking
     * @returns true
     */
    public boolean walk(String direction) {
        System.out.println("\n \n \n \n \n");
        System.out.println("\n" + "You and Retro are going on a walk " + direction +"!");
        System.out.println("                  ;~~,__");
        System.out.println("   :-....,-------'`-'._.'");
        System.out.println("    `-,,,  ,       ,'~~'");
        System.out.println("        ; ,'~.__; /--.");
        System.out.println("        :| :|   :|``(;");
        System.out.println("        `-'`-'  `-'");
        return true;
    }

    /**
     * Prints ASCII art depicting a dog flying in a certain direction
     * @param x the degrees north the dog is flying
     * @param y the degrees west the dog is flying
     * @returns true
     */
    public boolean fly(int x, int y){
        System.out.println("\n \n \n \n \n");
        System.out.println("\n" + "Retro is flying "+x+" degrees North and " +y+ " degrees West \n");
        System.out.println("          (\\ /)  .--~~,__");
        System.out.println("   :-....,( \\ )---`~~'._.'");
        System.out.println("    `-,,,  ,_      ;'~U'          (__)  ");
        System.out.println("     _,-' ,'`-__; '--.          (______)");
        System.out.println("    (_/'~~      ''''(;           (____)  ");
        System.out.println("\n \n <^>           <^>           ");
        System.out.println("  |             |       ");
        System.out.println("___________________________________________");
        return true; 
    }
    /**
     * Prints ASCII art depicting a tiny dog
     * @returns 0
     */
    public Number shrink(){
        System.out.println("\n \n \n \n \n");
        System.out.println("\n" + "Retro is shrinking!");
        System.out.println("^.^");
        System.out.println(" .");
        System.out.println(" .--");
        System.out.println("Oh noo, Retro is so tiny that we can't see him!");
        return 0;
    }
    /** Prints ASCII art depicting a giant dog
     * @returns 1
     */
    public Number grow(){
        System.out.println("\n \n \n \n \n");
        System.out.println("\n" + "Retro is growing!");
        System.out.println("           __.");
        System.out.println("        .-\".\'                      .--.            _..._");
        System.out.println("      .\' .\'                     .'    \\       .-\"\"  __ \"\"-.");
        System.out.println("     /  /                     .'       : --..:__.-\"\"  \"\"-. \\");
        System.out.println("    :  :                     /         ;.d$$    sbp_.-\"\"-:_:");
        System.out.println("    ;  :                    : ._       :P .-.   ,\"TP");
        System.out.println("    :   \\                    \\  T--...-; : d$b  :d$b");
        System.out.println("     \\   `.                   \\  `..'    ; $ $  ;$ $");
        System.out.println("      `.   \"-.                 ).        : T$P  :T$P");
        System.out.println("        \\..---^..             /           `-'    `._`._ ");
        System.out.println("       .'        \"-.       .-\"                     T$$$b");
        System.out.println("      /             \"-._.-\"               ._        '^' ;");
        System.out.println("     :                                    \\.`.         /");
        System.out.println("     ;                                -.   \\`.\"-._.-'-'");
        System.out.println("    :                                 .'\\   \\ \\ \\ \\");
        System.out.println("    ;  ;                             /:  \\   \\ \\ . ;");
        System.out.println("   :   :                            ,  ;  `.  `.;  :");
        System.out.println("   ;    \\        ;                     ;    \"-._:  ;");
        System.out.println("  :      `.      :                     :         \\/");
        System.out.println("  ;       /\"-.    ;                    :");
        System.out.println(" :       /    \"-. :                  : ;");
        System.out.println(" :     .'        T-;                 ; ;");
        System.out.println(" ;    :          ; ;                /  :");
        System.out.println(" ;    ;          : :              .'    ;");
        System.out.println(":    :            ;:         _..-\"\\     :");
        System.out.println(":     \\           : ;       /      \\     ;");
        System.out.println(";    . '.         '-;      /        ;    :");
        System.out.println(";  \\  ; :           :     :         :    '-.");
        System.out.println("'.._L.:-'           :     ;          ;    . `.");
        System.out.println("                     ;    :          :  \\  ; :");
        System.out.println("                     :    '-..       '.._L.:-'");
        System.out.println("                      ;     , `.");
        System.out.println("                      :   \\  ; :");
        System.out.println("                      '..__L.:-'");
        System.out.println("OMG Retro is too big!");
        return 1;
    }

    /**
     * Prints ASCII art depicting a dog resting
     */
    public void rest() {
        System.out.println("\n \n \n \n \n");
        System.out.println("            ,/A\\,");
        System.out.println("          .//`_`\\\\,");
        System.out.println("        ,//`____-`\\\\,");
        System.out.println("      ,//`[_RETRO_]`\\\\,");
        System.out.println("    ,//`=  ==  __-  _`\\\\,");
        System.out.println("   //|__=  __- == _  __|\\\\");
        System.out.println("  ` |  __ .-----.  _  |");
        System.out.println("     | - _/       \\-   |");
        System.out.println("     |__  | .-\"-. | __=|");
        System.out.println("     |  _=|/)   (\\|    |");
        System.out.println("     |-__ (/ ~ ~ \\) -__|");
        System.out.println("     |___ /`\\_Y_/`\\____|");
        System.out.println("          \\)8===8(/");
        System.out.println("Retro is resting...Zzz..");
    }

    /**
     * Prints ASCII art depicting a dog undoing an action
     */
    public void undo(){
        System.out.println("\n \n \n \n \n");
        System.out.println("\n" + "Retro has undone his last action");
        System.out.println("       /^-^\\");
        System.out.println("      / o o \\");
        System.out.println("     /   Y   \\   \"~Undo~\"  ");
        System.out.println("     V \\ v / V");
        System.out.println("       / - \\  ");
        System.out.println("      /    |");
        System.out.println("(    /     |");
        System.out.println(" ===/___) || ");
    }

    /**
     * Runs the main interactive program where user can interact with a virtual robot dog. 
     * @param args an empty String array
     * @throws InterruptedException
     */
    public static void main(String[] args)throws InterruptedException {
        RobotDog retro = new RobotDog();

        System.out.println("\n Here are the possible options you can choose to interact with Retro: \n (+) throw  (+) examine \n (+) rest   (+) grow \n (+) shrink (+) walk \n (+) fly    (+) drop \n (+) use    (+) undo \n(type 'stop' to end the game)");

        String x="true";

        Scanner input = new Scanner(System.in);

        while (x.equals("true")) {
    
            System.out.print("\nType which option you would like to use (type 'options' to see menu):");

            String user_response = input.nextLine();

            if (user_response.equals("throw")){
                System.out.print("\n What item would you like to throw at Retro?:");
                String item = input.nextLine();
                retro.throwItem(item);
            }

            if (user_response.equals("examine")){
                System.out.print("\n What item would you like Retro to examine?:");
                String item = input.nextLine();
                retro.examine_animation(item);
            }

            if (user_response.equals("rest")){
                retro.rest();
            }

            if (user_response.equals("grow")){
                retro.grow();
            }

            if (user_response.equals("shrink")){
                retro.shrink();
            }

            if (user_response.equals("walk")){
                System.out.print("\n Which direction would you like to walk? \n up? down? by the sea shore?:");
                String item = input.nextLine();
                retro.walk(item);
            }

            if (user_response.equals("fly")){
                System.out.print("\n How many degrees north (negative for south)?:");
                int x_int = input.nextInt();
                System.out.print("\n How many degrees west (negative for east)?:");
                int y_int = input.nextInt();
                retro.fly(x_int, y_int);
                String reset = input.nextLine(); //resets the scanner so it wont skip next input prompt
            }

            if (user_response.equals("drop")){
                System.out.print("\n What item would you like Retro to drop?:");
                String item = input.nextLine();
                retro.drop(item);
            }

            if (user_response.equals("use")){
                System.out.print("\n What would you like Retro to use? \n bathroom?:");
                String item = input.nextLine();
                retro.use(item);
            }

            if (user_response.equals("undo")){
                retro.undo();
            }

            if (user_response.equals("options")){
                System.out.println("\n Here are the possible options you can choose to interact with Retro: \n (+) throw  (+) examine \n (+) rest   (+) grow \n (+) shrink (+) walk \n (+) fly    (+) drop \n (+) use    (+) undo \n(type 'stop' to end the game)");
            }

            if (user_response.equals("stop")){
                break;}
        }
        input.close();
        System.out.println("\n \n \n \n \n");
        System.out.println("       /^-^\\");
        System.out.println("      / o o \\");
        System.out.println("     /   Y   \\   Goodbye!  ");
        System.out.println("     V \\ v / V");
        System.out.println("       / - \\  ");
        System.out.println("      /    |");
        System.out.println("(    /     |");
        System.out.println(" ===/___) || ");
        System.out.println("Thanks for playing! :D ");
    } 
}
