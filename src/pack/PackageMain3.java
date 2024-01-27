package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); // 패키지가 다른데 클래스명이 같은 경우에 둘 중 한 패키지는 이런식으로 가져와야함
    }
}
