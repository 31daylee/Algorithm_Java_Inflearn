package Ch01;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/06
 * 내용 : 1-10 가장 짧은 문자거리 ****
 */
class Solution {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()]; // 1 0 1 2 등 숫자가 출력될 배열 생성
        int p = 1000; //100이 넘는 수로 초기화
        for (int i = 0; i < str.length(); i++) { // 왼-> 오른쪽으로 문자와의 거리 비교
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) { // 오-> 왼쪽으로 문자와의 거리 비교
            if (str.charAt(i) == c) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p); // 핵심! ) lf-> rt & rt->lf 중 최소값을 int 배열에 재저장
            }
        }
        return answer;
    }
}
public class Test10 {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int x : s.solution(str, c)){
            System.out.print(x+" ");
        }
    }

}
