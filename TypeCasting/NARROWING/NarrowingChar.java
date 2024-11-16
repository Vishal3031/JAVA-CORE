class NarrowingChar {

	public static void main(String[] args) {

	//CHAR INTO DOUBLE
		char a= 'A';
		double b= (double) a;
		//double b= (double) (char) a;
		System.out.println(a);  //A
		System.out.println(b+ "\n");  //65.0

	//CHAR INTO FLOAT
		char c= 'a';
		float d= (float) c;
		//float d=(float) (char) c;
		System.out.println(c);  //a
		System.out.println(d+ "\n");  //97.0

	//CHAR INTO INT
		char e='1';
		int f= (int) e;
		//int f= (int) (char) e;
		System.out.println(e);  //1
		System.out.println(f+"\n");  //49
		
	//CHAR INTO SHORT
		char g='B';
		short h= (short) g;
		//short h= (short) (char) g;
		System.out.println(g);    //B
		System.out.println(h+"\n");   //66

	//CHAR INTO BYTE
		char j='Z';
		byte k= (byte) j;
		//byte k= (byte) (char) j;
		System.out.println(j);    //Z
		System.out.println(k+"\n");   //90

	//CHAR INTO BOOLEAN
		char m= '9';
		char n= '9';
		int w= (int) m;
		int x= (int) n;
		boolean p= w==x;
		
		System.out.println(m);      //9
		System.out.println(n);      //9
		System.out.println(w);        //57
		System.out.println(x);        //57

		System.out.println(p);        //true
	}
}
		