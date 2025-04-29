package Arraydemo;

public class Array1 {
	
	void  display(int []arr) {
		System.out.println("Array elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
	}
// multiply method	
	int multiply(int arr[]) {
		int sum=1;
		for(int i=0;i<arr.length;i++)
				sum*=arr[i];
		return sum;
	}
	
	
// Sorting	
    int partition(int a[], int low, int high)
    {
        int pivot = a[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
          
            // If current element is smaller than or
            // equal to pivot
            if (a[j] <= pivot)
            {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }


    
    void Quicksort(int a[], int l, int h)
    {
        if (l < h)
        {
            int pi = partition(a, l, h);

            // Recursively sort elements before
            // partition and after partition
            Quicksort(a, l, pi-1);
            Quicksort(a, pi+1, h);
        }
    }

	

		
	
	}

