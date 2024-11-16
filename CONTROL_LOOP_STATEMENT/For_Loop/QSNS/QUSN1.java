//how many even numbers are available in one to fifteen…

class QUSN1 {
	public static void main(String[] args) {
		int num=15;
		int count=0;

		for (int i=1; i<=15; i++) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.print(count);
	}
}
			