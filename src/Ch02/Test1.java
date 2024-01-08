package Ch02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 날짜 : 2024/01/09
 * 내용 : 2-01 큰 수 출력하기
 */
public class Test1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : s.solution(n,arr)){
            System.out.print(x+" ");
        }


    }
}
class Solution{
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int j=1; j<n; j++){
            if(arr[j] > arr[j-1]) answer.add(arr[j]);
        }
        return answer;
    }
}
