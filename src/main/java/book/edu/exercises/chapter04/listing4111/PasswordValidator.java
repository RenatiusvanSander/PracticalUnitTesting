package book.edu.exercises.chapter04.listing4111;

/**
 * Validates a password for strength
 */
public class PasswordValidator {

  /**
   * the security rules for strength, length and so on.
   */
  private final PasswordSecurityRules rules;

  /**
   * Constructs an instance of {@link PasswordValidator}
   *
   * @param rules the validation rules for passwords
   */
  public PasswordValidator(PasswordSecurityRules rules) {
    this.rules = rules;
  }

  /**
   * Validates Password.
   *
   * @param password the password to validate
   * @return true for valid password. False means invalid password by security rules.
   */
  public boolean validate(String password) {
    return false;
  }
}
