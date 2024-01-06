package Ch01;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/06
 * 내용 : 1-09 숫자만 추출
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input = input.replaceAll("[^0-9]", "");
        int answer = Integer.parseInt(input); // 0208 이란 String이 int가 되어 208로 됨
        System.out.println(answer);
    }
}
