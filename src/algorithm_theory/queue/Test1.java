package algorithm_theory.queue;

import java.util.NoSuchElementException;

class Queue<T> { //algorithm_theory.queue 데이터 타입

    class Node<T> { //같은 타입을 받는 노드 선언
        private T data;
        private Node<T> next; //다음 노드

        public Node(T data) { //생성자에서 해당 타입의 data를 받아서
            this.data = data;
        }
    }

    private Node<T> first; //처음 노드
    private Node<T> last; //마지막 노드

    //add()
    public void add(T item) {
        Node<T> t = new Node<T>(item); //Node 생성해서 매개변수로 item 받음

        if (last != null) { //마지막 노드가 있다면 새로 생성한 노드를 붙이고
            last.next = t;
        }
        last = t;
        if (first == null) {
            first = last;
        }
    }

    //remove()
    public T remove() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        T data = first.data; //데이터를 백업하고
        first = first.next; //다음을 first로 만들어준다.

        if (first == null) {
            last = null;
        }
        return data;
    }

    //peek()
    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

}//class

public class Test1 {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove()); //꺼내기1
        System.out.println(q.remove()); //꺼내기2
        System.out.println(q.peek()); //그 다음 데이터가 무엇인지 보기만 함3
        System.out.println(q.remove()); //꺼내기3
        System.out.println(q.isEmpty()); //false: 4가 남았음
        System.out.println(q.remove()); //꺼내기4
        System.out.println(q.isEmpty()); //true: 모두 다 꺼냈음
    }
}
