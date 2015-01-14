
public class TestStack {
	public static void main(String[] args) {
	
		StackInt s = new StackInt();
		s.push(3);
		s.push(1);
		s.push(5);
		s.push(2);
		s.push(1);
		
		for(int i = 0; i < 5; i++){
			
		System.out.println("Min: "+s.getMin());
		System.out.println("Pop: "+s.pup());	
		
		}
		
		
		
	System.out.println("-----------Stack--------");
	StackInt test = new StackInt();
	test.push(1);
	test.push(2);
	test.push(3);
	test.push(4);
	
	//System.out.println(test.toString());
	System.out.println("last nuber is: "+ test.peek());
	System.out.println("Get size" + test.getSize());
	
	test.pup();
	//System.out.println("Contains: " + test.contains(4));
	
	System.out.println("-----------MYQueue--------");
	MyQueue  testMq = new MyQueue();		
	
	testMq.push(5);
	testMq.push(10);
	testMq.push(15);
	testMq.push(20);

	System.out.println("Size is: " + testMq.getSize());
	System.out.println("Pop FIFO methode: " + testMq.pop());
	System.out.println("newSize is: " + testMq.getSize());
	
	
	
}
}