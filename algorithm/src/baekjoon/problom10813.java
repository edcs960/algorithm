package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problom10813 {
    public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int temp = -1;
        int[] targetArr = new int[n];

        for (int i = 0; i < n; i++) {
            targetArr[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            if(a == b) continue;
            temp = targetArr[a];
            targetArr[a] = targetArr[b];
            targetArr[b] = temp;
        }
        for (int i = 0; i < n; i++) {
            if(i == n - 1) {
                sb.append(targetArr[i]);
                break;
            }
            sb.append(targetArr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
