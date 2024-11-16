class Access_Modifier_with_way_of_Declaration_of_Array_without_parameter_in_array_with_short_type {

	private static void method() {
		short[] A={12,23,12,43};            //in this, we declare and intialize value without passing size of index
		System.out.println(A[0]);
	}

	static void method1() {
		short [] B;
		B=new short[4];               //in these 2 line, use for declration with size of index.. 
		B[0]=12;
		B[1]=23;
		B[2]=32;
		B[3]=34;

		System.out.println(B[3]);
	}	

	protected static void method2() {
		short C[]=new short[4];    //in this single line, we declare with giving size of index..
		C[0]=12;
		C[1]=32;
		C[3]=34;
		C[2]=45;

		System.out.println(C[2]+"\n");
	}

	public static void method3() {
		short D[];
		D=new short[4];
		D[2]=23;
		D[3]=43;

		System.out.println(D[2]);
		System.out.println(D[0]);    //you're not initializing value so it display default value, and default value of short is 0
		System.out.println(D);       //it display address of D,..
	}
	
	public static void main(String[] args) {

		method();
		method1();
		method2 ();
		method3 ();
	}
}