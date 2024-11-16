class QSN1O {
	public static void main(String[] args) {
	
	   //outer loop (row-wise)
		for(int i=1; i<=3;i++) {
		   //inner loop (column-wise)
			for(int j=3; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}