import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap {
    private final List<Integer> heap;
    private final int childrenPerNode;

    public PowerOfTwoMaxHeap(int logNumChildren) {
        if (logNumChildren < 0 || logNumChildren > 5) {
            throw new IllegalArgumentException("logNumChildren must be between 0 and 5 (i.e., up to 32 children)");
        }
        this.childrenPerNode = 1 << logNumChildren; // 2^logNumChildren
        this.heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        siftUp(heap.size() - 1);
    }

    public int popMax() {
        if (heap.isEmpty())
            throw new IllegalStateException("Heap is empty");

        int max = heap.get(0);
        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            siftDown(0);
        }

        return max;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / childrenPerNode;
            if (heap.get(index) > heap.get(parentIndex)) {
                swap(index, parentIndex);
                index = parentIndex;
            } else
                break;
        }
    }

    private void siftDown(int index) {
        int size = heap.size();
        while (true) {
            int maxIndex = index;
            for (int i = 1; i <= childrenPerNode; i++) {
                int childIndex = childrenPerNode * index + i;
                if (childIndex < size && heap.get(childIndex) > heap.get(maxIndex)) {
                    maxIndex = childIndex;
                }
            }
            if (maxIndex != index) {
                swap(index, maxIndex);
                index = maxIndex;
            } else
                break;
        }
    }

    private void swap(int i, int j) {
        int tmp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, tmp);
    }

    // Optional: utility for debugging
    public List<Integer> getHeapSnapshot() {
        return new ArrayList<>(heap);
    }

    public static void main(String[] args) {
        // Example usage and testing:
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2); // 2^2 = 4 children per node

        int[] values = { 10, 40, 30, 20, 60, 70, 50, 90 };
        for (int val : values) {
            heap.insert(val);
        }

        System.out.println("Max values in order:");
        while (!heap.isEmpty()) {
            System.out.print(heap.popMax() + " ");
        }
    }
}
