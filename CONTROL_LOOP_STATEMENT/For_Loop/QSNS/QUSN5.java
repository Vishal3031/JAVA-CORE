//WAJP print how many odd number is there from m to n..

class QUSN5 {
	public static void main(String[] args) {
		int m=100;
		int n=600;
		int count=0;

		for(int i=m; i<=n; i++) {
			if(i%2==1 || i%2!=0) {
				count++;
			}
		}
		System.out.print(count);

	}
}