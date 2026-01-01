package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class problom10989 {
    public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(m);
        for (int i = 0; i < n; i++) {
            if(i != n - 1) {
                sb.append(m[i]).append("\n");
            }else{
                sb.append(m[i]);
            }
        }
        System.out.println(sb);
    }
}
