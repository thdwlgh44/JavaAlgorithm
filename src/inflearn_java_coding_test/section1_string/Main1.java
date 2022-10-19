package inflearn_java_coding_test.section1_string;

import java.util.Scanner;

/**
 * 입력1: Computercooler
 * 입력2: c
 * 출력: 2
 */
class Main1 {

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        /*for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)==t) answer++;
        }*/

//        for (char x : 배열,컬렉션프레임워크), String을 배열로 변환
        for (char x : str.toCharArray()) { //문자 배열 생성
            if(x==t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main1 T = new Main1(); //메서드를 사용하기 위한 객체 생성
        Scanner kb = new Scanner(System.in); //Scanner 객체 생성

        String str = kb.next(); //문자열
        char c = kb.next().charAt(0); //문자 하나

        System.out.print(T.solution(str, c));
    }

}//class
