import java.util.*;

public class BasicSorting {

    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){

            for(int j=0;j<arr.length-1-turn;j++){

                if (arr[j]>arr[j+1]){
                    //arr[j]>arr[j+1] for ascending order
                    //arr[j]<arr[j+1] for decending order
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[minPos]>arr[j]) { 
                    //arr[minPos]>arr[j] for ascending order
                    //arr[minPos]<arr[j] for decending order
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionSort(int arr[]){
        
        for(int i=1;i<arr.length;i++){
            
            int curr=arr[i];
            int prev=i-1;

            //finding out the correct position to insert
            while (prev>=0 && arr[prev]>curr) { 
                    //for acending prev>=0 && arr[prev]>curr
                    //for acending prev>=0 && arr[prev]<curr
                arr[prev+1]=arr[prev];
                prev--;
            }
            //intertion
            arr[prev+1]=curr;
        }
    }
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        int count[]= new int[largest+1];

        //frequency
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            //for(int i=0;i<count.length;i++) for ascending
            //for(int i=count.length;i>=0;i--) for decending
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarr(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,5,3,2,1};

        System.out.println("Using Bubble Sort");
        bubbleSort(arr);
        printarr(arr);

        System.out.println("Using Selection Sort");
        selectionSort(arr);
        printarr(arr);

        System.out.println("Using Insertion Sort");
        insertionSort(arr);
        printarr(arr);

        System.out.println("Using Counting Sort");
        countingSort(arr);
        printarr(arr);
    }
}