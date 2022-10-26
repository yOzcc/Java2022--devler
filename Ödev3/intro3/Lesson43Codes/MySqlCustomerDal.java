package intro3.Lesson43Codes;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("MySql added.");
		
	}
	
}
