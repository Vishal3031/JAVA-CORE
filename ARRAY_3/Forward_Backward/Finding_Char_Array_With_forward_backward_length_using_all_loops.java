class Finding_Char_Array_With_forward_backward_length_using_all_loops {

	/*public static void ForLoop(char ch[]) {
		
	   //finding forward length (using for loop)
		int Store=0;
		for(int i=0;i<=ch.length-1;i++) {   //(ch.length-1)  first we refer with length, after this length find all the length inside the char array
			System.out.println("using For loop In forward way Array of char value is: "+ch[i]+" And index is: "+i);
			Store=i;
		}
		System.out.println(" Total length is: "+Store+"\n");

	   //finding backward length (using for loop)
		for(int i=ch.length-1 ;i>=0; i--) {
			System.out.println(" In backward way Array of char value is: "+ch[i]+" And index is: "+i);
		}
		System.out.println(" In For Loop Total length is: "+ (ch.length-1)+"\n\n\n\n");
	}



	public static void WhileLoop(char ch[]) {
	   //finding forward length (using while loop)
		int i=0;
		int Store1=0;
		while(i<=ch.length-1) {
			System.out.println("Using While Loop In forward way Array of char value is: "+ch[i]+" And Index is: "+i);
			Store1=i;
			i++;
		}
		System.out.println(" Total length of Array is: "+Store1+"\n");

	   //finding backward length (using while loop)
		int j=ch.length-1;
		int Store2=j;
		while(j>=0) {
			System.out.println("In backward way array of char value is: "+ch[j]+" And Index is: "+j);
			j--;
		}
		System.out.println(" In While Loop Total length of Array is: "+Store2+"\n\n\n\n");
	}



	
	public static void Do_WhileLoop(char ch[]) {
	   //finding forward length (using Do-While Loop)
		int i=0;
		int store5=0;
		do {
			System.out.println("Using Do-While Loop In forward way array of char value is: "+ch[i]+" And Index is: "+i);
			store5=i;
			i++;
		}while(i<=ch.length-1);
		System.out.println(" Do_While Loop Total length is: "+store5+"\n");

	   //finding backward length (using do-while loop) 
		int j=ch.length-1;
		int Store4=j;
		do {
			System.out.println(" In backward way to find Array value is: "+ch[j]+" And Index is: "+j);
			j--;
		}while(j>=0);
		System.out.println("Do-While Loop Total length is: "+(ch.length-1)+"\n\n\n\n");
	}




	public static void For_EachLoop(char ch[]) {
	    //finding forward length(using for_each loop)
		System.out.println("Using For_Each Loop we can only traverse one by one");
		for(char obj:ch) {	
			System.out.println(obj+"  ");
		}
 	}*/

	public static void WhileLoop(int [] num) {
		//finding forward length (using While Loop)
		int i=0;
		while(i<num.length) {
			System.out.println("finding forward length using while loop: "+num[i]+" And index is: "+i);
			i++;
		}
		System.out.println(" Total length is: "+i);
 
		//finding backward length (using while loop)
		int i=num.length-1;
		while(i>=0) {
			System.out.println(" finding backward length using while loop: "+num[i]+"\n\n\n\n");
			i--;
		}
		System.out.println("Total length is: "+(num.length-1)+"\n\n\n\n");
	}
	public static void main(String[] args) {

		char ch[]={'A','B','C','D','E','F','G'};
		ForLoop(ch);
		WhileLoop(ch);      
		Do_WhileLoop(ch);
		For_EachLoop(ch);
	}
}
	


	
		