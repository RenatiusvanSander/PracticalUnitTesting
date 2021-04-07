package book.edu.chapter03.listing316;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientTest {

  private Address address = new Address("street A");
  private Address secondAddress = new Address("street B");
  private Client client;

  @BeforeEach
  void setUp() {
    client = new Client();

    // client.setSomePropertiesIfNeeded();
  }

  @Test
  void afterCreationShouldHaveNoAddress() {
    // ... assert that client has no address
  }

  @Test
  void shouldAllowToAddAddress() {
    client.addAddress(address);

    // ... assert that client as this one address
  }

  @Test
  void shouldAllowToAddManyAddresses() {
    client.addAddress(address);
    client.addAddress(secondAddress);

    // ... assrt that client has two addresses
  }
}
