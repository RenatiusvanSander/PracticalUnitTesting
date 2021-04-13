package book.edu.exercises.chapter03.listing3114;

/**
 * This unit represents a licence plate of a {@link book.edu.exercises.chapter03.Car}
 */
public class CarPlate {

  /**
   * the licence plate
   */
  private String plate = "";

  /**
   * Constructs an instance {qlink CarPlate}
   */
  public CarPlate() {
  }

  /**
   * Constructs an instance {@link CarPlate}
   *
   * @param licencePlate the licence plate of the car
   */
  public CarPlate(String licencePlate) {
    this.plate = licencePlate;
  }

  /**
   * Gets plate.
   *
   * @return the licence plate
   */
  public String getPlate() {
    return plate;
  }

  /**
   * Sets the plate.
   *
   * @param plate the licence plate
   */
  public void setPlate(String plate) {
    this.plate = plate;
  }
}
