class NarrowingInt {

		public static void main(String[] args) {

	//INT INTO SHORT
		int a=12;
		short b=(short) a;
		System.out.println(a); //12
		System.out.println(b+"\n"); //12

	//INT INTO BYTE
		int c=15;
		byte d=(byte) c;
		System.out.println(c);  //15
		System.out.println(d+"\n");  //15

	//INT INTO CHAR
		int e=97;
		char f=(char) e;
		//char f=(char) (int) e;
		System.out.println(e);  //97
		System.out.println(f+"\n");  //a	
		
	//INT INTO BOOLEAN
		int g=15;
		int h=20;
		boolean z=g!=h;
		System.out.println(z+"\n");  //true

	}
}