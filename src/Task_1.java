import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 >= 33 || num1 <= 125 ) {
            if (num2 >= 33 || num2 <= 125){
                if ( num3 >= 33 || num3 <= 125){
                    char a = (char) num1;
                    char b = (char) num2;
                    char c = (char) num3;
                    System.out.print(a + " " + b + " " + c + " ");
                }
            }
        }
    }
}
