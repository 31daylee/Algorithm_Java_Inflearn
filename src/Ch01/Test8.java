package Ch01;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/06
 * 내용 : 1-08 유효한 팰린드롬
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        st = st.toUpperCase().replaceAll("[^A-Z]", ""); // 알파벳이 아닌것은 "" 으로 변환
        String tmp = new StringBuilder(st).reverse().toString();
        String answer = "NO";
        if(st.equals(tmp)) answer = "YES";

        System.out.println(answer);

    }
}
