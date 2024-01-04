package Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 날짜 : 2024/01/04
 * 내용 : 1-05 특정 문자 뒤집기
 */
public class Test5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt){
            if(!Character.isAlphabetic(c[lt])) lt++; // 알파벳이 아니다 -> 특수문자인 경우 lt만 증가
            else if(!Character.isAlphabetic(c[rt])) rt--; // 알파벳이 아니다 -> 특수문자인 경우 rt만 감소
            else{
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(c); //char -> String 변환
        System.out.println(answer);
    }

}
