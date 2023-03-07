import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm cần kiểm tra: ");
        int Year = scanner.nextInt();

        if (Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0) {
                    System.out.println(Year + " là năm nhuận");
                } else {
                    System.out.println(Year + " Không phải là năm nhuận");
                }
            } else {
                System.out.println(Year + " Không phải là năm nhuận");
            }
        } else {
            System.out.println("Không phải là năm nhuận");
        }

    }
}