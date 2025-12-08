package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class problom27866 {
    public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        sb.append(s.charAt(n));
        System.out.println(sb);
    }
}
