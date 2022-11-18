public class bankmoneycheck {
    public static void main(String[] args) {
        double balance = 42050.25;
        System.out.println("Your balance is " + balance);

        if (!(balance>=85000)) {
            System.out.println("Your money IS protected.");
        }
        else{
            System.out.println("Your money is NOT protected.");
        }

    }
}
