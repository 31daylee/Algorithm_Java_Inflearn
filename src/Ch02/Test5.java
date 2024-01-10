package Ch02;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/10
 * 내용 : 2-05 소수(에라토스테네스 체) ***
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i =2; i<=n; i++){
            if(arr[i] == 0){
                answer++;
                for(int j = i; j<=n; j=j+i) arr[j] = 1;
            }

        }
        System.out.print(answer);

    }
}
