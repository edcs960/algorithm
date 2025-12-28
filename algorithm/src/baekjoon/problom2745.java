package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problom2745 {
    public static void excute1() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		int result = 0;
		int index = 0;
		for(int i = n.length() - 1; i>=0; i--){
			char c = n.charAt(i);
			if(Character.isDigit(c)){
				result += (c-'0') * Math.pow(b, index++);
			}else{
				result += (c-'A'+10) * Math.pow(b, index++);
			}
		}
		sb.append(result);
		System.out.println(sb);
    }
}
