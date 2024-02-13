public class PersonApp{
	public static void main(String args[]){
		Person person=new Person(111,"jagadeesh","Jagadeesh@gmail.com");

		// PublicService personService=new PersonFileService();

		PublicService publicService=PersonFactory.getInstance();

		publicService.savePerson(person);

		System.out.println("End of the program");
	}
}