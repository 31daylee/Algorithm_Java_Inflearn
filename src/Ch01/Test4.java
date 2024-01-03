package Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 날짜 : 2024/01/03
 * 내용 : 1-04 단어 뒤집기
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i< n; i++){
            StringBuilder sb = new StringBuilder(br.readLine());
            answer.append(sb.reverse()).append("\n");
        }
        System.out.println(answer);
    }
}
