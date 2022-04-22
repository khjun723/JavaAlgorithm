package codeplus_basic_1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class BJ_10845 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Queue queue =  new LinkedList();

        int N = Integer.parseInt(br.readLine());
        String[] cmd;
        String back = null;

        while(0 < N--){
            cmd = br.readLine().split(" ");

            if(cmd[0].equals("push") && !cmd[1].isEmpty()){
                back = cmd[1];
                queue.offer(cmd[1]);

            }else if(cmd[0].equals("size")){
                sb.append(queue.size() + "\n");

            }else if(cmd[0].equals("empty")){
                if(queue.isEmpty())
                    sb.append("1\n");
                else
                    sb.append("0\n");

            }else if(queue.isEmpty())
                sb.append(-1 + "\n");

            else if(cmd[0].equals("pop"))
                sb.append(queue.poll() + "\n");

            else if(cmd[0].equals("front"))
                sb.append(queue.peek() + "\n");

            else if(cmd[0].equals("back"))
                sb.append(back + "\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
