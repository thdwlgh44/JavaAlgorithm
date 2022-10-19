package inflearn_java_coding_test.section7_recursive_tree_graph;

import java.util.Scanner;

class Main1 {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;
    public void DFS(int L, int sum, int[] arr) {
        if (flag) return;
        if (sum>total/2) return;
        if (L==n) {
            if ((total - sum)==sum) {
                answer = "YES";
                flag = true; //재귀가 더 이상 돌 필요 없으므로 true로 종료
            }
        }
            else {
                DFS(L+1, sum+arr[L], arr);
                DFS(L+1, sum, arr);
            }
    }

    public static void main(String[] args) {
      Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0, arr);
        System.out.println("answer = " + answer);
    }//main

}//class