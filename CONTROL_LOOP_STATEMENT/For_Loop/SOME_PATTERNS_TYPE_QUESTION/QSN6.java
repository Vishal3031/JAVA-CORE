class QSN6 {
	public static void main(String[] args) {
		
	   //outer loop (row_wise)
		for(char ch='A';ch<='C';ch++) {
		
		   //inner loop (column_wise) 
			for(int i=1; i<=3; i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}