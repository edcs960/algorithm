package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problom11382 {
    public static void excute() throws Exception{
        /*
         * 입출력 속도 향상을 위해 BufferedReader와 StringBuilder 사용
         * StringTokenizer를 사용하여 공백으로 구분된 입력값을 쉽게 분리
         * long 타입을 사용하여 큰 수의 합산 처리
         * long보다 더 큰 수를 사용해야한다면 BigInteger/BigDecimal 사용 고려
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.println(sb.append(a+b+c));
    }
}
