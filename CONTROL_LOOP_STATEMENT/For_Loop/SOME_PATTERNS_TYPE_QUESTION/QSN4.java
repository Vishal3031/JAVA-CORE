class QSN4 {
	public static void main(String[] args) {
		
	   //outer loop (row-wise)
		for(int i=1; i<=3;i++) {

		   //inner bond (column-wise)
			for(int j=1; j<=3; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}