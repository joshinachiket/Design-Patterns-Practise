public class FactoryGenerator {
	public static AbstractFactory getFactory(String factoryName){
		if(factoryName.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}else if(factoryName.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}else{
			return null;
		}
	}
}