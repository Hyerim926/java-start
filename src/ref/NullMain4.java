package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count); // 인스턴스 초기화 시 멤버 변수 자체는 0으로 초기화 됨
        System.out.println("bigData.data = " + bigData.data); // 인스턴스 초기화 시 멤버 변수 자체는 0으로 초기화 됨

        // NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value); // bigData의 data를 인스턴스를 만들어주었기 때문에 이제 0으로 출력 됨
    }
}
