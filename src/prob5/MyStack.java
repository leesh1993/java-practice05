package prob5;

public class MyStack {

	private int top = -1;
	private String[] buffer;
	
	public MyStack(int size) {
		this.buffer = new String[size];
	}

	public void push(String data) {
		if (top >= buffer.length -1) {
			System.out.println("Stack Overflow");
			String[] temp = new String[buffer.length*2];
			
			for(int i = 0; i < buffer.length; i++) {
				temp[i] = buffer[i];
			}
			buffer = temp;	
			top++;
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