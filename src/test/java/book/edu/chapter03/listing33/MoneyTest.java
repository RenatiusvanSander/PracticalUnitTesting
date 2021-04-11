package book.edu.chapter03.listing33;

import static org.assertj.core.api.Assertions.assertThat;

import book.edu.chapter03.listing32.Money;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for unit {@link Money}
 */
public class MoneyTest {

  /**
   * Tests the constructor sets amount and currency.
   */
  @Test
  void constructorShouldSetAmountAndCurrency() {
    Money money = new Money(10, "USD");

    assertThat(money.getAmount()).isEqualTo(10);
    assertThat(money.getCurrency()).isEqualTo("USD");
  }
}
