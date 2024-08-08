final class TestSingle {
	private static final TestSingle Ts1 = new TestSingle();
	private TestSingle() {
		
	}
	
	public TestSingle getTestSingle() {
		
		return Ts1;
		
	}
	private static void bonus() {
		System.out.println("1 lakh");
	}
}