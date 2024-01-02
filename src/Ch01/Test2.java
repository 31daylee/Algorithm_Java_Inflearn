package Ch01;

import java.util.Scanner;
/**
 * 날짜 : 2024/01/01
 * 내용 : 1-02 대소문자 변환
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        String answer = "";

        for(char x : input1.toCharArray()){
            if(Character.isUpperCase(x)){ // x는 대문자인가?
                answer += Character.toLowerCase(x); // 대문자라면 소문자로
            }else{
                answer += Character.toUpperCase(x);
            }
        }
        System.out.println(answer);
    }
}
