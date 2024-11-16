//WAJP find out the sum of all the even number from m to n..

class QUSN12 {
	public static void main(String[] args) {
		int m=50;
		int n=100;
		int sum=0;

		for(int i=m; i<=n; i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.print(sum);
	}
}