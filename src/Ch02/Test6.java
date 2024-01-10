package Ch02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 날짜 : 2024/01/10
 * 내용 : 2-06 뒤집은 소수
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        // 문자 입력받기 
        for (int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        
        ArrayList<Integer> arrayList = new ArrayList<>(); // Integer 배열 생성

        for(int i =0; i<n; i++){
            int tmp = Integer.parseInt(new StringBuilder(arr[i]).reverse().toString());
            if(isPrime(tmp)){ // 소수인 경우
                arrayList.add(tmp); // [23, 2, 73, 2, 3]
            }
        }
        // 순수 i 값만 출력
        for(Integer i : arrayList){
            System.out.print(i+" "); // 23 2 73 2 3
        }
    }
    public static boolean isPrime(int num){
        if(num == 1) return false; // 1은 소수가 아니다
        for(int i=2; i<num; i++){
            if(num % i == 0) return false; // num 이 어떠한 수로 나누어 떨어진다면 소수가 아니다
        }
        return true;
    }
}
