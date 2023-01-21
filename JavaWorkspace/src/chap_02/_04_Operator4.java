package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true

        // AND 연산: &&
        System.out.println((5 > 3) && (3 > 1)); // true
        System.out.println((5 > 3) && (3 < 1)); // false

        // OR 연산: ||
        System.out.println(( 5 > 3) || (3 > 1)); // true
        System.out.println(((5 > 3) || (3 < 1))); // true
        System.out.println((5 < 3) || (3 < 1)); // false

//        System.out.println(1 < 3 < 5); // 연속 비교 불가
        System.out.println(1 < 3 && 3 < 5); // 괄호 없어도 정상 실행, but 가독성을 위해 괄호 사용

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
