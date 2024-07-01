import java.util.*;

public class Arrays {

    public static int getsmallest(int numbers[]){
        int min=Integer.MAX_VALUE;   //(infinity) maximum vlaue in a particular data type
        for(int i=0;i<numbers.length;i++){
            if (min>=numbers[i]) {
                min=numbers[i];
            }
        }
        return min;
    }
    public static int getlargest(int numbers[]){
        int max=Integer.MIN_VALUE;   //(infinity) minimum vlaue in a particular data type
        for(int i=0;i<numbers.length;i++){
            if (max<=numbers[i]) {
                max=numbers[i];
            }
        }
        return max;
    }
    public static void update(int marks[],int nonchangable){
        nonchangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int numbers[],int key){
        int start=0,end=numbers.length; // Array Should Shorted

        while (start<=end) {
            int mid =(start+end)/2;

            if (key==numbers[mid]) {
                return mid;
            }
            if (key>numbers[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reverse(int arr[]){
        int first=0,last=arr.length-1;

        while (first<last) {
            //swap
            int temp;
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
    }
    public static void printPairs(int numbers[]){

        int totalpairs=0;

        for(int i=0;i<numbers.length;i++){

            int current=numbers[i];//For Simplicity 
            

            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+current+","+numbers[j]+") ");
                totalpairs++; //total pairs= n(n-1)/2
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+totalpairs);
    }
    public static void printSubarrays(int numbers[]){
        int totalsubarrays=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int currSum=0;

        for(int i =0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0; 
                //Print
                for(int k=start;k<=end;k++){
                     System.out.print(numbers[k]+ " ");
                    //Sum
                    currSum=currSum+numbers[k];
                }
                System.out.print(" ----------------->Sum of Sub Array : "+currSum);
                //maximum Sum
                if (maxSum<currSum) {
                    maxSum=currSum;
                }
                //minimum Sum
                if (minSum>currSum) {
                    minSum=currSum;
                }
                totalsubarrays++;//(n(n+1))/2
                System.out.println();
            }
            System.out.println();
            }
            System.out.println("Total Subarrays="+totalsubarrays);
        }
        public static void prefixSum(int numbers[],int start,int end){

            int prefixArr[]=new int[numbers.length];

            //Calculate Prefix
            prefixArr[0]=numbers[0];
            for(int i=1;i<numbers.length;i++){
                prefixArr[i]=prefixArr[i-1]+numbers[i];
                }
                int sum;
                if (start==0) {
                    sum=prefixArr[end];
                }
                else{
                    sum=prefixArr[end]-prefixArr[start-1];
                }
                System.out.println("Sum="+sum);
    }
    public static void maxSubarraySum(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<num.length;i++){
            currSum=currSum+num[i];
            if (currSum<0) {
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("Max Subarray Sum Possible : "+maxSum);
    }
    public static void main(String[] args) {

        int marks[]={97,98,99};
        int nonchangable=7;
        update(marks,nonchangable);

        System.out.println(nonchangable);
        System.out.println("--------------------------------------");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("--------------------------------------");
        //---------------------------------------------------

        int numbers[]={2,6,8,10,12,14,16};
        int key=10;

        int index=linearSearch(numbers,key);
        if (index ==-1) {
            System.out.println("Not Found");
        }
        else{
            System.out.println(key+" Found at Index Using Linear Search:"+index);
        }
        System.out.println("--------------------------------------");
        //---------------------------------------------------

        int largest=getlargest(numbers);
        System.out.println("Largest is :"+largest);

        int smallest=getsmallest(numbers);
        System.out.println("Smallest is : "+smallest);

        System.out.println("--------------------------------------");
        //---------------------------------------------------
        //Binary Search (Arrray Should be Shorted)

        System.out.println("Index for Key("+key+") using Binary Search is "+binarySearch(numbers, key));
        System.out.println("--------------------------------------");

        //---------------------------------------------------
        //Reverse An Array
        int arr[]={1,2,3,4};
        reverse(arr);
        System.out.println("Reverse Array : ");
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);

        }

        System.out.println("--------------------------------------");
        
        //---------------------------------------------------
        //Pairs In An Array
        printPairs(numbers);

        System.out.println("--------------------------------------");
        
        //---------------------------------------------------
        //Print SubArrays , Sum of Subarrays,max of sum,min of sum.
         printSubarrays(numbers);

         System.out.println("--------------------------------------");
        
        //---------------------------------------------------
        //Prefix Sum

        Scanner sc=new Scanner(System.in);
        int start,end;

        System.out.println("Array Length="+numbers.length+"\nEnter Starting Index For Prefix Sum : ");
        start=sc.nextInt();
        System.out.println("Enter Ending Index For Prefix Sum : ");
        end=sc.nextInt();
        prefixSum(numbers,start,end);

        System.out.println("--------------------------------------");

        //---------------------------------------------------
        //Maximum Possible Subarray Sum (Kadane's Algorithm)(Optimised)

        int num[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySum(num);

        System.out.println("--------------------------------------");
    }
}
