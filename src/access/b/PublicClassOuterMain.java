package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // publicClass 접근 가능
/*
        DefaultClass1 defaultClass1 = new DefaultClass1(); // 다른 패키지의 클래스이므로 default 클래스는 접근 불가
        DefaultClass2 defaultClass2 = new DefaultClass2();
*/

    }
}
/*
* 캡슐화
* - 객체 지향 프로그래밍의 중요한 개념 중 하나이다.
* - 캡슐화는 데이터와 해당 데이터를 처리하 는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것을 말한다.
* - 캡슐화를 통해 데이터의 직접적인 변경을 방지하 거나 제한할 수 있다.
*
* 1. 데이터를 숨겨라
* - 객체 = 속성(데이터) + 기능(메서드)
* - 데이터에 접근할 수 있도록 하면 모든 로직을 무시하고 데이터를 사용할 수 있기 때문에 private하게 다뤄야한다
* - 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해 접근해야 한다
* 2. 기능을 숨겨라
* - 객체의 기능 중 외부에서 사용하지 않고, 내부에서만 사용하는 기능만 오픈한다
* - 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화이다 */
