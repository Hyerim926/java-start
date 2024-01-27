package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // publicClass에서 접근 가능
        DefaultClass1 defaultClass1 = new DefaultClass1(); // 같은 패키지의 클래스이므로 접근 가능
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
