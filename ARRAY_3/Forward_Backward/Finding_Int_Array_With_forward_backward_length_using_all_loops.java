class Finding_Int_Array_With_forward_backward_length_using_all_loops {


	 public static void ForLoop(int num[]) {
    	   //finding forward length (using for loop)
		int store=0;
		for(int i=0; i<=num.length-1; i++) {
			System.out.println("finding forward length using for loop: "+num[i]+" And index is: "+i);
			store=i;
		}
		System.out.println("Total Array of length: "+store+"\n");

	   //finding backward length (using for loop)	
		for(int i=num.length-1; i>=0; i--) {
			System.out.println("finding backward length using loop: "+num[i]+" And index is: "+i);
		}
		System.out.println("Total length of Array is: "+(num.length-1)+"\n\n\n\n");
	}




	public static void WhileLoop(int [] num) {
	   //finding forward length (using While Loop)
		int i=0;
		int store1=0;
		while(i<num.length) {
			System.out.println("finding forward length using while loop: "+num[i]+" And index is: "+i);
			store1=i;
			i++;
		}
		System.out.println("Total length is: "+store1+"\n");

	   //finding backward length (using while loop)
		int j=num.length-1;
		while(j>=0) {
			System.out.println("finding backward length using while loop: "+num[j]);
			j--;
		}
		System.out.println("Total length is: "+(num.length-1)+"\n\n\n\n");
	}



	public static void Do_WhileLoop(int [] num) {
	   //finding forward length (using Do_While Loop)
		int k=0;
		do {
			System.out.println("finding Array in forward way using do_while loop: "+num[k]+" And index is: "+k);
			k++;
		}while(k<=num.length-1);
		System.out.println("Total Length is: "+num.length-1+"\n");
			

	   //finding backward length (using do_while loop)
		int l=num.length-1;
		do {
			System.out.println("finding Array in backward way using Do-while loop: "+num[l]+" And index is: "+l);
			l++;
		}while(l>=0);
		System.out.println("Total length is: "+(num.length-1));
	}



	public static void For_EachLoop(int num[]) {
	   //finding forward length (using for each loop)
		for(int arrr : num) {
			System.out.println("finding forward array elements using for_each loop: "+arrr);
		}
	}


	
	public static void main(String[] args) {
		int [] num={12,32,12,53,13,54};

		ForLoop (num);
		WhileLoop (num);
		Do_WhileLoop (num);
		For_EachLoop (num);
	}

}