package book.edu.chapter03.listing315;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import book.edu.chapter03.listing32.Money;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * JUnit test for Illegal Argument.with instance of {@link Money}
 */
public class MoneyIAETest {

  /**
   * the valid currency
   */
  private final static String VALID_CURRENCY = "USD";

  /**
   * Tests the constrcutor throws instance of {IllegalArgumentException}.
   *
   * @param invalidAmount the invalid amount
   */
  @ParameterizedTest
  @ValueSource(ints = {-12387, -5, -1})
  void constructorShouldThrowIAEForInvalidAmount(int invalidAmount) {
    assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
      new Money(invalidAmount, VALID_CURRENCY);
    });
  }
}
