package inflearn_java_coding_test.section1_string;

import java.util.Scanner;

class Main2 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            //x가 소문자인지 확인하는 메서드: isLowerCase()
            // 대문자: 65 ~ 90
            // 소문자: 97 ~ 122, 소문자-32=대문자
                if (x>=97 && x<=122) answer+=(char)(x-32);
                else answer+=(char)(x+32);

//            if (Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
//            else answer+=Character.toLowerCase(x);

        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }//main
}//class
