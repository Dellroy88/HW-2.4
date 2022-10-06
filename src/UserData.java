import java.util.Objects;

public class UserData {

    private UserData() {
    }

    public static boolean parameters(String login,
                                     String password,
                                     String confirmPassword) {
        try {
            check(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }



    private static void check(String login,
                              String password,
                              String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.isEmpty() || login.length() > 20) {
            throw new WrongLoginException("Логин должен содержать не больше 20 символов");
        }
        if (password == null || password.isEmpty() || password.length() > 20) {
            throw new WrongPasswordException("Пароль должен содержать не больше 20 символов");
        }
        if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать!");
        }
        Checker checker = new cycleChecker();
        checker.check(login,true);
        checker.check(password,false);
    }
}
