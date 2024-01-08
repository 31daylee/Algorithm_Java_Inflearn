package Ch02;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/09
 * 내용 : 2-02 보이는 학생
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 1, max=arr[0];
        for(int j=1; j<n; j++){
            if(arr[j]>max){
                cnt++;
                max= arr[j];
            }
        }
        System.out.println(cnt);

    }
}
