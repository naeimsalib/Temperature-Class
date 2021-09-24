
public class Temperature { // Temperature class starter
	
	private double ftemp; // ftemp to hold Current Temperature in fahrenheit
	
	// Temperature Constructor
	public Temperature(double fahrenheit) {
		// TODO Auto-generated constructor stub
		ftemp = fahrenheit;
	}
	
	//setfahrenheit to set passed fahrenheit to ftemp
	public void setFahrenheit (double fahrenheit){
        ftemp = fahrenheit;
    }
	
	// getfahrenheit to return temperature in fahrenheit
    public double getFahrenheit (){
        return ftemp;
    }

    // getCelsius to return converted temperature to Celsius
    public double getCelsius (){
        double ctemp = (5.0/9.0) * (getFahrenheit() -32);
        return ctemp;
    }

    
    //getKelvin to return Temperature in Kelvin
    public double getKelvin(){
        double ktemp = getCelsius() + 273;
        return ktemp;
    }
    
    
    


}//Temprature class end
