import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		Emp e=new Emp();
		Emp e1=new Emp();
		
		System.out.println(e.hashCode());
	
		System.out.println();
		Map<String,Object> map =new HashMap<String,Object>();
		
		map.put("key1", "this is key1");
		System.out.println(map.get("key1"));
		System.out.println("这是我第一次用Git");
		System.out.println("这是我第二次用Git");
		System.out.println("我QQ");
		
	}

}
