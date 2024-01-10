package Ch02;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/10
 * 내용 : 2-04 피보나치 수열
 */
class Test4 {
    public int[] solution(int n) {

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<n; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Test4 s = new Test4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x : s.solution(n)) System.out.print(x+" ");
    }
}
