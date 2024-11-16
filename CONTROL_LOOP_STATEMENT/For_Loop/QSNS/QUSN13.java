//WAJP find out the product of all the even number from m to n..

class QUSN13 {
	public static void main(String[] args) {
		long m=50L;
		long n=100L;
		long pro=1L;

		for(long i=m; i<=n; i++) {
			if(i%2==0) {
				pro=(long)(pro*i);
			}
		}
		System.out.print(pro);
	}
}