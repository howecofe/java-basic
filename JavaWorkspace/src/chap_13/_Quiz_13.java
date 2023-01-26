package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    // 속담 퀴즈 프로그램을 작성하시오.

    // 조건1. 퀴즈 내용은 saying.txt 라는 이름의 파일로 제공
    // 조건2. 퀴즈는 문제와 정답이 각각 한 줄로 구성 (퀴즈 3개인 경우 총 6줄)
    // 조건3. 사용자로부터 값을 입력받아 정답여부 확인
    // 조건4. 오답인 경우 정답 안내
    // 조건5. 퀴즈 내용이 더 이상 없을 때까지 반복
    public static void main(String[] args) {
        // saying.txt 파일 생성
        try (BufferedWriter br = new BufferedWriter(new FileWriter("src/chap_13/saying.txt"))) {
            br.write("세 살 __ 여든까지 간다");
            br.newLine();
            br.write("버릇");
            br.newLine();
            br.write("소 잃고 ___ 고친다");
            br.newLine();
            br.write("외양간");
            br.newLine();
            br.write("천 리 길도 한 __부터");
            br.newLine();
            br.write("걸음");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 입력 받기
        Scanner sc = new Scanner(System.in);

        // 퀴즈
        try (BufferedReader br = new BufferedReader(new FileReader("src/chap_13/saying.txt"))) {
            System.out.println("속담 퀴즈입니다. 빈 칸에 앎맞은 말을 입력하시오. (주관식)");
            System.out.println("--------------------------------------------");

            String quiz; // 문제
            String answer; // 정답
            String input; // 사용자 입력

            while (true) {
                quiz = br.readLine();
                answer = br.readLine();

                if (quiz == null || answer == null) {
                    break;
                }

                System.out.println("(문제) " + quiz);
                System.out.print(" 정답 입력 => ");
                input = sc.next();
                if (input.equals(answer)) {
                    System.out.println("정답입니다!!!\n");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.\n");
                }
            }
            System.out.println("--------------------------------------------");
            System.out.println("모든 퀴즈가 완료되었습니다.\n수고하셨습니다. ^^");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
