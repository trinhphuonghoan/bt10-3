package Finally;

public class ThrowAndThrows {

	public static void main(String[] args) {
		ThrowAndThrows tat = new ThrowAndThrows();
		try {
			tat.checkStatus();
			tat.connectDatabase();
		}catch (EducationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void connectDatabase() throws Exception{
		// Connect to database
		throw new Exception();
	}
	public void checkStatus() throws EducationException {
		// Check status
		throw new EducationException("Out of slot");
	}
}
