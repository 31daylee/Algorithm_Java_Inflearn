package Ch01;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/04
 * 내용 : 1-07 회문 문자열
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
        int len = str.length();
        String answer = "YES";

        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-1-i)) answer = "NO"; break;

        }
        System.out.println(answer);

    }



}
