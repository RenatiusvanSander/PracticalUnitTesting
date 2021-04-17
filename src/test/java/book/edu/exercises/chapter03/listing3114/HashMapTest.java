package book.edu.exercises.chapter03.listing3114;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import book.edu.exercises.chapter03.Car;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for {@link HashMap}
 */
public class HashMapTest {

  /**
   * the map for tests, key is instance of {@link CarPlate} and value is instance of {@link Car}
   */
  private HashMap<CarPlate, Car> map;

  /**
   * Sets the map uo.
   */
  @BeforeEach
  void setUp() {
    map = new HashMap<>();
  }

  /**
   * Tests what is put into is also retrieved by get.
   */
  @Test
  void putShouldBeRetrievedByGet() {
    String licencePlate = "HH-SV-1234";
    CarPlate carPlate = new CarPlate(licencePlate);
    Car car = new Car(licencePlate);

    map.put(carPlate, car);

    assertThat(map.get(carPlate)).isEqualTo(car);
  }

  /**
   * Put two cars into hash map with same key retrieves second car by get.
   */
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

  /**
   * Gets key returns the CarPlate
   */
  @Test
  void getKeyShouldReturnCarPlate() {
    String licencePlate1st = "HH-HVV-1234";
    CarPlate carPlate1st = new CarPlate(licencePlate1st);
    Car car1st = new Car(licencePlate1st);

    map.put(carPlate1st, car1st);

    Set<CarPlate> keys = map.keySet();
    assertThat(keys.contains(carPlate1st)).isEqualTo(true);

    Optional<Entry<CarPlate, Car>> optional = map.entrySet().stream()
        .filter(entry -> entry.getKey().getPlate().equals(licencePlate1st)).findFirst();
    assertThat(optional.get().getKey()).isEqualTo(carPlate1st);
  }

  /**
   * Tests clear removes all entries in map.
   */
  @Test
  void clearShouldRemoveAllMapEntries() {
    fillMap();

    map.clear();

    assertThat(map.isEmpty()).isEqualTo(true);
  }

  /**
   * Method to fill map for clear should remove all map entries.
   */
  private void fillMap() {
    String licencePlate1st = "HH-SV-1234";
    CarPlate carPlate1st = new CarPlate(licencePlate1st);
    Car car1st = new Car(licencePlate1st);
    map.put(carPlate1st, car1st);

    String licencePlate2nd = "HH-SV-1534";
    CarPlate carPlate2nd = new CarPlate(licencePlate2nd);
    Car car2nd = new Car(licencePlate2nd);
    map.put(carPlate2nd, car2nd);
  }

  /**
   * Tests HashMap can use null as key.
   */
  @Test
  void putShouldSetNullCarPlateAsKey() {
    String licencePlate1st = "HH-HVV-1234";
    Car car1st = new Car(licencePlate1st);

    map.put(null, car1st);

    assertThat(map.get(null)).isEqualTo(car1st);
  }
}
