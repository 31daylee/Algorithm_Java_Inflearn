package Ch02;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/13
 * 내용 : 2-09 격자판 최대합
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 최대값을 찾기위해 최솟값으로 초기화
        int answer = Integer.MIN_VALUE;
        // 행과열의 배열 생성
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum1, sum2;
        // 가로,세로선 최대합 구하기
        for(int i=0; i<n; i++){
            sum1 = sum2 = 0;
            for(int j=0; j<n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }
        // 대각선 최대합 구하기
        sum1 = sum2 = 0;
        for(int i=0; i<n; i++){
                sum1 += arr[i][i];
                sum2 += arr[i][n-i-1];

            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }

        System.out.println(answer);

    }
}
