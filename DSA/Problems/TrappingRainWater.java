public class TrappingRainWater {

    public static void main(String[] args) {
        
        int height[]={4,2,0,6,3,2,5};
        int width=1;

        System.out.println(trappedRainWater(height, width));
    }
    
    public static int trappedRainWater(int height[],int width){

        int n=height.length;
            //claculate left max boundary - array
            int leftMax[]=new int[n];
            leftMax[0]=height[0];
            for(int i=0;i<n;i++){
                leftMax[i]=Math.max(height[i], leftMax[i-1]);
            }

            //claculate right max boundary - array
            int rightMax[]=new int[n];
            rightMax[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){
                rightMax[i]=Math.max(height[i], rightMax[i+1]);
            }

            int trappedWater=0;
            // loop-> 
            for(int i=0;i<n;i++){

                //Water Level = min(left max boundary,right max boundary)
                int waterLevel=Math.min(leftMax[i], rightMax[i]);

                //trappedWater=waterlevel-height[i]
                trappedWater+=(waterLevel-height[i])*width;

            }
            return trappedWater;
            
    }

    
}
