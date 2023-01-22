package chap_04;

public class _Quiz_04 {
    /*
    - 문제: 조건문을 활용하여 주차 요금 정산을 프로그램을 작성하시오.

    - 조건
    1) 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
    2) 경차 또는 장애인 차량은 최종 요금에서 50% 할인

    - 주차요금 에시
    일반 차량 5시간 주차 시 20000 원
    경차 5시간 주차 시 10000 원
    장애인 차량 10시간 주차 시 15000 원

    - 결과 예시
    주차 요금은 xx 원입니다.

     */
    public static void main(String[] args) {
        int hour = 10; // 주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부
        int fee = hour * 4000; // 주차 정산 요금 (시간당 4000원 곱하기)

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; // 50% 할인 적용
//            fee *= 0.5f;
        }

        System.out.println("주차 요금은 " + fee + " 원입니다.");
    }
}
