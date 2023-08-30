package understandinglambdas.part_7.closures;

public class ClosuresDemo{
	public static void main(String[] args) {
		int value_1 = 10;
		int value_2 = 20;
		
		doProcess (value_1, new Processor() {
			@ Override
			public void process(int i) {
//				value_2++; 									
				System.out.println(i + value_2);
			}
		});
		
		doProcess (value_1, i -> System.out.println(i + value_2));
	}
	
	public static void doProcess(int value, Processor process) {
		process.process (value); 
	}
	
	@FunctionalInterface
	interface Processor{
		void process(int i);
	}
}