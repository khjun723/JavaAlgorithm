package codeplus_basic_1;

import java.io.*;
import java.util.Stack;

public class BJ_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb;

        int T = Integer.parseInt(br.readLine());


        // 반복문으로 T 개수 만큼의 문장을 입력받는다
        while(T-- > 0){
            sb = new StringBuffer();
            String str = br.readLine() + "\n";
            Stack<Character> stack = new Stack<>();
            for ( int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ' ' || str.charAt(j) == '\n'){
                    while(!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                }
                else{
                    stack.push(str.charAt(j));
                }
            }
            bw.write(sb.toString() + "\n");
        }

        bw.flush();
        bw.close();
    }
}
