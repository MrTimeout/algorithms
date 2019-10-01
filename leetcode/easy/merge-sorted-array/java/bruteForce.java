class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0, k;
        System.out.println(m);
        for(int i = 0; i < m+j && j < n; i++)
        {
            if(nums1[i] > nums2[j])
            {
                for(k = m+j; k > i;)
                {
                    nums1[k] = nums1[--k];
                }
                nums1[k] = nums2[j++];
            }
        }
        for(;j < n; j++)
            nums1[j+m] = nums2[j];
    }
}
