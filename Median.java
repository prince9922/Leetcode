class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i=0,j=0;
       int x=nums1.length+nums2.length;
        int[] merged=new int[x];
        
            for(int p=0;p<x;p++)
            {
                if(i<nums1.length && j<nums2.length)
                {
                    if(nums1[i]<nums2[j])
                    {
                        merged[p]=nums1[i++];
                    }
                    else
                    {
                          merged[p]=nums2[j++];
                    }
                }
                else if(i<nums1.length)
                {
                    merged[p]=nums1[i++];
                }
                else
                {
                    merged[p]=nums2[j++];
                }

            }

            
             if(x%2!=0)
            {
            
                return merged[x/2];
                
            }
            else
            {
            
                return (merged[x/2 - 1] + merged[x/2]) / 2.0;
                
            }


    }   
    
        
    
}
