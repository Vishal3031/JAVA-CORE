//finding_Byte_Array_with_forward_Backward_length_Using_All_Loops....

class finding_Byte_Array_with_forward_Backward_length_Using_All_Loops { 

	/*public static void ForLoop(byte a[]) {
		//forward direction (using for loop)
			int Store=0;
			for(int i=0; i<=a.length-1; i++){
				System.out.println("with forward way array of value is: " +a[i]+" And index is: "+i);
				Store=i;
			}
			System.out.println("Total number of index is: "+Store);

		//backward direction (using for loop)
			for(int j=a.length-1; j>=0; j--) {
				System.out.println("with Backward way array of value is: "+a[j]+" And index is: "+j);
			}
			System.out.println("Total number of index is: "+Store+"\n\n\n\n");
	}


	public static void WhileLoop(byte[] a) {
		//forward direction (using while loop)
			int i=0;
			int store1=0;
			while(i<=a.length-1) {
				System.out.println("with forward way array of value is: "+a[i]+" And index is: "+i);
				store1=i;
				i++;
			}
			System.out.println("Total number of index is: "+store1);

		//backward direction (using while loop)
			int j=a.length-1;
			while(j>=0) {
				System.out.println("with Backward way array of value is: "+a[j]+" And index is: "+j);
				j--;
			}
			System.out.println("Total number of index is: "+store1+"\n\n\n\n");
	}*/


	public static void Do_WhileLoop(byte [] a) {
		//forward direction (using do-while loop)
			int i=0;
			int store2=0;
			do {
				System.out.println("with forward way array of value is: "+a[i]+" And index is: "+i); 
				store2=i;
				i++;
			}while(i<=a.length-1);
			System.out.println("Total number of index is: "+store2);
	
		//backward direction (using do-while loop)
			int j=a.length-1;
			do{
				System.out.println("with backward way array of value is: "+a[j]+" And index is: "+j);
				j--;
			}while(j>=0);
			System.out.println("Total number of index is: "+store2+"\n\n\n\n");
	}


	/*public static void For_EachLoop(byte []a) {
		//forward direction (using for-each loop)
			for(byte str:a) {
				System.out.println("with forward way array of value is: "+str);
			}
	}*/


	public static void main(String[] args) {
		byte []arr={12,13,14,15,16};

		//ForLoop(arr);
		//WhileLoop(arr);
		Do_WhileLoop(arr);
		//For_EachLoop(arr);
	}
}