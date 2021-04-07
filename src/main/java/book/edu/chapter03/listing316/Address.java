package book.edu.chapter03.listing316;

/**
 * Stores an address.
 */
public class Address {

  /**
   * the street and house number
   */
  private final String streetAndHouseNumber;

  /**
   *Constructs an instance of {@link Address}
   *
   * @param streetAndHouseNumber the street and house number of an address
   */
  public Address(String streetAndHouseNumber) {
    this.streetAndHouseNumber = streetAndHouseNumber;
  }

  /**
   * Gets the street and house number
   *
   * @return street and house number
   */
  public String getStreetAndHouseNumber() {
    return streetAndHouseNumber;
  }
}
