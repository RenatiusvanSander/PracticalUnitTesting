package book.edu.chapter04.listing41;

/**
 * This instance represents a simplified Foot ball team.
 */
public class FootballTeam {

  /**
   * the won games of this team
   */
  private int gamesWon;

  /**
   * Constructs an instance of FootballTeam
   *
   * @param gamesWon the won games of this team
   */
  public FootballTeam(int gamesWon) {
    if (gamesWon < 0) {
      throw new IllegalArgumentException(
          "Not possible to have less than 0 games won! (was " + gamesWon + ")");
    }

    this.gamesWon = gamesWon;
  }

  /**
   * @return the won games of this team
   */
  public int getGamesWon() {
    return gamesWon;
  }

  /**
   * Sets the won games.
   *
   * @param gamesWon the won games of this team to set
   */
  public void setGamesWon(int gamesWon) {
    this.gamesWon = gamesWon;
  }

}
