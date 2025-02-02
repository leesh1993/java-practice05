package prob5;

public class MyStack {

	private int top = -1;
	private String[] buffer;
	
	public MyStack(int size) {
		this.buffer = new String[size];
	}

	public void push(String data) {
		if (top >= buffer.length-1) {
			String[] temp = new String[buffer.length*2];		
			for(int i = 0; i < buffer.length; i++) {
				temp[i] = buffer[i];
			}
			buffer = temp;	
		}  
			buffer[++top] = data;
	}

	public String pop() throws Exception {
		if(isEmpty()) {
			throw new MyStackException("Stack Empty");
		}
		else {
			return buffer[top--];
		}
		
	}

	public boolean isEmpty() {
		return (top == -1);

	}
}