package gasmileage;

public class GasMileage {

    /**
     * @param args the command line arguments
     */
    
//    Create a class called Automobile in which you pass a gas mileage 
//    (miles per gallon) parameter to the constructor which in turn passes it to 
//    the state variable, mpg. The constructor should also set the state variable 
//    gallons (gas in the tank) to 0. A method called fillUp adds gas to the tank. 
//    Another method, takeTrip, removes gas from the tank as the result of driving 
//    a specified number of miles. Finally, the method reportFuel returns how much gas is left in the car.
    
    public static void main(String[] args) {
        
        Automobile car = new Automobile(24);
        
        car.fillUp(20);
        
        car.takeTrip(100);
        
        double fuel_left = car.reportFuel();
        
        System.out.println(fuel_left);
        
    }
    
}
