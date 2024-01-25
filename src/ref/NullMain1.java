package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data); // null
        data = new Data();
        System.out.println("2. data = " + data); // 참조값 주소지
        data = null;
        System.out.println("3. data = " + data); // null, 전에 생성된 인스턴스는 가비지 컬렉션을 사용해 제거함
    }
}
