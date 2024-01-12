package Ch02;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/12
 * 내용 : 2-07 점수계산
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int answer = 0 , cnt=0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                cnt++;
                answer +=cnt;
            }
            else cnt = 0;
        }
        System.out.print(answer);
    }
}
