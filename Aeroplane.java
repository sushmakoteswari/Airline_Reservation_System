package stringexamples;
import java.util.*;
import java.util.Scanner;
import stringexamples.FlightInfo;
import stringexamples.FlightData;

public class Aeroplane{
	
	private static String origin;
    private static String destination;
    private static List<FlightInfo> bookedTickets = new ArrayList<>();


	public static void main(String[] args) {
		System.out.println("\t|-----------------------------------------|");
		System.out.println("\t|         WELCOME to FLYHIGH AIRLINES     |");
		System.out.println("\t|-----------------------------------------|");
    	System.out.println("\t\t\t       |");
    	System.out.println("\t\t\t      / \\");
    	System.out.println("\t\t\t     /___\\");
    	System.out.println("\t\t\t   //     \\\\");
    	System.out.println("\t\t\t  / |  0  | \\");
    	System.out.println("\t\t\t /  |  0  |  \\");
        System.out.println("\t\t\t|  /|  0  |\\  |");
        System.out.println("\t\t\t|  |/     \\|  |");
        System.out.println("\t\t\t|_____________|");
        
        System.out.println("\t");
        Scanner scanner = new Scanner(System.in);
        System.out.println("!!!SignUp!!!\n"+"Please enter ok to signup:");
         String ok = scanner.next();
         if(ok == ok ) {
       	System.out.println("Enter your details:");
        details();
        }
         
         while(true) {
         System.out.println("Welcome to the Flight Booking System!");
         System.out.println("1. Book a Ticket");
         System.out.println("2. Cancel a Ticket");
         System.out.println("3. View Booking Details");
         System.out.println("4. Exit");
         System.out.print("Enter your choice (1-4): ");
         
         int choice = scanner.nextInt();
         switch (choice) {
         case 1:
             // Code for booking a ticket
             System.out.println("You selected 'Book a Ticket'.");
             bookTickets();
             break;
         
         case 2:
             // Code for canceling a ticket
             System.out.println("You selected 'Cancel a Ticket'.");
             cancelTicket();
             break;
         
         case 3:
             // Code for viewing booking details
             System.out.println("You selected 'View Booking Details'.");
             viewBookingDetails();
             break;
         
         case 4:
             // Exit the program
             System.out.println("Exiting the Flight Booking System.");
             System.exit(0);
             break;
         
         default:
             // Handle invalid input
             System.out.println("Invalid choice. Please enter a number from 1 to 4.");
             break;
     }
         }
     
         
        
        
    	
       	}
	
	
	
	//Details for signup
	public static void details() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Name:");
	        String name = sc.next();
	        System.out.println("Age:");
	        int age = sc.nextInt();
	        System.out.println("Phone Number:");
	        long phone_number = sc.nextLong();
	        System.out.println("Email:");
	        String email = sc.next();
	        
	        System.out.println("Successfully signed Up");
	        
		
	}
	
	public static void bookTickets() {
	    Scanner scanner = new Scanner(System.in);

	    // Create a flight database
	    Map<String, FlightInfo> flightDatabase = FlightData.createFlightDatabase();

	    // Display booking interface
	    System.out.println("Book Tickets");
	    System.out.println("Available destinations:");
	    System.out.println("Origins:\n1. Delhi  2. Mumbai  3. Vijaywada  4. Hyderabad  5. Pune  6. Banglore");
	    System.out.println("Destinations:\n7. Munnar  8. Hongkong  9. Incheon(SK)  10. Tokyo");
	    System.out.println("11. Abu Dhabi  12. Bali  13. Paris  14. Italy  15. Goa");

	    // Input origin and destination
	    System.out.print("From: ");
	    String origin = scanner.next();
	    System.out.print("To: ");
	    String destination = scanner.next();

	    // Generate a key for the flight database based on origin and destination
	    String key = origin + "_" + destination;

	    // Check if flight information is available for the specified destinations
	    if (flightDatabase.containsKey(key)) {
	        FlightInfo flightInfo = flightDatabase.get(key);
	        System.out.println("Available Flight Information:\n" + flightInfo);
	    } else {
	        System.out.println("Sorry, there is no flight information available for the specified destinations.");
	    }

	    // Input the number of tickets to book
	    System.out.println("Enter the number of Tickets: ");
	    int count = scanner.nextInt();
	    String userRoute = origin + "_" + destination;

	    // Check if the route exists in the flightDatabase
	    if (flightDatabase.containsKey(userRoute)) {
	        // Retrieve the FlightInfo object for the user's route
	        FlightInfo flightInfo = flightDatabase.get(userRoute);

	        // Getting the cost from the FlightInfo object
	        double cost = flightInfo.getCost();

	        // Calculate and display the total cost
	        double totalCost = count * cost;
	        
	        System.out.println("Cost for " + userRoute + ": " + cost);
	        System.out.println("The total cost would be: " + totalCost);
	        
	        FlightInfo bookedTicket = new FlightInfo(flightInfo.getFlightName(), flightInfo.getCost(), flightInfo.getTimeTaken());
	        bookedTickets.add(bookedTicket);

	        
	        
	    } else {
	        System.out.println("Route not found in the database");
	    }
	    

	}

	
	public static void cancelTicket() {
	    Scanner scanner = new Scanner(System.in);
	    
	    if (bookedTickets.isEmpty()) {
            System.out.println("No tickets have been booked.");
        } else {
            System.out.println("List of booked tickets:");
            for (FlightInfo ticket : bookedTickets) {
                System.out.println(ticket);
                System.out.println("Your tickets are Cancelled successfully");
            }
        }
	}

	
	public static void viewBookingDetails() {
		System.out.println("Booking Details");

        if (bookedTickets.isEmpty()) {
            System.out.println("No tickets have been booked.");
        } else {
            System.out.println("List of booked tickets:");
            for (FlightInfo ticket : bookedTickets) {
                System.out.println(ticket);
            }
        }
       		
	}
	    
	    
	


}
//To take the input and provide data for user
class FlightInfo {
    private String flightName;
    private double cost;
    private String timeTaken;

    public FlightInfo(String flightName, double cost, String timeTaken) {
        this.flightName = flightName;
        this.cost = cost;
        this.timeTaken = timeTaken;
    }

    public String getFlightName() {
        return flightName;
    }

    public double getCost() {
        return cost;
    }

    public String getTimeTaken() {
        return timeTaken;
    }

    @Override
    public String toString() {
        return "Flight: " + flightName + "\nCost: Rs." + cost + "\nTime Taken: " + timeTaken;
    }



}
    





