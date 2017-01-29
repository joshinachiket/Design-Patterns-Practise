public class SingletonClass {
	
	private static SingletonClass sampleObject = new SingletonClass();
	
	private SingletonClass(){}
	
	public static SingletonClass getObject(){
		return sampleObject;
	}
	
	public void printMessage(){
		System.out.println("Printing message from singleton class");
	}
}