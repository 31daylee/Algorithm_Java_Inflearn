package Ch02;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/09
 * 내용 : 2-03 가위 바위 보
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            arrA[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            arrB[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            if(arrA[j] == arrB[j]) sb.append("D").append("\n");
            else if(arrA[j]==1 && arrB[j]==3 ) sb.append("A").append("\n");
            else if(arrA[j]==2 && arrB[j]==1 ) sb.append("A").append("\n");
            else if(arrA[j]==3 && arrB[j]==2 ) sb.append("A").append("\n");
            else sb.append("B").append("\n");
        }
        System.out.println(sb);
    }
}
