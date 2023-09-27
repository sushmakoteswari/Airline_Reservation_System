package stringexamples;
import java.util.*;
import java.util.HashMap;
import java.util.Map;


public class FlightData {
	public static Map<String, FlightInfo> createFlightDatabase() {
        Map<String, FlightInfo> flightDatabase = new HashMap<>();
       
            // Delhi to other destinations
            flightDatabase.put("Delhi_Mumbai", new FlightInfo("Air India", 20000.0, "2 hours"));
            flightDatabase.put("Delhi_Vijaywada", new FlightInfo("IndiGo", 7500.0, "2.5 hours"));
            flightDatabase.put("Delhi_Hyderabad", new FlightInfo("SpiceJet", 18000.0, "2 hours"));
            flightDatabase.put("Delhi_Pune", new FlightInfo("GoAir", 9200.0, "2.5 hours"));
            flightDatabase.put("Delhi_Bangalore", new FlightInfo("Vistara", 7800.0, "3 hours"));
            flightDatabase.put("Delhi_Munnar", new FlightInfo("Air India", 15500.0, "9 hours"));
            flightDatabase.put("Delhi_Hongkong", new FlightInfo("Cathay Pacific", 60000.0, "6 hours"));
            flightDatabase.put("Delhi_Incheon(SK)", new FlightInfo("Korean Air", 55000.0, "5.5 hours"));
            flightDatabase.put("Delhi_Tokyo", new FlightInfo("Japan Airlines", 70400.0, "7 hours"));
            flightDatabase.put("Delhi_Abu Dhabi", new FlightInfo("Etihad Airways", 35000.0, "12 hours"));
            flightDatabase.put("Delhi_Bali", new FlightInfo("Garuda Indonesia", 20400.0, "14 hours"));
            flightDatabase.put("Delhi_Paris", new FlightInfo("Air France", 50950.0, "16 hours"));
            flightDatabase.put("Delhi_Italy", new FlightInfo("Alitalia", 60320.0, "16 hours"));
            flightDatabase.put("Delhi_Goa", new FlightInfo("IndiGo", 18000.0, "2 hours"));

            // Mumbai to other destinations
            flightDatabase.put("Mumbai_Delhi", new FlightInfo("Air India", 7000.0, "2 hours"));
            flightDatabase.put("Mumbai_Vijaywada", new FlightInfo("Jet Airways", 180.0, "2 hours"));
            flightDatabase.put("Mumbai_Hyderabad", new FlightInfo("IndiGo", 150.0, "1.5 hours"));
            flightDatabase.put("Mumbai_Pune", new FlightInfo("Air India", 160.0, "1.5 hours"));
            flightDatabase.put("Mumbai_Bangalore", new FlightInfo("SpiceJet", 220.0, "2 hours"));
            flightDatabase.put("Mumbai_Munnar", new FlightInfo("IndiGo", 300.0, "3 hours"));
            flightDatabase.put("Mumbai_Hongkong", new FlightInfo("Cathay Pacific", 700.0, "6.5 hours"));
            flightDatabase.put("Mumbai_Incheon(SK)", new FlightInfo("Korean Air", 650.0, "6 hours"));
            flightDatabase.put("Mumbai_Tokyo", new FlightInfo("Japan Airlines", 750.0, "7.5 hours"));
            flightDatabase.put("Mumbai_Abu Dhabi", new FlightInfo("Etihad Airways", 400.0, "4 hours"));
            flightDatabase.put("Mumbai_Bali", new FlightInfo("Garuda Indonesia", 450.0, "4.5 hours"));
            flightDatabase.put("Mumbai_Paris", new FlightInfo("Air France", 550.0, "6.5 hours"));
            flightDatabase.put("Mumbai_Italy", new FlightInfo("Alitalia", 600.0, "6 hours"));
            flightDatabase.put("Mumbai_Goa", new FlightInfo("SpiceJet", 140.0, "1.5 hours"));

            // Vijaywada to other destinations
            flightDatabase.put("Vijaywada_Delhi", new FlightInfo("IndiGo", 150.0, "2.5 hours"));
            flightDatabase.put("Vijaywada_Mumbai", new FlightInfo("Jet Airways", 180.0, "2 hours"));
            flightDatabase.put("Vijaywada_Hyderabad", new FlightInfo("Air India", 80.0, "1 hour"));
            flightDatabase.put("Vijaywada_Pune", new FlightInfo("SpiceJet", 200.0, "2.5 hours"));
            flightDatabase.put("Vijaywada_Bangalore", new FlightInfo("Air India", 220.0, "2.5 hours"));
            flightDatabase.put("Vijaywada_Munnar", new FlightInfo("IndiGo", 350.0, "3.5 hours"));
            flightDatabase.put("Vijaywada_Hongkong", new FlightInfo("Cathay Pacific", 700.0, "7 hours"));
            flightDatabase.put("Vijaywada_Incheon(SK)", new FlightInfo("Korean Air", 650.0, "6.5 hours"));
            flightDatabase.put("Vijaywada_Tokyo", new FlightInfo("Japan Airlines", 750.0, "7.5 hours"));
            flightDatabase.put("Vijaywada_Abu Dhabi", new FlightInfo("Etihad Airways", 400.0, "4 hours"));
            flightDatabase.put("Vijaywada_Bali", new FlightInfo("Garuda Indonesia", 450.0, "4.5 hours"));
            flightDatabase.put("Vijaywada_Paris", new FlightInfo("Air France", 550.0, "6.5 hours"));
            flightDatabase.put("Vijaywada_Italy", new FlightInfo("Alitalia", 600.0, "6 hours"));
            flightDatabase.put("Vijaywada_Goa", new FlightInfo("SpiceJet", 140.0, "1.5 hours"));

            // Hyderabad to other destinations
            flightDatabase.put("Hyderabad_Delhi", new FlightInfo("SpiceJet", 180.0, "2 hours"));
            flightDatabase.put("Hyderabad_Mumbai", new FlightInfo("IndiGo", 150.0, "1.5 hours"));
            flightDatabase.put("Hyderabad_Vijaywada", new FlightInfo("Air India", 80.0, "1 hour"));
            flightDatabase.put("Hyderabad_Pune", new FlightInfo("Jet Airways", 160.0, "1.5 hours"));
            flightDatabase.put("Hyderabad_Bangalore", new FlightInfo("IndiGo", 170.0, "1.5 hours"));
            flightDatabase.put("Hyderabad_Munnar", new FlightInfo("SpiceJet", 320.0, "3 hours"));
            flightDatabase.put("Hyderabad_Hongkong", new FlightInfo("Cathay Pacific", 650.0, "6 hours"));
            flightDatabase.put("Hyderabad_Incheon(SK)", new FlightInfo("Korean Air", 600.0, "5.5 hours"));
            flightDatabase.put("Hyderabad_Tokyo", new FlightInfo("Japan Airlines", 700.0, "7 hours"));
            flightDatabase.put("Hyderabad_Abu Dhabi", new FlightInfo("Etihad Airways", 350.0, "4 hours"));
            flightDatabase.put("Hyderabad_Bali", new FlightInfo("Garuda Indonesia", 420.0, "4.5 hours"));
            flightDatabase.put("Hyderabad_Paris", new FlightInfo("Air France", 500.0, "6 hours"));
            flightDatabase.put("Hyderabad_Italy", new FlightInfo("Alitalia", 550.0, "6 hours"));
            flightDatabase.put("Hyderabad_Goa", new FlightInfo("IndiGo", 160.0, "1.5 hours"));

            // Pune to other destinations
            flightDatabase.put("Pune_Delhi", new FlightInfo("GoAir", 220.0, "2.5 hours"));
            flightDatabase.put("Pune_Mumbai", new FlightInfo("Air India", 160.0, "1.5 hours"));
            flightDatabase.put("Pune_Vijaywada", new FlightInfo("SpiceJet", 200.0, "2.5 hours"));
            flightDatabase.put("Pune_Hyderabad", new FlightInfo("Jet Airways", 160.0, "1.5 hours"));
            flightDatabase.put("Pune_Bangalore", new FlightInfo("IndiGo", 200.0, "2 hours"));
            flightDatabase.put("Pune_Munnar", new FlightInfo("Air India", 280.0, "3 hours"));
            flightDatabase.put("Pune_Hongkong", new FlightInfo("Cathay Pacific", 600.0, "6 hours"));
            flightDatabase.put("Pune_Incheon(SK)", new FlightInfo("Korean Air", 550.0, "5.5 hours"));
            flightDatabase.put("Pune_Tokyo", new FlightInfo("Japan Airlines", 700.0, "7 hours"));
            flightDatabase.put("Pune_Abu Dhabi", new FlightInfo("Etihad Airways", 350.0, "4 hours"));
            flightDatabase.put("Pune_Bali", new FlightInfo("Garuda Indonesia", 400.0, "4 hours"));
            flightDatabase.put("Pune_Paris", new FlightInfo("Air France", 550.0, "6 hours"));
            flightDatabase.put("Pune_Italy", new FlightInfo("Alitalia", 600.0, "6 hours"));
            flightDatabase.put("Pune_Goa", new FlightInfo("GoAir", 180.0, "2 hours"));

            // Bangalore to other destinations
            flightDatabase.put("Bangalore_Delhi", new FlightInfo("Vistara", 250.0, "3 hours"));
            flightDatabase.put("Bangalore_Mumbai", new FlightInfo("SpiceJet", 220.0, "2 hours"));
            flightDatabase.put("Bangalore_Vijaywada", new FlightInfo("Air India", 220.0, "2.5 hours"));
            flightDatabase.put("Bangalore_Hyderabad", new FlightInfo("IndiGo", 170.0, "1.5 hours"));
            flightDatabase.put("Bangalore_Pune", new FlightInfo("IndiGo", 200.0, "2 hours"));
            flightDatabase.put("Bangalore_Munnar", new FlightInfo("Jet Airways", 300.0, "3 hours"));
            flightDatabase.put("Bangalore_Hongkong", new FlightInfo("Cathay Pacific", 650.0, "6 hours"));
            flightDatabase.put("Bangalore_Incheon(SK)", new FlightInfo("Korean Air", 600.0, "5.5 hours"));
            flightDatabase.put("Bangalore_Tokyo", new FlightInfo("Japan Airlines", 700.0, "7 hours"));
            flightDatabase.put("Bangalore_Abu Dhabi", new FlightInfo("Etihad Airways", 400.0, "4 hours"));
            flightDatabase.put("Bangalore_Bali", new FlightInfo("Garuda Indonesia", 450.0, "4.5 hours"));
            flightDatabase.put("Bangalore_Paris", new FlightInfo("Air France", 550.0, "6.5 hours"));
            flightDatabase.put("Bangalore_Italy", new FlightInfo("Alitalia", 600.0, "6 hours"));
            flightDatabase.put("Bangalore_Goa", new FlightInfo("SpiceJet", 180.0, "2 hours"));

           return flightDatabase;

	}}
	
	