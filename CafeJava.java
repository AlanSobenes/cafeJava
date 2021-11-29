public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 4;
        double latte = 3.25;
        double cappuccino = 4.25;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if(isReadyOrder4){
            System.out.println(generalGreeting + customer4 + readyMessage);
            System.out.println(customer4+", " + displayTotalMessage + cappuccino);
        }

        System.out.println(generalGreeting + customer2 + " you have ordered 2 Lattes. "  + displayTotalMessage + (latte*2));
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }else{
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + ", you ordered a Coffee but where charged for a Latte. " + displayTotalMessage + (dripCoffee - latte) );



    }
}