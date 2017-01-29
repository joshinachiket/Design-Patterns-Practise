public class ShapeFactory extends AbstractFactory {
	public Color getColor(String colorName) {
		return null;
	}
	
	public Shape getShape(String shapeName) {
		if(shapeName.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shapeName.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else{
			return new Square();
		}
	}
}