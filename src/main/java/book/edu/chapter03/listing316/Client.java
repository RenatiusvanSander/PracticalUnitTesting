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
   * Adds {@link Address}
   *
   * @param address the address
   */
  public void addAddress(Address address) {
    this.addresses.add(address);
  }
}
