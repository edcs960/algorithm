package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;

public class problom2164 {
    public static void excute() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int actionType = 1;
        
        Queue<Integer> queue = new java.util.LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }

        while(queue.size() != 1){
            if(actionType % 2 == 1){
                queue.poll();
            }else{
                int temp = queue.poll();
                queue.add(temp);
            }
            actionType++;
        }

        sb.append(queue.poll());
        System.out.println(sb);
    }
}
