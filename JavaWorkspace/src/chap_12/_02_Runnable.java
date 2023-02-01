package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    // Thread: Thread 라는 클래스를 상속
    // Runnable: Runnable 이라는 인터페이스를 구현
    // -> 차이 : 클래스에서의 상속은 단일 상속만 가능. 인터페이스는 다중 상속 가능.
    public static void main(String[] args) {
        // Runnable
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10 ; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
