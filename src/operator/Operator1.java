package operator;

// 연산자
public class Operator1 {
    public static void main(String[] args) {
        // 변수
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셉
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b; // => 2.5이지만 변수 타입이 int형이기 때문에 소숫점 표현이 안된다
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 1

        // !! 0으로 나누면 오류 발생
//        int z = 10 / 0;


    }
}
