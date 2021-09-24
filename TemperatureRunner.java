import java.util.Scanner;// Import Scanner to take user input


public class TemperatureRunner {

	public static void main(String[] args) { // Start of Main Method
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  // Reading from System.in 
		
		System.out.print("Please enter the Temperature: ");
		double currentTemp = reader.nextDouble(); // holds user input in current Temp
		reader.close();//once finished
		
        Temperature tempratureGiven = new Temperature(currentTemp); // created a new instance of Temperature and passed currentTemp
			
        //Prints out the calculated results.
        System.out.println("Temprature given in fahrenheit: " + tempratureGiven.getFahrenheit());
        System.out.println("Temprature given in Kelvin: " + tempratureGiven.getKelvin());
        System.out.println("Temprature given in Celcius: " + tempratureGiven.getCelsius());

	}

}
