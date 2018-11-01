package assignment7;

public class Median {

	public static void main(String[] args) {
		int[] nums1 = new int[] {1,2};
		int[] nums2 = new int[] {3,4};
		int n1 = nums1.length;
		int n2 = nums2.length;
          
        if (n1 < n2) 
            System.out.print("The median is : " +  
                   findMedianSortedArrays(nums1, nums2)); 
        else
            System.out.print("The median is : " +  
                   findMedianSortedArrays(nums2, nums1)); 

	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int n1 = nums1.length;
		int n2 = nums2.length;
		int i = 0; 
		int j = 0;     
		int k; 
		int m1 = -1, m2 = -1; 
		for (k = 0; k <= (n1 + n2) / 2; k++) 
		{ 

			if (i < n1 && j < n2) 
			{ 
				if (nums1[i] < nums2[j]) 
				{ 
					m2 = m1; 
					m1 = nums1[i]; 
					i++; 
				} 
			else 
			{ 
				m2 = m1; 
				m1 = nums2[j]; 
				j++; 
			} 
			}
   
            else if (i == n1)  
            { 
            	m2 = m1; 
            	m1 = nums2[j]; 
            	j++; 
            } 

            else if (j == n2)  
            { 
            	m2 = m1; 
            	m1 = nums1[i]; 
            	i++; 
            } 
		} 

		if ((n1 + n2) % 2 == 0) 
		{ 
			return (m1 + m2) *(float) 1.0 / 2; 
		} 

		return m1; 
	}

}
