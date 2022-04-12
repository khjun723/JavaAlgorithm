package codeplus_basic_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BJ_1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        Stack<String> leftStk = new Stack<String>();    //커서 왼쪽
        Stack<String> rightStk = new Stack<String>();   //커서 오른쪽

        String[] arr = str.split("");
        for(String s : arr) {
            leftStk.push(s);
        }

        while(0 < n--) {
            String cmd = br.readLine();
            char c = cmd.charAt(0);

            switch(c) {
                case 'L':
                    if(!leftStk.isEmpty()){
                        rightStk.push(leftStk.pop());
                    }
                    break;

                case 'D':
                    if(!rightStk.isEmpty()){
                        leftStk.push(rightStk.pop());
                    }
                    break;

                case 'B':
                    if(!leftStk.isEmpty()) {
                        leftStk.pop();
                    }
                    break;

                case 'P':
                    char t = cmd.charAt(2);
                    leftStk.push(String.valueOf(t));
                    break;

                default:
                    break;
            }
        }

        //Stack은 LIFO 구조이기 때문에
        //왼쪽 스택에 있는 데이터들을 모두 오른쪽으로 옮긴 뒤에 오른쪽에 있는 모든 내용을 출력한다.
        while(!leftStk.isEmpty())
            rightStk.push(leftStk.pop());

        while(!rightStk.isEmpty())
            bw.write(rightStk.pop());

        bw.flush();
        bw.close();
    }
}