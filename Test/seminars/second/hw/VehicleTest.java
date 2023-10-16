package seminars.second.hw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp(){
        car = new Car("Company", "Model", 2023);
        motorcycle = new Motorcycle("Company", "Model", 2023);
    }

    //- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    //- Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarHas4Wheels() {
        assertEquals(4, car.getNumWheels());
    }

    //- Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testMotorcycleHas2Wheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCarSpeedDuringTestDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testMotorcycleSpeedDuringTestDrive() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void testCarSpeedAfterParking() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcycleSpeedAfterParking() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
