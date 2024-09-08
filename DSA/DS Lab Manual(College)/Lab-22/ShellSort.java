public class ShellSort {

    public static void sort(int[] arr){
        shellSort(arr);
    }
    
    public static void shellSort(int[] arr){
        int n=arr.length;
        for(int gap=n/2;gap>0;gap/=2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>=0;i-=gap){
                    if (arr[i]>arr[i+gap]) {
                        //swap
                        int temp = arr[i];
                        arr[i]=arr[i+gap];
                        arr[i+gap]=temp;

                    }else{
                        break;
                    }
                }
            }
        }
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={50,40,30,20,10};

        System.out.println("Before :");
        display(arr);

        sort(arr);

        System.out.println("After :");
        display(arr);
    }
}
