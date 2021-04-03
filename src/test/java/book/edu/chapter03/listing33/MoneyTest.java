package book.edu.chapter03.listing33;

import book.edu.chapter03.listing32.Money;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {

  @Test
  void constructorShouldSetAmountAndCurrency() {
    Money money = new Money(10, "USD");

    assertThat(money.getAmount()).isEqualTo(10);
    assertThat(money.getCurrency()).isEqualTo("USD");
  }
}
