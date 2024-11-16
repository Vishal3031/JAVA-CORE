class combination1_2_3_4_5 {
	public static void moon() {
			System.out.println("BASE");
	}
	public static void drive() {
		System.out.println("DRIVE METHOD");
		moon();
	}
	public static void run() {
		System.out.println("Run method");
	}
	public static void sleep() {
		System.out.println("hello mr vihaan");
		run();
	}
	public static void game() {
		System.out.println("let's talk");
		sleep();
	}

	public static void main(String[] args) {
		System.out.println("start main method");
		game();
		
	}
}