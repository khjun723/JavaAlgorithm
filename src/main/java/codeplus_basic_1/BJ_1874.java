package codeplus_basic_1;

import java.io.*;
import java.util.Stack;

public class BJ_1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stk = new Stack();

        int n = Integer.parseInt(br.readLine());
        stk.push(1);
        sb.append("+\n");
        int tmp = stk.peek();
        boolean check = false;
        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(br.readLine());

            while (tmp < input) {
                stk.push(tmp++ + 1);
                sb.append("+\n" );
            }
            if (input == stk.peek()){
                stk.pop();
                sb.append("-\n");
            } else if (input < stk.peek()){
                bw.write("NO\n");
                bw.flush();
                bw.close();
                return;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
