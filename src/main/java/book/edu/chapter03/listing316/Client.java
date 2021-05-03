package book.edu.chapter03.listing316;

import java.util.ArrayList;
import java.util.List;

/**
 * the client which has an {@link Address}
 */
public class Client {

  /**
   * the addresses of a client
   */
  private List<Address> addresses = new ArrayList<>();

  /**
   * the age of a client
   */
  private int age;

  /**
   * Adds {@link Address}
   *
   * @param address the address
   */
  public void addAddress(Address address) {
    this.addresses.add(address);
  }

  /**
   * @return the age as number
   */
  public int getAge() {
    return this.age;
  }

  /**
   * Sets age.
   *
   * @param age the age of client as number
   */
  public void setAge(int age) {
    this.age = age;
  }
}
