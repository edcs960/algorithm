package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class problom25314 {
    public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int longCount = n/4;
        String s = "long ".repeat(longCount) + "int";
        sb.append(s);
        System.out.println(sb);
    }
}
