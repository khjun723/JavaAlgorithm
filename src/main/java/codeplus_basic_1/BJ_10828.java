package codeplus_basic_1;

import java.io.*;
import java.util.Stack;

public class BJ_10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();   //스택

        // N (1 ≤ N ≤ 10,000)
        int N = Integer.parseInt(br.readLine());   //명령어의 수

        //명령어수 만큼 반복
        while( 0 < N--){
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]){

                //push X: 정수 X를 스택에 넣는 연산이다.
                case "push":
                    stack.add(Integer.parseInt(cmd[1]));    //cmd[1] = X
                    break;

                //pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.
                case "pop":
                    //만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    if(stack.empty()) {
                        bw.write("-1\n");
                        break;
                    }
                    Integer ret = stack.pop();
                    bw.write(ret.toString()+"\n");
                    break;

                //size: 스택에 들어있는 정수의 개수를 출력한다.
                case "size":
                    Integer size = stack.size();
                    bw.write(size.toString()+"\n");
                    break;

                //empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
                case "empty":
                    bw.write((stack.empty() ? "1" : "0") + "\n");
                    break;

                //top: 스택의 가장 위에 있는 정수를 출력한다.
                case "top":
                    //만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    if(stack.empty()) {
                        bw.write("-1\n");
                        break;
                    }
                    bw.write(stack.peek().toString()+"\n");
                    break;

                default:
                    break;

            }

        }
        bw.flush();
        bw.close();
    }
}