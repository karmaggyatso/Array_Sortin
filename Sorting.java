public class Sorting {

	public static void main(String[] args) {
		//creates an array of 8 objects of class A
		A[] objs = new A[8];
		
		initialize(objs);
		
		sortSelectByAge(objs);
		
		display(objs);
	}
	
	//initialize the array with 8 objects name and age each
	public static void initialize(A[] objs) {
		String[] a = {"carlos","juan","susan","javier","rose","maria","charlie","daisy"};
		
		for(int i=0,j=objs.length;i<objs.length;i++,j--) {
			objs[i] = new A(j,a[i]);
		}
	}

	//display content of array
	public static void display(A[] objs) {
		for(int i=0;i<objs.length;i++) {
			objs[i].print();
		}
	}
	
	//sort array by name
	public static void sortSelectByName(A[] objs) {
		for(int i=0;i<objs.length;i++) {
			// Find the minimum element in unsorted array
			int min_idx = getMinIndexName(i,objs);
			swap(min_idx,i, objs);
		}
	}

	//sort array by age
	public static void sortSelectByAge(A[] objs) {
		for(int i=0;i<objs.length;i++) {
			// Find the minimum element in unsorted array
			int min_idx = getMinIndex(i,objs);
			swap(min_idx,i, objs);
		}
	}
     
	public static int getMinIndex(int index, A[] arr) {
        int min_idx = index;
        for (int j = index+1; j < arr.length; j++)
            if (arr[j].getAge() < arr[min_idx].getAge())
                min_idx = j;

        return min_idx;
	}

	public static int getMinIndexName(int index, A[] arr) {
        int min_idx = index;
        for (int j = index+1; j < arr.length; j++)
            if (arr[j].getName().compareTo(arr[min_idx].getName()) < 1)
                min_idx = j;

        return min_idx;
	}

	public static void swap(int i, int j, A[] n) {
		A temp = new A(n[i].getAge(),n[i].getName());
		n[i] = n[j];
		n[j] = temp;
	}
	
}


