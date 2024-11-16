class NarrowingLong {
	public static void main(String[] args) {

	//LONG INTO INT
		long a=12L;
		int b=(int) a;
		System.out.println(a); //12
		System.out.println(b+"\n"); //12


	//LONG INTO SHORT
		long c=13L;
		short d=(short) c;
		System.out.println(c); //13
		System.out.println(d+"\n"); //13

	//LONG INTO BYTE
		long e=99L;
		byte f=(byte) e;
		System.out.println(e); //99
		System.out.println(f+"\n"); //99

	//LONG INTO CHAR
		long g=65L;
		char h=(char) g;
		//char j= (char)(int) g; 
		System.out.println(g); //65
		System.out.println(h+"\n"); //A

	//LONG INTO BOOLEAN
		long m=13L;
		long n=23L;
		boolean z= m<n;
		System.out.println(z); //true

	}
}