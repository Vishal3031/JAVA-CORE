class NarrowingFloat {
	public static void main(String[] args) {
		
	   //FLOAT INTO LONG.....
		float a=12.2f;
		long b=(long) a;
		System.out.println(a);   //12.2
		System.out.println(b+"\n");   //12


	   //FLOAT INTO INT....
		float c=123.2f;
		int d=(int) c;
		System.out.println(c);   //123.2
		System.out.println(d+"\n");    //123

	   //FLOAT INTO SHORT....
		float g=324.4f;
		short h= (short) g;
		System.out.println(g);   //324.4
		System.out.println(h+"\n");   //324

	   //FLOAT INTO BYTE....
		float e=42.3f;
		byte f=(byte) e;
		System.out.println(e);    //42.3
		System.out.println(f+"\n");   //42

	   //FLOAT INTO CHAR....
		float j=97.3f;
		char k=(char) j;
		//char k=(char)(int) j;
		System.out.println(j);    //97.3
		System.out.println(k+"\n");    //a

	   //FLOAT INTO BOOLEAN...
		float m=12.43f;
		float n=15.45f;
		bolean p= m>n;
		System.out.println(p);

 
	}
}