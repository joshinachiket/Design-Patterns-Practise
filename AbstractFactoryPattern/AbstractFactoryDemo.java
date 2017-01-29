public class AbstractFactoryDemo {
	public static void main(String args[]){
		AbstractFactory ShapeFactory = FactoryGenerator.getFactory("shape");
		
		Shape circle = ShapeFactory.getShape("circle");
		circle.draw();
		
		Shape rectangle = ShapeFactory.getShape("rectangle");
		rectangle.draw();
		
		Shape square = ShapeFactory.getShape("square");
		square.draw();
		
		AbstractFactory ColorFactory = FactoryGenerator.getFactory("color");
		
		Color red = ColorFactory.getColor("red");
		red.fill();
		
		Color blue = ColorFactory.getColor("blue");
		blue.fill();
		
		Color green = ColorFactory.getColor("green");
		green.fill();
		
	}
}