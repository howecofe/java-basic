package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("김태리");
        c2.ready();

        System.out.println("-------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("김겨울");
        c4.ready();

        System.out.println("-------------------");

        int c3Name = (int) c3.name;
        System.out.println("주문 번호 고객 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

//        c4Name = (String) c3.name;

        System.out.println("-------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("고아성");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("-------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("김연경"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("김연아"));
        c8.ready();

        System.out.println("-------------------");

        orderCoffee("박세리");
        orderCoffee(36);

        System.out.println("-------------------");

        orderCoffee("박세리", "아메리카노");
        orderCoffee(37, "라뗴");

    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) { // 두 개 이상의 데이터 처리 가능
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
