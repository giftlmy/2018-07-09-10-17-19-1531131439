package practice03;

public class Worker extends Person {

	/**
	 * @param name
	 * @param age
	 */
	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see practice03.Person#introduce()
	 */
	@Override
	public String introduce() {
		// TODO Auto-generated method stub
		return "I am a Worker. I have a job.";
	}
	
	
}
