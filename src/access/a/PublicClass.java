package access.a;

import com.helloshop.order.OrderService;

/*
* 클래스 레벨의 접근 제어자
* public
*   - 파일명과 이름이 같아야 한다
*   - 파일에 하나의 클래스만 생성 가능
* default
*   - 하나의 자바 파일에 무한정으로 생성 가능
* */
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // 자기 자신 클래스 생성
        DefaultClass1 defaultClass1 = new DefaultClass1(); // 같은 패키지 내에서 호출 가능
        DefaultClass2 defaultClass2 = new DefaultClass2();

    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
