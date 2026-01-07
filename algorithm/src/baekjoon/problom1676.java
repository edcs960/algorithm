package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class problom1676 {
    public static void excute1() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        BigInteger[] m = new BigInteger[501];
        m[0] = new BigInteger("-1");
        m[1] = new BigInteger("1");
        for (int i = 2; i <= 500; i++) {
            m[i] = m[i - 1].multiply(new BigInteger(i+""));
        }

        String checkNumber = m[n].toString();
        int zeroCount = 0;
        for(int i = checkNumber.length() - 1; i >= 0; i--) {
            if(checkNumber.charAt(i) == '0') {
                zeroCount++;
            } else {
                break;
            }
        }

        sb.append(zeroCount);
        System.out.println(sb);
    }
}
