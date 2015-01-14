/**
 * Implementirajte klasu MyQueue koja implementira queue koristeci 2 stacka. (mozete
koristiti Javin stack)
 */

import java.util.Stack;


	public class MyQueue {
	/**
	 *	koristit cemo dva javina stacka  	
	 */
	private  Stack<Integer> s1;
	private  Stack<Integer> s2;
	
	/**
	 * Constructor
	 */
	public MyQueue(){
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
		
	/**
	 * 
	 * @param value broj koji dodajemo na prvi stack
	 */
	public void push(int value){
		s1.push(value);		
	}
	
	/**
	 * 
	 * @return prebacivanje iz jednog stacka sa push metodom u drugi stack preko popa
	 */
	public int pop(){
		if(s1.isEmpty())
			throw new IllegalStateException("Queue is epmty");
		
		while(s1.size() > 1)
			s2.push(s1.pop());			
		
		int result = s1.pop();
		
		while(s2.size() >0)
			s1.push(s2.pop());	
			
		return result;		
	}
	
	/**
	 * 
	 * @return vraca vrijednost stacka1 
	 */
	public int getSize(){
		return s1.size();
	}
	
	
}