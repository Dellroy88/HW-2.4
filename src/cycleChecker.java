
public class cycleChecker implements Checker {

    private static final String ALLOWED_CHARACTER = "1234567890_.abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public void check(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        for (int i = 0; i < s.length(); i++) {
            if (!ALLOWED_CHARACTER.contains(String.valueOf(s.charAt(i)))) {
                if (login) {
                    throw new WrongLoginException("логин должен содержать только латинские буквы, цифры, " +
                            " нижнее подчёркивания и точку");
                } else {
                    throw new WrongPasswordException("пароль должен содержать только латинские буквы, цифры, " +
                            "нижнее подчёркивания и точку");
                }
            }
        }
    }
}
