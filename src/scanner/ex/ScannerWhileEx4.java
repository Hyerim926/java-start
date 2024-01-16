package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String itemName;
        int itemPrice;
        int itemQuantity;

        int total = 0;
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine();
                System.out.print("상품명을 입력하세요: ");
                itemName = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                itemPrice = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                itemQuantity = scanner.nextInt();

                int price = itemPrice * itemQuantity;
                total += price;

                System.out.println("상품명: " + itemName + " 가격: " + itemPrice + " 수량: " + itemQuantity + " 합계: " + price);
            } else if (option == 2) {
                System.out.println("총 비용: " + total);
                total = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 입력해주세요.");
            }
        }
    }
}
