/**
 * 
 */
package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 108304
 *
 */
public class Maps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> findPersonByPesel= new HashMap<String,String>();
		findPersonByPesel.put("12345678901", "John Doe");
		findPersonByPesel.put("12345678902", "Jane Doe");
		findPersonByPesel.put("12345678903", "Another Person");
		System.out.println(findPersonByPesel.get("12345678902"));
	}

}
