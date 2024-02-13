public class SingleInstanceApp{
	public static void main(String []ars){
		SingleInstance a=SingleInstance.getInstance();
		SingleInstance b=SingleInstance.getInstance();
		if(a==b){
			System.out.println("Same objects");
		}
		else{
			System.out.println("Different Objects");
		}
	}
}