/* 
public class Fila<T> {
    private T[] elementos;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public int size() {
        return tamanho;
    }

    public void enqueue(T elemento) {
        if (isFull()) {
            throw new IllegalStateException("A fila está cheia.");
        }

        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanho++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }

        T elementoRemovido = elementos[inicio];
        elementos[inicio] = null;
        inicio = (inicio + 1) % capacidade;
        tamanho--;

        return elementoRemovido;
    }

    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }

        return elementos[inicio];
    }
}
*/