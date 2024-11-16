class About_All_Datatype_Object_Reference_with_Datatype_Class_Name {

	public static void check_byte_ref(byte [] numm) {

		System.out.println("finding a value: "+numm[1]);   //calling 1 index value
		System.out.println(" finding this byte object reference: "+numm);    //using this we find byte (class_name@hexadecimal) object reference	
	}

	public static void check_short_ref(short[] num11) {
		System.out.println("\n finding a value"+num11[2]);   //calling 2 index value
		System.out.println(" finding this short object reference: "+num11);   //using this we find short (class_name@hexadecimal) object reference
	}

	public static void check_int_ref(int []num22) {
		System.out.println("\n finding a value: "+num22[0]);    //calling 0 index value
		System.out.println(" finding this int object reference: "+num22);     //using this we find int (class_name@hexadecimal) object reference
	}

	public static void check_long_ref(long num33[]) {
		System.out.println("\n finding a value: "+num33[1]);    //calling 1 index value
		System.out.println(" finding this int object reference: "+num33);     //using this we find long (class_name@hexadecimal) object reference
	}

	public static void check_float_ref(float num44[]) {
		System.out.println("\n finding a value: "+num44[3]);     //calling 3 index value
		System.out.println(" finding this float object reference: "+num44);    //using this we find float (class_name@hexadecimal) object reference
	}

	public static void check_double_ref(double num55[]) {
		System.out.println("\n finding a value: "+num55[0]);    //calling 0 index value
		System.out.println(" finding this double object reference: "+num55);      //using this we find double (class_name@hexadecimal) object reference
	}

	public static void check_char_ref(char ch1[]) {
		System.out.println("\n finding a value: "+ch1[2]);     //calling 2 index value
		System.out.println(" finding this char object reference: "+ch1);      //using this we find char (class_name@hexadecimal) object reference 
	}

	public static void check_boolean_ref(boolean bb[]) {
		System.out.println("\n finding a value: "+bb[2]);    //calling 2 index value
		System.out.println(" finding this boolean object reference: "+bb);    //using this we find boolean (class_name@hexadecimal) object reference
	}

	public static void check_string_ref(String str[]) {
		System.out.println("\n finding a value: "+str[1]);    //calling 1 index value
		System.out.println(" finding this stringobject reference: "+str);     //using this we find string (class_name@hexadecimal) object reference 
	}

	


	public static void main(String args[]) {

	   //initializing array without size
		byte num[]={12,3,4,2};
		short num1[]={21,4,5,3};
		int num2[]={1,2,3,4};
		long num3[]={90,43,23,43};
		float num4[]={9.3f,2.4f,1.5f,6.4f};
		double num5[]={7.4d,9.6d,4.6d,4.5d,5.5d};
		char ch[]={'A','V','D','R'};
		boolean []b={true,false,true,true};
		String str[]= {"vishal","vihaan", "bishu"};

		
	   //calling the statement
		check_byte_ref (num);
		check_short_ref (num1);
		check_int_ref (num2);
		check_long_ref (num3);
		check_float_ref (num4);
		check_double_ref (num5);
		check_char_ref (ch);
		check_boolean_ref (b);
		check_string_ref (str);
		
	}

}