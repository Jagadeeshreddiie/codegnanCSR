public class PersonFactory {
	public static PublicService getInstance(){
		PublicService publicService=new PersonDbService();
		return publicService;
	}
}