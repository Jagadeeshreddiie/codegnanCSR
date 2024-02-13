public class SingleInstance {
	private SingleInstance(){
	}
	static SingleInstance si=null;
	public static SingleInstance getInstance(){
		
		if(si==null){
			si=new SingleInstance();
		}
		return si;
	}
}