package madlibs;

    import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // this line allows the computer to read from the keyboard

        System.out.println("Enter an animal");//why won't u let meeeee ruuuuuuuunnnn uuuuhhhhhhgggg!!!!
        String animal = input.nextLine();
        System.out.println("Enter a person");
        String person = input.nextLine();
        System.out.println("Enter an adjective");
        String adj1 = input.nextLine();
        System.out.println("Enter an adjective");
        String adj2 = input.nextLine();
        System.out.println("Enter something scary");
        String scary = input.nextLine();
        System.out.println("Enter a thing");
        String thing = input.nextLine();
        System.out.println("Enter a food (plural)");
        String foods = input.nextLine();
        System.out.println("Enter a monster");
        String mons = input.nextLine();
        System.out.println("Enter a verb");
        String verb = input.nextLine();
        System.out.println("Enter a number");
        String num = input.nextLine();
        System.out.println("I was worried my Halloween was off to a bad start when a black "+animal+" crossed my path, but it turned out ok.\n" 
                + "My best friend "+person+" and I went trick-or-treating the minute it started getting dark.\n"
                + "I dressed as a "+adj1+" "+scary+" and my friend was a "+adj2+" "+thing+". The first few houses gave out their traditional "+foods+" instead of candy.\n"
                + " When we reached the end of the block, my friend dared me to ring the doorbell on the spooky house at the top of the hill.\n"
                + "I tip-toed to the door and just when I was going to push the button (a) "+mons+" answered the door.\n"
                + "I screamed tried to "+verb+" until I realized it was just a mask.\n"
                + "The old lady behind the mask gave me "+num+" candy bars since she didn't have many visitors!");
        }
}
    

