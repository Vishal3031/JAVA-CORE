//Print the d/w b/w sum of all the even number and product of all the odd number m to n…

class QUSN16 {
	public static void main(String[] args) {
		int m=1;
		int n=10;
		int sum=0;
		int pro=1;

		for (int i=m; i<=n; i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			else if(i%2!=0 || i%2==1) {
				pro=pro*i;
			}
		}
		System.out.print(pro-sum);
	}
}