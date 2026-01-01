package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class problom30802 {
    public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] t = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int tSet = Integer.parseInt(b[0]);
        double tOrderSum = 0;
        for (String s : t) {
            tOrderSum += Math.ceil((double)Integer.parseInt(s) / tSet);
        }
        int pSet = Integer.parseInt(b[1]);
        int pSetOrder = n / pSet;
        int pOrder = n % pSet;
        sb.append((int) tOrderSum)
            .append("\n")
            .append(pSetOrder + " " + pOrder);
        System.out.println(sb);
    }
}
