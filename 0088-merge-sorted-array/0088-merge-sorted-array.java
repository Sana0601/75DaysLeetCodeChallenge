class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      /*  if(nums1.length==0)
        {
            return nums2;
        }
        if(nums2.length==0)
        {
            return nums1;
        }*/
        int[] nums3=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                nums3[k]=nums1[i];
                i++;
            }
            else
            {
                nums3[k]=nums2[j];
                j++;
            }
            k++;
        }
         while(i<m)
         {
            nums3[k]=nums1[i];
            i++;
            k++;
         }  
         while(j<n)
         {
            nums3[k]=nums2[j];
            j++;
            k++;
         }
         for(int x=0;x<m+n;x++)
         {
            nums1[x]=nums3[x];
         }
    }
}