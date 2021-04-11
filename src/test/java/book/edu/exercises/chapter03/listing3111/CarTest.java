package book.edu.exercises.chapter03.listing3111;

import static org.assertj.core.api.Assertions.assertThat;

import book.edu.exercises.chapter03.Car;
import org.junit.jupiter.api.Test;

public class CarTest {

  @Test
  void constructorShouldSetType() {
    Car ferrari = new Car("Ferrari");

    assertThat(ferrari.getType()).isEqualTo("Ferrari");
  }
}
