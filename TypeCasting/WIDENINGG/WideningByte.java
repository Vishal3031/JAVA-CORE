class WideningByte {
	public static void main(String[] args) {
		
	   //BYTE INTO SHORT
		byte num1=12;
		byte num=1;
		short num2=(short)(num1+num);

		System.out.println(num1);  //12
		System.out.println(num2);  //13

	   //BYTE INTO INTEGER
		byte num3=14;
		int num4=num3+1;
		System.out.println(num3);  //14
		System.out.println(num4);  //15

	   //BYTE INTO LONG
		byte num5=16;
		long num6=num5+1;
		System.out.println(num5);  //16
		System.out.println(num6);  //17

	   //BYTE INTO FLOAT
		byte num7=18;
		float num8=num7+1;
		System.out.println(num7);  //18
		System.out.println(num8);  //19
		
	   //BYTE INTO DOUBLE
		byte num9=20;
		double num10=num9+1;
		System.out.println(num9);  //20
		System.out.println(num10);  //21

	   //BYTE INTO CHAR
		byte num11=97;
		char num12=(char)(num11+1);
		System.out.println(num11);  //97
		System.out.println(num12);  //b
	}
}