public class lattecheck {
    public static void main(String[] args) {
        String coffeeType = "Latte";

        if (!(coffeeType == "Latte" || coffeeType == "Americano")) {
            System.out.println("No!");
        }
        else{
            System.out.println("Yes!");
        }
    }
}
