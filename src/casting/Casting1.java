package casting;

/*
* 자동 형변환 (묵시적 형변환)
* 작은 범위 -> 큰 범위로는 가능 But, 큰 범위 -> 작은 범위는 불가능
* Why? 1. 소수점 버림 2. 오버플로우
* int < long < double 순으로 대입 가능
* 타입이 맞지 않을 때 자동으로 형 변환 해줌 단, 작은 타입의 값을 큰 타입에 대입할 때
* */
public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
