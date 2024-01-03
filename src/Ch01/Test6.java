package Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 날짜 : 2024/01/04
 * 내용 : 1-05 중복 문자 제거
 */
public class Test6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";
        for(int i =0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        System.out.println(answer);
    }
}
