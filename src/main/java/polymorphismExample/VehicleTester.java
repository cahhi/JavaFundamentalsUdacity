package polymorphismExample;

public class VehicleTester {

    public static void main (String[] args){
        Vehicle[] vehicles = new Vehicle[3];

        //placing values into the Vehicles array
        vehicles[0] = new Car();
        vehicles[1] = new Plane();
        vehicles[2] = new Boat();

        //Iterate over the array to get the speed of each object
        for(int i = 0; i < vehicles.length; i++){
            vehicles[i].speed();
        }
    }
}
