class A_to_Z_with_odd {
	public static void main(String[] args) {
		char ch='A';
		char ch1='Z';

		while(ch<=ch1) {
			System.out.println(ch);
			ch=(char)(ch+2);
		}
	}
}