package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // 인스턴스 초기화 시 멤버 변수 자체는 0으로 초기화 됨
        System.out.println("bigData.data = " + bigData.data); // 인스턴스 초기화 시 멤버 변수 자체는 0으로 초기화 됨

        // NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value); // data의 멤버변수들은 참조형이라서 null로 초기화 뙴
    }
}
