package operator;

// 연산자 우선순윜
public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4); // 값은 동일하지만 명시적으로 괄호를 사용하는 것이 더 편하다
    }
}
