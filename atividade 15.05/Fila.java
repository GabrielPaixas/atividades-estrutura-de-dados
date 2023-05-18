import java.util.LinkedList;
import java.util.Queue;

public class Fila<T> {
    private Queue<T> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void enqueue(T elemento) {
        fila.add(elemento);
    }

    public T dequeue() {
        return fila.poll();
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public int size() {
        return fila.size();
    }
}
