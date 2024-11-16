class QSN3 {
	public static void main(String[] args) {
		char ch='A';

	   //outer loop(row-wise)
		for(int i=1; i<=2; i++) {
			
		   //inner loop(column_wise) 
			for(int j=1; j<=4;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}