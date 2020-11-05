public class mergesorting
{
    public static void merge(int[] arr1, int[] arr2, int n1, int n2, int[] arr3)
    {
    	int i = 0;
      	int j = 0;
    	int k = 0;
    	
    	while(i<n1&&j<n2) {
    		if(arr1[i] < arr2[j]) {
    			arr3[k]=arr1[i];
    			i++;
    		}
    		else {
    			arr3[k]=arr2[j];
    			j++;
    		}	
    		k++;
    	}
    	
    	while(i<n1) {
    		arr3[k]=arr1[i];
    		i++;
    	}
    	
    	while(j<n2) {
    		arr3[k]=arr2[j];
    		j++;
    	}
    	
    	
    }
     
    public static void main (String[] args) 
    {
        int[] arr = {2, 3, 5, 7, 9};
        int n1 = arr.length;
     
        int[] arr3 = new int[n1+n2];
         
        merge(arr1, arr2, n1, n2, arr3);
     
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");

    }
}