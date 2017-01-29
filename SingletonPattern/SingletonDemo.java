public class SingletonDemo {
	
	public static void main(String args[]) {
		
		SingletonClass object = SingletonClass.getObject();
		object.printMessage();
	}
}