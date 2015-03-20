import java.util.ArrayList;
import java.util.HashMap;

import seed.GetPokeData;


public class test {
	public static void main(String[] args){
		HashMap pokeDex = new HashMap();
		
		try {
			GetPokeData request = new GetPokeData();
			Thread t1 = new Thread(request);
			t1.start();
			t1.join();
			ArrayList list = (ArrayList) request.getMap().get("objects");
			HashMap list2 = (HashMap)list.get(0);
			ArrayList pokedex = (ArrayList) list2.get("pokemon");
			for(Object pokemon:pokedex){
				System.out.println(pokemon);
				
			}
		
			
			
			
			
		}catch(Exception e){
			
		}
	}
}
