class QSN8 {
	public static void main(String[] args) {
		
	   //outer loop (row-wiae)
		for(int i=3; i>=1; i--) {
		
	           //inner loop (column-wise) 
			for(int j=1; j<=3; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}