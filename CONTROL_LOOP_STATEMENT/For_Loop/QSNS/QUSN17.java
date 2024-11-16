//Print the d/w b/w product of all the even number and sum of all the odd number m to n…

class QUSN17 {
	public static void main(String[] args) {
		int m=1;
		int n=10;
		int sum=0;
		int pro=1;

		for (int i=m; i<=n; i++) {
			if(i%2==0) {
				pro=pro*i;
			}
			else{
				sum=sum+i;
			}
		}
		System.out.print(pro-sum);
	}
}