package prob5;

public class MyStack {

	private int top = -1;
	private String[] buffer;
	
	public MyStack(int size) {
		this.buffer = new String[size];
	}

	public void push(String data) {
		if (top >= buffer.length) {
			System.out.println("Stack Overflow");
		} else {
			buffer[++top] = data;
		}



	}

	public String pop() {
		if(isEmpty()) {
			return "stack empty \n";
		}
		else {
			return buffer[top--];
		}
		
	}

	public boolean isEmpty() {
		return (top == -1);

	}
}