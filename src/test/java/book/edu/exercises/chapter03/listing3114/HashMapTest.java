package book.edu.exercises.chapter03.listing3114;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import book.edu.exercises.chapter03.Car;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *JUnit tests for {@link HashMap}
 */
public class HashMapTest {

  /**
   *the map for tests, key is instance of {@link CarPlate} and value is instance of {@link Car}
   */
  private HashMap<CarPlate, Car> map;

  /**
   * Sets the map uo.
   */
  @BeforeEach
  void setUp() {
    map = new HashMap<>();
  }

  @Test
  void putShouldBeRetrievedByGet() {
    String licencePlate = "HH-SV-1234";
    CarPlate carPlate = new CarPlate(licencePlate);
    Car car = new Car(licencePlate);

    map.put(carPlate, car);

    assertThat(map.get(carPlate)).isEqualTo(car);
  }

  @Test
  void putTwiceShouldRetrieveSecondCarByGet() {
    String licencePlate1st = "HH-SV-1234";
    CarPlate carPlate1st = new CarPlate(licencePlate1st);
    Car car1st = new Car(licencePlate1st);
    Car car2nd = new Car(licencePlate1st);

    map.put(carPlate1st, car1st);
    map.put(carPlate1st, car2nd);

    assertThat(map.get(carPlate1st)).isEqualTo(car2nd);
  }
}
