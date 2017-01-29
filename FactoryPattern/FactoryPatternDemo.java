import java.util.*;

public class FactoryPatternDemo {
	
	private static Scanner in;

	public static void main(String args[]) {
		in = new Scanner(System.in);
		ShapeFactory shapeFactory = new ShapeFactory();
		System.out.println("Enter name of shape to get element");
		
		String shapeName = in.next();
		Shape myShape = shapeFactory.getShape(shapeName);
		myShape.draw();
		
		/*if(shapeName.equalsIgnoreCase("CIRCLE")){
			Shape circle = new Circle();
			//Shape circle = shapeFactory.getShape(shapeName);
			circle.draw();
		}else if(shapeName.equalsIgnoreCase("SQUARE")){
			Shape square = shapeFactory.getShape(shapeName);
			square.draw();
		}else if(shapeName.equalsIgnoreCase("RECTANGLE")){
			Shape rectangle = shapeFactory.getShape(shapeName);
			rectangle.draw();
		}else{
			System.out.println("FALSE!");
		}*/
	}
}