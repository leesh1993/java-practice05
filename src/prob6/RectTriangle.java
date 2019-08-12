package prob6;

public class RectTriangle extends Shape implements Resizable{

	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		this.width  = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return (width * height) * 0.5;
	}

	@Override
	protected double getPerimeter() {		
		return width + height + Math.sqrt((Math.pow(width, 2)) * (Math.pow(height, 2)));
	}

	@Override
	public void resize(double d) {
		width = width * d;
		height = height * d;
	}

}
