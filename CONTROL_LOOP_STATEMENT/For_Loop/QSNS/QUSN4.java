//WAJP print how many even number is there from m to n..

class QUSN4 {
	public static void main(String[] args) {
		int m=50;
		int n=100;
		int count=0;

		for(int i=m; i<=n; i++) {
			if(i%2==0) {
				count++;
				
			}
		}
		System.out.print(count);
	}
}