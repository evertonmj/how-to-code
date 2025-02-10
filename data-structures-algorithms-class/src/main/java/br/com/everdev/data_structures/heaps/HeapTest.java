package br.com.everdev.data_structures.heaps;

import static br.com.everdev.data_structures.utils.IOUtils.printn;

public class HeapTest {
    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);

        printn(heap.getHeap());

        heap.insert(100);
        printn(heap.getHeap());

        heap.insert(75);
        printn(heap.getHeap());

        heap.remove();
        printn(heap.getHeap());
        heap.remove();
        heap.remove();
        printn(heap.getHeap());
    }
}
