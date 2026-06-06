public class Solution{
    public static int trap(int[] height){
        if(height==null || height.length<3){
            return 0;
        }
        int leftmax=height[0];
        Stack<Integer>s=new Stack<>();
        s.push(height[height.length-1]);
        for(int i=height.length-1;i>=2;i--){
            s.push(Math.max(height[i],s.peek()));
        }
        int water=0;
        for(int i=1;i<height.length-1;i++){
            int minHeight=Math.min(leftmax,s.peek());
            water=water+Math.max(0,minHeight-height[i]);
            s.pop();
            leftmax=Math.max(leftmax,height[i]);
        }
        return water;
    }
    public static void main(String []args){
        int[] height={4,2,0,3,2};
        int result=trap(height);
        System.out.println(result);
    }
}