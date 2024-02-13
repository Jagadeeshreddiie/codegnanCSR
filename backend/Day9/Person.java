public class Person{
	int id;
	String name;
	String email;
	public Person(){
	id=0;
	name="";
	email="";
	}

	public Person(int n,String name, String email){
	this.id=n;
	this.name=name;
	this.email=email;
	}

	public String toString(){
	String str="";
	str=id+" "+name+" "+email;
	System.out.println(str);
	return str;
	}
}