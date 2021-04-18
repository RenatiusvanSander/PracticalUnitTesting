package book.edu.exercises.chapter03.listing3115;

/**
 * A converter for Fahrenheit to Celsius and the opposite.
 */
public class FahrenheitCelsiusConverter {

  /**
   * Constructs instance of {@link FahrenheitCelsiusConverter}
   */
  public FahrenheitCelsiusConverter() {
  }

  /**
   * Converts value to Fahrenheit
   *
   * @param degreesCelsius degrees in Celsius
   * @return value in Fahrenheit
   */
  public int toFahrenheit(int degreesCelsius) {
    double fahrenheit = degreesCelsius * 9 / 5 + 32;
    return (int) Math.round(fahrenheit);
  }

  /**
   * Converts value to Celsius
   *
   * @param degreesFahrenheit degrees in Fahrenheit
   * @return value in Celsius
   */
  public int toCelsius(int degreesFahrenheit) {
    double celsius = (degreesFahrenheit - 32.0) * 5/9;
    return (int) Math.round(celsius);
  }
}
