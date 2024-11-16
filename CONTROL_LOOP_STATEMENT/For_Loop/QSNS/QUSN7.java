//Print the number are divisible by three from m to n…

class QUSN7 {
	public static void main(String[] args) {
		int m=30;
		int n=60;
		
		for(int i=m; i<=n; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
}