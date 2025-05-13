package business.services;

public class ValidationService {
    public boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isOption(int number) {
        try {
            return number >= 1 && number <= 4;
        } catch (Exception e) {
            return false;
        }
    }
}
