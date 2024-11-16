class QSN15 {
	public static void main(String[] args) {
		char ch='I';
	   //outer loop (row-wise) 
		for(int i=1; i<=3; i++) {
		   //inner loop (column-wise)
			for(int j=1; j<=3; j++) {
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
	}
}