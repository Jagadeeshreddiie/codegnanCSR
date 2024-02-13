public class PersonDbService implements PublicService{
	public Person findPerson(int id){
		System.out.println("Finding a person from DataBase with id "+id);
		Person person = new Person(id, " Kishore","Kishore@gmail.com");
		return person;
	}
	public boolean savePerson(Person person){
		System.out.println("Saving a person into a Database is "+person);
		return true;
	}
}