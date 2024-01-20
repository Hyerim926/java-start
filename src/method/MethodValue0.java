package method;

/*
 * 대원칙: 자바는 항상 변수의 값을 복사해서 대입한다 [꼭 기억하기]
 * */
public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // num1을 복사해서 num2에 넣어줌 따라서, num1은 유지됨
        System.out.println("num2 = " + num2);
        num2 = 10;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
