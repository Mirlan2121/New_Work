public class Task_3 {
    public static void main(String[] args) {
        float num = 1356.32451f;

        int intValue = (int) num;
      int fracValue = (int) ((num - intValue) * 100000);

        System.out.println("Основной: " + intValue);
        System.out.println("Остаток: " + fracValue);

    }
}
