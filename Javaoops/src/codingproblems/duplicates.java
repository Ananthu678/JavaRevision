package codingproblems;

class duplicates {
    public static int removeDuplicates(int[] nums, int n) {
        
        int j=0;
        for (int i=0; i<n-1;i++)
            if(nums[i]!=nums[i+1])
                nums[j++]=nums[i];
        
        nums[j++]= nums[n-1];
        
        return j;
        
    }
    
    public static void main( String[] args){
        int a[]={1,1,2,2};
        int n =a.length;
        
        n=removeDuplicates(a,n);
        
        for(int i=0; i<n; i++)
            System.out.println("the new array is :" + a[i]);
    }
}