package Ch01;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/06
 * 내용 : 1-11 문자열 압축
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        str= str+" "; // 빈문자열을 추가해야지 마지막 배열을 계산할 때 IndexOutOfBounds 예외가 발생하지 않는다
        String answer = "";
        int cnt = 1;

        for(int i=0; i<str.length()-1; i++){ // 빈문자 전까지 해야하므로 -1
            if(str.charAt(i) ==  str.charAt(i+1)) cnt++; // 같은 문자인 경우 cnt++
            else{
                answer += str.charAt(i); // 문자 더하기 
                if(cnt > 1) answer += String.valueOf(cnt); //cnt 수도 String으로 변환하여 추가
                cnt =1; // cnt는 다음번 비교를 위해 1로 초기화
            }
        }
        System.out.println(answer);

    }
}
