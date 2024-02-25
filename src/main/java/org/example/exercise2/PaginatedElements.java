package org.example.exercise2;

public class PaginatedElements<T> {
    private T[] items;
    private int size;

    public PaginatedElements(int sizeItems) {
        this.items = (T[]) new Object[sizeItems];
        this.size = 0;
    }

    public void addElement(T item) {
        if (size < items.length) {
            items[size] = item;
            size++;
        } else {
            System.out.println("Page is full");
        }
    }

    public void displayElements() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
        System.out.println(" ");
    }

    public boolean isFull() {
        return size == items.length;
    }
}


