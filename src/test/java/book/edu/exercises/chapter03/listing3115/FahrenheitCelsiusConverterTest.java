package book.edu.exercises.chapter03.listing3115;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit tests for {@link FahrenheitCelsiusConverter}
 */
public class FahrenheitCelsiusConverterTest {

  /**
   * the converter for Fahrenheit Celsius
   */
  private FahrenheitCelsiusConverter converter;

  /**
   * Sets up for every test the converter.
   */
  @BeforeEach
  void setUp() {
    converter = new FahrenheitCelsiusConverter();
  }

  /**
   * Parametrized test, which should return to degrees celsius the value of fahrenheitResult.
   *
   * @param celsius the value in degrees Celsius
   * @param fahrenheitResult the result in degrees Fahrenheit
   */
  @ParameterizedTest
  @CsvSource({
      "10, 50",
      "15, 59",
      "25, 77"
  })
  void shouldConvertCelsiusToFahrenheit(int celsius, int fahrenheitResult) {
    assertThat(converter.toFahrenheit(celsius)).isEqualTo(fahrenheitResult);
  }

  /**
   *The parametrized test for converting fahrenheit into celsius
   *
   * @param fahrenheit value in fahrenheit
   * @param celsiusResult the converted value in celsius
   */
  @ParameterizedTest
  @CsvSource({
      "50, 10",
      "59, 15",
      "77, 25"
  })
  void shouldConvertFahrenheitToCelsius(int fahrenheit, int celsiusResult) {
    assertThat(converter.toCelsius(fahrenheit)).isEqualTo(celsiusResult);
  }
}