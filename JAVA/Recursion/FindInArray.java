public class FindInArray {
    public static int findFirstOccurence(int[] arr, int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return findFirstOccurence(arr, key, i + 1);
    }

    public static int findLastOccurence(int[] arr, int key, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return findLastOccurence(arr, key, i - 1);
    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7, 8, 9, 10 };
        int key = 7;
        int idxf=findFirstOccurence(arr, key,0);
        int idxl=findLastOccurence(arr, key,arr.length-1);

        System.out.println("First occurence of "+key+" is at index :" + idxf);
        System.out.println("Last occurence of "+key+" is at index :" + idxl);
    }
}
