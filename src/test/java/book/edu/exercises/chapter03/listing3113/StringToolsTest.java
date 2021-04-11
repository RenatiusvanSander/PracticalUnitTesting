package book.edu.exercises.chapter03.listing3113;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import book.edu.chapter03.listing32.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *JUnit tests for the {@link StringTools}
 */
public class StringToolsTest {

  /**
   * Tests a string is reversed.
   */
  @Test
  void reverseStringShouldReverseTheString() {
    String hallo = "hallo";

    String reversedHallo = StringTools.reverse(hallo);

    assertThat(reversedHallo).isEqualTo("ollah");
  }

  /**
   * Tests {@link StringTools} delivers the text for
   *
   * @param textToReverse the text to reverse
   * @param expectedReversedText the expected result of the text to reverse
   */
  @ParameterizedTest
  @CsvSource({
      "hallo, ollah",
      "hallo, ollah",
      "hallo, ollah"
  })
  void reverseShouldReverseString(String textToReverse, String expectedReversedText) {
    String reversedText = StringTools.reverse(textToReverse);

    assertThat(reversedText).isEqualTo(expectedReversedText);
  }
}
