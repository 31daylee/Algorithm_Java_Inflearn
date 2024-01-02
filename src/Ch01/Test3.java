package Ch01;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/01
 * 내용 : 1-03 문장 속 단어
 */
public class Test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // it is time to study
        sc.close();
        String answer = "";
        int m = Integer.MIN_VALUE; // Integer에서 가장 작은 값으로 초기화 (=-2147483648)
        String[] s = input.split(" "); // 공백 기준으로 분리하여 배열 리스트 생성

        for(String x : s){
            int len = x.length();
            if(len > m){ // x의 길이가 최댓값보다 크다면
                m = len; // 최댓값으로 할당
                answer = x; // 해당하는 x를 answer 에 저장
            }
        }
        System.out.println(answer);
    }
}
