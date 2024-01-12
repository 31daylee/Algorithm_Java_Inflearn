package Ch02;

import java.util.Scanner;

/**
 * 날짜 : 2024/01/12
 * 내용 : 2-08 등수구하기
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 값 입력받기
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // 받은 배열의 크기 만큼 새로운 배열 생성
        int[] answer = new int[n];
        for(int i =0; i<n; i++){
            int cnt = 1;
            for(int j=0; j<n; j++){
                if(arr[j] > arr[i]) cnt++; // 받은 배열을 한 번씩 돌면서 자신보다 큰 수가 있을때 등수를 1증가 
            }
            answer[i] = cnt; // 해당하는 i 번째 인덱스에 등수 저장
        }

        // 순수 배열 값만 출력
        for(int x : answer){
            System.out.print(x+" ");
        }
    }
}
