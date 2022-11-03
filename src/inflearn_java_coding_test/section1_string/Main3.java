package inflearn_java_coding_test.section1_string;

import java.util.Scanner;

class Main3 {
//    public String solution(String str) {
//        String answer = "";
//        int m = Integer.MIN_VALUE; //가장 작은 값으로 초기화
//        String[] s = str.split(" "); //띄어쓰기 배열
//        for(String x : s) {
//            int len = x.length();
//            if(len>m) {
//                m = len;
//                answer = x;
//            }
//        }
//        return answer;
//    }

        public String solution(String str) {
            String answer = "";
            int m = Integer.MIN_VALUE, pos; //pos:정수
            while((pos=str.indexOf(' '))!=-1) {
                String tmp = str.substring(0, pos);
                int len = tmp.length();
                if(len>m) {
                    m = len;
                    answer = tmp;
                }
                str = str.substring(pos+1);
            }
            if (str.length()>m) answer=str;
            return answer;
        }

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
