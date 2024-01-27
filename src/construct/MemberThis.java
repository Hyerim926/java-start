package construct;

public class MemberThis {
    String nameField;

    // 파라미터 변수명과 멤버변수명이 다를 경우에는 this없이도 접근 가능하다.
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
