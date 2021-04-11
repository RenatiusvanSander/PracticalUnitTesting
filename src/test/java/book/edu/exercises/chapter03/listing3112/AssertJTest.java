package book.edu.exercises.chapter03.listing3112;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

/**
 * JUnit for AssertJ
 */
public class AssertJTest {

  /**
   * Tests assert j ie equal to 2.5.
   */
  @Test
  void learnAssertJ() {
    double var = 2.5;
    assertThat(var).isEqualTo(2.5);
  }
}
