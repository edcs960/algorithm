package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class problom31403 {
    public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		int sum1 = Integer.parseInt(a)+Integer.parseInt(b)-Integer.parseInt(c);
		int sum2 = Integer.parseInt(a+b) - Integer.parseInt(c);
		sb.append(sum1+"\n");
		sb.append(sum2);
		System.out.println(sb);
    }
}
