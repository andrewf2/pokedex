import seed.GetPokeData;


public class test {
	public static void main(String[] args){
		try {
			GetPokeData request = new GetPokeData();
			Thread t1 = new Thread(request);
			t1.start();
			
		}catch(Exception e){
			
		}
	}
}
