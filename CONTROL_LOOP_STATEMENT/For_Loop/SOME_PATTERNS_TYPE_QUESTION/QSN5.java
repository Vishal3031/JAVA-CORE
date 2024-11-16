class QSN5 {
	public static void main(String[] args) {
		
	   //outer loop (row-wise)
		for(int i=1; i<=2; i++) {
			
		   //inner loop (column_wise)
			for(char j='A'; j<='C'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}