class NarrowingDouble {
	public static void main(String[] args) {
		
	   //Double InTo float
		double a=123.23D;
		float b=(float)a;     //you can change Explicitly data to implicit by using (Implicit_Data)
		System.out.println(a); //123.23
		System.out.println(b+"\n"); //123.23

	   //Double InTo Long
		double c=321.45D;
		long d=(long)c;
		System.out.println(c); //321.45
		System.out.println(d+"\n"); //321

	   //Double InTo int
		double e=221.45D;
		int f=(int)e;
		System.out.println(e); //221.45
		System.out.println(f+"\n"); //221

	   //Double InTo Short
		double g=421.45D;
		short h=(short)g;
		System.out.println(g); //421.45
		System.out.println(h+"\n"); //421

	   //Double InTo byte
		double I=121.45D;
		byte J=(byte)I;
		System.out.println(I); //121.45
		System.out.println(J+"\n"); //121

	   //Double InTo Char
		double k=65.0D;
		char l=(char)(int) k;     //cast to int then char  
		//char l=(char) k;       //YOU can also do this type of things
		System.out.println(k); //65.0
		System.out.println(l+"\n"); //A

	   //Double into Boolean
		double m= 10.15D;
		double n=12.12D;
		boolean o= m<n;
		System.out.println(m);  //10.15
		System.out.println(n);  //12.12
		System.out.println(o);  //true
	}

}