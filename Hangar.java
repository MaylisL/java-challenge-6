import java.util.ArrayList;

public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio");  
        Boat titanic = new Boat("Titanic");  

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(clio);
        vehicles.add(titanic);

        // iterate over the list
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.doStuff());
        }
        
    }
}
