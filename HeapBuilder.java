public class HeapBuilder {

    public static void main(String[] args) {
        //Initialize array of WordFreq objects
        WordFreq[] arr = {
            new WordFreq("happy", 400),
            new WordFreq("satisfied", 100),
            new WordFreq("neutral", 300),
            new WordFreq("would buy again", 200),
            new WordFreq("terrible", 160),
            new WordFreq("inconvenient", 900),
            new WordFreq("difficult to use", 100),
            new WordFreq("easy to use", 140),
            new WordFreq("would recommend to friends", 800),
            new WordFreq("visit the store", 700),
        };

        buildMaxHeap(arr);
    }

    public static void buildMaxHeap(WordFreq[] arr) {
        int n = arr.length;

        //loop run from the last non-leaf node, upward to the root (bottom up)
        for (int i = n/2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }

        //Print heapified array
        for (WordFreq wf : arr) {
            System.out.println(wf.word + " - " + wf.frequency);
        }
    }

    public static void maxHeapify(WordFreq[] arr, int n, int i) {
        
    }
}

