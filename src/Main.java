public class Main {
    public static void main(String[] args) {
        boolean data = UserData.parameters("java_skypro.go",
                "D_1hWiKjjP_9",
                "D_1hWiKjjP_9");
        if (data) {
            System.out.println("Данные корректны");
        } else {
            System.out.println("Данные не корректны");
        }
    }
}