
public class MedianOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1,12,15,26,38};
		int arr2[] = {2,13,17,30};
		
		/*int sum1=0;
		int count=0;
		for(int i:arr1){
			sum1 = sum1+i;
			count++;
		}
		
		System.out.println("mean of arr1 = "+sum1/count);*/
		int len = arr1.length+arr2.length;
		int arr3[] = new int[len];
		
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}
		
		while(i < arr1.length)
			arr3[k++] = arr1[i++];
		while(j < arr2.length)
			arr3[k++] = arr2[j++];
		
		for(int z:arr3)
			System.out.print(z+"\t");
		
		System.out.println();
		
		if(len%2 != 0){
			System.out.println("median for odd = "+arr3[len/2]);
		}
		else{
			System.out.println("median for even = "+ (float)(arr3[len/2-1]+arr3[len/2])/2);
		}
		
		
	}

}
