package book.edu.exercises.chapter03;

import java.util.Objects;

/**
 * an object which represents a car
 */
public class Car {

  /**
   * the type
   */
  private final String type;

  /**
   * Constructs an instance of {@link Car}
   *
   * @param type the type of car
   */
  public Car(String type) {
    this.type = type;
  }

  /**
   * Gets type
   *
   * @return the tzpe of car
   */
  public String getType() {
    return this.type;
  }

  @Override
  public boolean equals(Object o) {

    if (!(o instanceof Car)) {
      return false;
    }

    Car car = (Car) o;
    return this == o || Objects.equals(type, car.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }
}
