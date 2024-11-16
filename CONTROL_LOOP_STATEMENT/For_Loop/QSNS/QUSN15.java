//WAJP find out the product of all the odd number from m to n..

class QUSN15 {
	public static void main(String[] args) {
		int m=1;
		int n=10;
		int pro=1;

		for(int i=m; i<=n; i++) {
			if(i%2!=0) {
				pro=pro*i;
			}
		}
		System.out.print(pro);
	}
}
		