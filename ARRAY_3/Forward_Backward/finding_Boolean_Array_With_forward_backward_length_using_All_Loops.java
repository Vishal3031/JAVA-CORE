class finding_Boolean_Array_With_forward_backward_length_using_All_Loops {

	/*public static void ForLoop(boolean A[]) {
	   //finding Array With forward length
		int index=0;
		for(int i=0; i<=A.length-1; i++) {
			System.out.println("Array of element by forward length wise: "+A[i]+" And index is: "+i);
			index=i;
		}
		System.out.println("Total Length is: "+index);

	   //finding Array with Backward length
		for(int j=A.length-1; j>=0; j--) {
			System.out.println("Array of element by Backward length wise: "+A[j]+" And index is: "+j);
		}
		System.out.println("Total length is: " +(A.length-1)+ "\n\n\n\n\n");
	}*/

	/*public static void WhileLoop(boolean B[]) {
	   //finding Array With Forward length
		int i=0;
		int index1=0;
		while(i<=B.length-1) {
			System.out.println("Array of element by Backward length wise: "+B[i]+" And index is: "+i);
			index1=i;
			i++;
		}
		System.out.println("Total Length is: "+index1);

	   //finding Array With Backward length
		int j=B.length-1;
		while(j>=0) {
			System.out.println("Array of element by Backward length wise: "+B[j]+" And index is: "+j);
			index1=j;
			j--;
		}
		System.out.println("Total Length is: "+(B.length-1));
	}*/

	public static void Do_While_Loop(boolean C[]) {
	   //finding Array with Forward length
		int i=0;
		int index3=0;
		do {
			System.out.println("Array of element by Backward length wise: "+C[i]+" And index is: "+i);
			index3=i;
			i++;
		}while(i<=C.length-1);
		System.out.println("Total lemgth is: "+index3);

	   //finding Array with Backward length
		int j=C.length-1;
		do {
			System.out.println("Array of element by Backward length wise: "+C[j]+" And index is: "+j);
			j--;
		}while(j>=0);
		System.out.println("Total length is: "+(C.length-1));
	}

	/*public static void ForEachLoop(boolean D[]) {
	   //finding Array with forward length
		for(boolean go:D) {
			System.out.println("Array of element by Backward length wise: "+go);
		}
	}*/


	public static void main(String[] args) {
		
		boolean A[]={true, false, true, false};
		boolean B[]={false, true, false, true};
		boolean C[]={true, false, true, false};
		boolean D[]={false, true, false, true};

		//ForLoop (A);
		//WhileLoop (B);
		Do_While_Loop (C);
		//ForEachLoop (D);
	}
}
		
	