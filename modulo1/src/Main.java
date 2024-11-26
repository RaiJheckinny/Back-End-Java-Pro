import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Stack
        Stack<Integer> pilha = new Stack<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        //Pilha o ultimo a entrar e o primeiro a sair
        System.out.println("Pilha");
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());

        //Fifo o primeiro a entrar e o primeiro a sair
        Queue<Integer> fila = new LinkedList<>();
        fila.offer(2);
        fila.offer(6);
        fila.offer(9);
        fila.offer(1);

        //Fifo o primeiro a entrar e o primeiro a sair
        System.out.println("Fila");
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}