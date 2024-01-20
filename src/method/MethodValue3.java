package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1); // 5
        num1 = changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1); // 5
    }


    // main과 메서드의 number는 완전히 다른 공간에 생기는 변수
    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
