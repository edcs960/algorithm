package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class problom1181 {
     public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();
        for (int i = 0; i < n; i++) {
        	words.add(br.readLine());
        }

        String[] wordsArray = words.toArray(new String[0]);
        Arrays.sort(wordsArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    for(int i = 0; i < o1.length(); i++){
                        if(o1.charAt(i) != o2.charAt(i)){
                            return o1.charAt(i) - o2.charAt(i);
                        }
                    }
                    return 0;
                } else {
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });


        for(int i = 0; i < wordsArray.length; i++){
            if(i != wordsArray.length - 1){
                sb.append(wordsArray[i]).append("\n");
            } else {
                sb.append(wordsArray[i]);
            }
        }
        System.out.println(sb);
    }
}
