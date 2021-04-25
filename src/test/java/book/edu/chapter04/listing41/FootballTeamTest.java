package book.edu.chapter04.listing41;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for {@link FootballTeamTest}
 */
public class FootballTeamTest {

  private static final int THREE_GAMES_WON = 3;

  /** a number */
  private static final int ANY_NUMBER = 123;

  /**
   * Sets up
   */
  @BeforeEach
  void setUp() {
    // empty for now
  }

  /**
   * Tests the won games are 3.
   */
  @Test
  void constructorShouldSetGamesWon() {
    FootballTeam team = new FootballTeam(3);

    assertThat(team.getGamesWon()).as("number of games won").isEqualTo(THREE_GAMES_WON);
  }

  @ParameterizedTest
  @ValueSource(ints = {0, 1, 3, 10})
  void constructorShouldSetGamesWon(int nbOfGamesWon) {
    FootballTeam team = new FootballTeam(nbOfGamesWon);

    assertThat(team.getGamesWon()).as("Number of games won").isEqualTo(nbOfGamesWon);
  }

  @ParameterizedTest
  @ValueSource(ints = {-10, -1})
  void constructorShouldThrowExceptionForIllegalGamesNb(int illegalNbOfGames) {
    assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
      new FootballTeam(illegalNbOfGames);
    });
  }

  @Test
  void shouldBePossibleToCompareTeams() {
    FootballTeam team = new FootballTeam(ANY_NUMBER);

    assertThat(team).isInstanceOf(Comparable.class);
  }
}