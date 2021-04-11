package book.edu.exercises.chapter03;

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
}
