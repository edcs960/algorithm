package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class problom10816 {
    public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        String[] arr1 = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        String[] arr2 = br.readLine().split(" ");
        Map<String, Integer> cardMap = new HashMap<String, Integer>();
        for(int i = 0; i<m;i++){
            if(cardMap.containsKey(arr1[i])){
                int num = cardMap.get(arr1[i]);
                cardMap.put(arr1[i], num + 1);
            }else{
                cardMap.put(arr1[i], 1);
            }
        }
        for(int i = 0; i<n; i++){
            if(cardMap.containsKey(arr2[i])){
                sb.append(cardMap.get(arr2[i])).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
