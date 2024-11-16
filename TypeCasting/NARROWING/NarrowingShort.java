class NarrowingShort {

	public static void main(String[] args) { 

	//SHORT INTO BYTE
		short a=12;
		byte b= (byte) a;
		System.out.println(a);   //12
		System.out.println(b+"\n");    //12

	//SHORT INTO CHAR
		short c=49;
		char d= (char) c;
		//char d= (char) (short) c;
		System.out.println(c);
		System.out.println(d+"\n");
 
	//SHORT INTO BOOLEAN
		short m=21;
		short n=21;
		boolean z= m==n;
		System.out.print(z);
	}
}