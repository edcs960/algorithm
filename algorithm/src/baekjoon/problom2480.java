package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class problom2480 {
    public static void excute1() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result = 0;
        if(a == b && b == c){
            result = 10000 + (a * 1000);
        } else if(a == b || a == c){
            result = 1000 + (a * 100);
        } else if(b == c){
            result = 1000 + (b * 100);
        } else {
            result = Math.max(a, Math.max(b, c)) * 100;
        }
        sb.append(result);
        System.out.println(sb);
    }

    public static void excute2() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<Integer>();
        int result = 0;
        int a = 0;
        int maxValue = 0;
        for(int i = 0; i < 3; i++){
            int num = Integer.parseInt(st.nextToken());
            maxValue = Math.max(maxValue, num);
            if (!set.contains(num)) {
                set.add(num);
            } else {
                a = Math.max(num, result);
            }
        }
        if(set.size() == 3){
            result = maxValue * 100;
        } else if(set.size() == 2){
            result = 1000 + (a * 100);
        } else {
            result = 10000 + (a * 1000);
        }
        sb.append(result);
        System.out.println(sb);
    }
    
    public static void excute3() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int result;
        if (arr[0] == arr[2]) { // 모두 같음
            result = 10000 + arr[0] * 1000;
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) { // 두 개만 같음
            result = 1000 + arr[1] * 100;
        } else { // 모두 다름
            result = arr[2] * 100;
        }
        System.out.println(result);
    }
}
