package Ch01;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/04
 * 내용 : 1-07 회문 문자열
 * 방법 : Case1) charAt & toUpperCase 이용
 *       Case2) StringBuilder reverse 이용
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Case1 
        /*str = str.toUpperCase();
        int len = str.length();
        String answer = "YES";

        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-1-i)) answer = "NO"; break;

        }*/
        
        // Case2
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";

        System.out.println(answer);

    }



}
