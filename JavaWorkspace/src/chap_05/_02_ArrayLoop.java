package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = new String[]{"아메리카노", "카페모카", "라뗴", "카푸치노"};

        // for 반복문 순회 : index를 이용한 처리하여 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------");

        // enhanced for (for-each) 반복문: 배열의 모든 요소를 순회
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------");

        // while 반복문 순회
        int index = 0;
        while (index < coffees.length) {
            System.out.println(coffees[index] + " 하나");
            index++;
        }
        System.out.println("주세요");

        System.out.println("--------------");

        // do while 반복문 순회
        index = 0;
        do {
            System.out.println(coffees[index] + " 하나");
            index++;
        } while (index < coffees.length);
        System.out.println("주세요");

    }
}
