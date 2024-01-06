package Ch01;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/06
 * 내용 : 1-12 암호 ***
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String answer="";

        for(int i=0; i<n; i++){
            String tmp = s.substring(0,7).replace('#', '1').replace('*','0');
            int num = Integer.parseInt(tmp,2); // 10110 2진수를 10진수로 변환
            answer += (char)num; // 10진수를 char 형으로 변환 -> 65인경우 'A' 출력
            s = s.substring(7);
        }

        System.out.println(answer);
    }
}
