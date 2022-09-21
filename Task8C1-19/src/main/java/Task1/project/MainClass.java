package Task1.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        CheckPassword checkPassword = (password) -> {
            Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(\\_?).{10,}$");
            Matcher matcher = pattern.matcher(password);

            if (matcher.find() == true) {
                System.out.println("Password strong");
            } else {
                System.out.println("Password week");
            }
        };

        String password = "Afdffgget203";
        checkPassword.strongPassword(password);
    }
}
