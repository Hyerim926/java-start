package oop1;

/*
 * 객체 지향 언어는 클래스 내부에 속성(데이터와)와 기능(메서드)을 함께 포함할 수 있다
 * 메서드는 객체를 생성해야 호출할 수 있다
 * 메서드에 static을 붙이지는 않는다
 * */
public class ValueData {
    int value;

    void add() {
        value++; // 기본으로 본인 인스턴스에 있는 멤버 변수에 접근한다
        System.out.println("숫자 증가 value = " + value);
    }
}
