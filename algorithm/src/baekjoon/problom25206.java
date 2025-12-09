package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class problom25206 {
    public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Double tp = 0.0;
		Double sum = 0.0;
		Map<String, Double> map = getGradeMap();

		for (int i = 0; i < 20; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			Double point = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			if(grade.equals("P")){ continue; }
			if (map.containsKey(grade)){
				sum += point * map.get(grade);
			}
			tp += point;
		}
		sb.append(String.format("%.6f", sum / tp));
		System.out.println(sb);
    }

    public static Map<String, Double> getGradeMap() {
		Map<String, Double> map = new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		return map;
	}
}
