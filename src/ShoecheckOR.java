import java.util.Scanner;
public class ShoecheckOR {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter the shoe colour. Make sure to enter it in all lower case!");
        String shoeColour = myObj.next();

        System.out.println("Is the shoe colour brown or black");
        if (shoeColour == "brown" || shoeColour == "black"){
            System.out.println("Yes!");
        }
        else{
            System.out.println("No!");
        }
    }
}
