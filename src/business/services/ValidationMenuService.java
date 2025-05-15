package business.services;

public class ValidationMenuService {
    public boolean isOption(String input) {
        try {
            int number = Integer.parseInt(input);
            return number >= 1 && number <= 4;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isRegistrationOption(String input) {
        try {
            int number = Integer.parseInt(input);
            return number >= 1 && number <= 3;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
