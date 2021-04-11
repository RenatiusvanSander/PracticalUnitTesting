package book.edu.chapter03.listing311;

import static org.assertj.core.api.Assertions.assertThat;

import book.edu.chapter03.listing32.Money;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * A parameeriyed JUnit test for {@link Money}
 */
public class MoneyOneParamAnnotationTest {

  /**
   * Constructs 3-times the instances of {@link Money} with 3 different amounts and checks the
   * amount is equal as expected.
   *
   * @param amount the amount, for example 10
   */
  @ParameterizedTest
  @ValueSource(ints = {10, 15, 50})
  void constructorShouldSetAmountAndCurrency(int amount) {
    Money momey = new Money(amount, "USD");

    assertThat(momey.getAmount()).isEqualTo(amount);

  }

}
