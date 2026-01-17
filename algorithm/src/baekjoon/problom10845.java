package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class problom10845 {
    public static void excute() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String[] oper = br.readLine().split(" ");
            switch (oper[0]) {
                case "push":
                    q.addLast(Integer.parseInt(oper[1]));
                    break;
                case "pop":
                    if (q.size() == 0) {
                        sb.append(-1 + "").append("\n");
                        break;
                    }
                    sb.append(q.pollFirst()).append("\n");
                    break;
                case "size":
                    int qSize = q.size() == 0 ? 0 : q.size();
                    sb.append(qSize + "").append("\n");
                    break;
                case "empty":
                    sb.append(q.size() == 0 ? 1 : 0 + "").append("\n");
                    break;
                case "front":
                    if (q.size() == 0) {
                        sb.append(-1 + "").append("\n");
                        break;
                    }
                    sb.append(q.peekFirst()).append("\n");
                    break;
                case "back":
                    if (q.size() == 0) {
                        sb.append(-1 + "").append("\n");
                        break;
                    }
                    sb.append(q.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
