public class ColorFactory extends AbstractFactory {
	public Color getColor(String colorName){
		if(colorName.equalsIgnoreCase("BLUE")){
			return new Blue();
		}else if(colorName.equalsIgnoreCase("GREEN")){
			return new Green();
		}else{
			return new Red();
		}
	}
	
	public Shape getShape(String shapeName){
		return null;
	}
}