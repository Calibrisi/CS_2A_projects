package gasmileage;


//    Create a class called Automobile in which you pass a gas mileage 
//    (miles per gallon) parameter to the constructor which in turn passes it to 
//    the state variable, mpg. The constructor should also set the state variable 
//    gallons (gas in the tank) to 0. A method called fillUp adds gas to the tank. 
//    Another method, takeTrip, removes gas from the tank as the result of driving 
//    a specified number of miles. Finally, the method reportFuel returns how much gas is left in the car.

public class Automobile {
    private double mpg;
    private double gas;
    
    public Automobile(double mpgInput){
        mpg = mpgInput;
        gas = 0;
    }
    
    public void fillUp(double gasAdded){
        gas += gasAdded;
    }
    
    public void takeTrip(double Miles){
        double gasUsed = Miles / mpg;
        gas -= gasUsed;
        
    }
    
    public double reportFuel(){
        
        
        return gas;
    }
    
}