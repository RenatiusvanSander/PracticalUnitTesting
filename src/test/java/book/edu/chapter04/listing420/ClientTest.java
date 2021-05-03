package book.edu.chapter04.listing420;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import book.edu.chapter03.listing316.Client;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link Client}
 */
public class ClientTest {

  /**
   * Tests set age and retrieve the age.
   */
  @Test
  void shouldSetAgeAndRetrieveSameAge() {
    Client client = new Client();
    client.setAge(20);

    assertThat(client.getAge()).isEqualTo(20);
  }
}