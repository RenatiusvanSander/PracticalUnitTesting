package book.edu.chapter03.listing310;

import static org.assertj.core.api.Assertions.assertThat;

import book.edu.chapter03.listing32.Money;
import org.junit.jupiter.api.Test;

public class MoneyManyValueTest {

  /**
   * Tests the constructor sets amount and currency.
   */
  /**
   * package public
   */
  @Test
  void constructorShouldSetAmountAndCurrency() {
    Money money = new Money(10, "USD");

    assertThat(money.getAmount()).isEqualTo(10);
    assertThat(money.getCurrency()).isEqualTo("USD");

    money = new Money(20,"USD");

    assertThat(money.getAmount()).isEqualTo(20);
    assertThat(money.getCurrency()).isEqualTo("USD");
  }
}
