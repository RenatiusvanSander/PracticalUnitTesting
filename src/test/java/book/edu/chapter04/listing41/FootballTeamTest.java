package book.edu.chapter04.listing41;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link FootballTeamTest}
 */
public class FootballTeamTest {

  private static final int THREE_GAMES_WON = 3;

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
}