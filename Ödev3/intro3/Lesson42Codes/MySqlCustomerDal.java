package intro3.Lesson42Codes;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("MySql added.");
		
	}
	
}
