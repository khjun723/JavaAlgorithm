package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_9012 {
    public static void foo(String s) {
        Stack<Character> stack = new Stack<>();

        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else { // ')'
                if (stack.size() < 1) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
            i++;
        }

        if (stack.size() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //입력받을 데이터 개수

        for (int i = 0; i < N; i++) {
            foo(br.readLine());
        }


    }
}
