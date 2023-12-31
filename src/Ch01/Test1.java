package Ch01;

import java.util.Scanner;
/**
 * 날짜 : 2024/01/01
 * 내용 : 1-01 문자 찾기
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        char input2 = sc.next().charAt(0);

        input1= input1.toUpperCase(); // 전체 대문자 만들어주기
        input2= Character.toUpperCase(input2); // 문자를 대문자로 만들기
        int answer =0;

        for(int i =0; i<input1.length(); i++){
            if(input1.charAt(i) == input2) answer += 1;
        }
       System.out.println(answer);
    }
}
