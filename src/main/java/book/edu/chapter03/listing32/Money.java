package book.edu.chapter03.listing32;

/**
 * Money for amount and currency.
 */
public class Money {

  /**
   * the amount
   */
  private final int amount;

  /**
   * the currency
   */
  private final String currency;

  /**
   * Constructs an instance of {@link Money}
   *
   * @param amount   the amount
   * @param currency the currency
   */
  public Money(int amount, String currency) {

    if (amount < 0) {
      throw new IllegalArgumentException("illegal amount: [" + amount + "]");
    }

    this.amount = amount;
    this.currency = currency;
  }

  /**
   * Gets the amount
   *
   * @return amount
   */
  public int getAmount() {
    return amount;
  }

  /**
   * Gets currency
   *
   * @return currency
   */
  public String getCurrency() {
    return currency;
  }

  /**
   * Checks equality of two instances of {@link Money}
   *
   * @param anObject the second {@link Money} instance
   * @return <code>true</code> when the instances are equal. <code>False</code> means no equality.
   */
  public boolean equals(Object anObject) {
    if (anObject instanceof Money) {
      Money money = (Money) anObject;

      return getCurrency().equals(money.getCurrency()) && getAmount() == money.getAmount();
    }

    return false;
  }
}
