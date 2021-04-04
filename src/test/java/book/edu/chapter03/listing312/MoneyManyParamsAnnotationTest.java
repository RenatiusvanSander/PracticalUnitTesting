package book.edu.chapter03.listing312;

import book.edu.chapter03.listing32.Money;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * JUnit test with many parametersfor {qlink Money}
 */
public class MoneyManyParamsAnnotationTest {

  /**
   * Tests the constructor.
   *
   * @param amount the amount
   * @param currency the currency
   */
  @ParameterizedTest
  @CsvSource({
      "10, USD",
      "15, EUR",
      "50, CHF"
  })
  void constructorShouldSetAmountAndCurrency(int amount, String currency) {
    Money money = new Money(amount, currency);

    assertThat(money.getAmount()).isEqualTo(amount);
    assertThat(money.getCurrency()).isEqualTo(currency);
  }
}
