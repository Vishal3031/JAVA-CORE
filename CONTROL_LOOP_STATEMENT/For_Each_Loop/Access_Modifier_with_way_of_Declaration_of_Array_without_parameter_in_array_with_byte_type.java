class Access_Modifier_with_way_of_Declaration_of_Array_without_parameter_in_array_with_byte_type {

/*	private static void method1() {             //it is a class level modifier
		byte [] arr= {12,32,12,3,2};
		System.out.print("Array of farward length is:\n");

		for(byte i : arr) {
			System.out.print(i+" ");
		}
	}*/

/*	static void method2() {    //the accessibility of default modifiers is only within the package...
		byte ar[];
		ar=new byte[4];
		ar[0]=23;
		ar[1]=21;
		ar[2]=11;
		ar[3]=22;
		System.out.println("Array of forward length is:\n");

		for(byte j : ar) {
			System.out.print(j+" ");
		}
	}*/

/*	public static void Method3() {    //it can be accessed from within the class, outside the class, within the package as well as outside the package..
		byte [] a=new byte[4];
		a[0]=21;
		a[1]=99;
		a[2]=44;
		a[3]=55;
		System.out.println("Array of forward length is:\n");

		for(byte k : a) {
			System.out.print(k+" ");
		}
	}*/

	protected static void method4() {    //Access within the package and outside the package through child class.. if you don't make the child class, it cannot be accessed from outside the package....
		byte arr[];
		arr=new byte[4];
		arr[2]=32;
		arr[3]=54;
		
		System.out.print("Array of forward length is: \n");
		for(byte m : arr) {
			System.out.print(m+" ");
		}
	}
	
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//Method3();
		method4();
	}
}
