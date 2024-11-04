package day02_arrray;

import java.util.*;

public class intervalSum{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] p = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            p[i] = sum;
        }

        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res;
            if(a == 0){//注意这种情况，a-1会越界
                res = p[b];
            }else{
                res = p[b] - p[a-1];
            }
            System.out.println(res);
        }

    }
}