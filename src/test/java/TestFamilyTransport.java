import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.Car;
import com.uninorte.Family;
import com.uninorte.Motorcycle;



public class TestFamilyTransport {
    @Test
    public void testArray() {
        Family family = new Family();
        // the first parameter is the id of the vehicle, the second is the number of passengers
        // the third is the number of doors
        Car car = new Car(1, 4, 4);
        // the first parameter is the id of the vehicle, the second is the number of passengers
        Motorcycle motorcycle = new Motorcycle(2, 2);
        family.addVehicle(car);
        family.addVehicle(motorcycle);
        assertEquals(2, family.getNumberOfVehicles());
        assertEquals(1, family.getNumberOfCars());
        assertEquals(1, family.getNumberOfMotorcycles());
    }

    @Test
    public void testIsValidVehicleForNumberOfPassengers() {
        Family family = new Family();
        Car car = new Car(1, 4, 4);
        Motorcycle motorcycle = new Motorcycle(2, 2);
        family.addVehicle(car);
        family.addVehicle(motorcycle);
        // isValidVehicleForNumberOfPassengers should return true if the vehicle has enough space for the number of passengers
        // the first parameter is the id of the vehicle, the second is the number of passengers
        assertEquals(true, family.isValidVehicleForNumberOfPassengers(1, 4));
        assertEquals(false, family.isValidVehicleForNumberOfPassengers(2, 3));
    }

    @Test
    public void testDefaultConstructor(){
        Family family = new Family();
        assertEquals(0, family.getNumberOfVehicles());
        // the first parameter is the id of the vehicle, the second is the number of passengers
        // is the number of passengers is greater than 2 it is a car, otherwise it is a motorcycle
        // we assume that a car has 4 doors
        family.addVehicle(1,3);
        family.addVehicle(2,2);
        assertEquals(1, family.getNumberOfCars());
        assertEquals(1, family.getNumberOfMotorcycles());        
    }


}
