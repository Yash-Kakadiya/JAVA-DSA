public class HeapSort {
    public static void sort(int[] arr){
        int n=arr.length;
        buildMaxHeap(arr,n);
        for(int i=n-1;i>=0;i--){
            // swap
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,i,0);
        }
    }

    public static void buildMaxHeap(int[] arr,int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }

    public static void heapify(int[] arr,int n,int i){
        int maxIdx=i;
        int leftChildIdx=2*i+1;
        int rigthChildIdx=2*i+2;

        if (leftChildIdx<n&&arr[leftChildIdx]>arr[maxIdx]) {
            maxIdx=leftChildIdx;
        }
        if (rigthChildIdx<n&&arr[rigthChildIdx]>arr[maxIdx]) {
            maxIdx=rigthChildIdx;
        }
        if (i!=maxIdx) {
            // swap
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
            heapify(arr, n, maxIdx);
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};

        System.out.println("Before :");
        display(arr);

        sort(arr);

        System.out.println("After :");
        display(arr);
    }
}