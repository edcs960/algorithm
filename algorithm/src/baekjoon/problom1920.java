package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class problom1920 {
     public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<String> arr1 = Arrays.asList(br.readLine().split(" "));
        Map<String, String> map = new HashMap<>();
        for (String s : arr1) { map.put(s, s); }
        int m = Integer.parseInt(br.readLine());
        List<String> arr2 = Arrays.asList(br.readLine().split(" "));

        for (int i = 0; i < m; i++) {
        	if (map.get(arr2.get(i)) != null) {
        		sb.append("1");
        	} else {
        		sb.append("0");
        	}
            if(i != m - 1) {sb.append("\n");}
        }        
        
        System.out.println(sb);
    }
}
