package ref;

/*
* 객체의 멤버 변수들은 인스턴스가 생성될 때 자동으로 초기화 됨
* boolean: false
* int: 0
* String: null
* 초기값을 정해두면 정해둔 값으로 초기화 된다
* */
public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
