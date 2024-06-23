import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MainProductBean {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ProductBean S1=new ProductBean("123","Su",1000);
		ProductBean S2=new ProductBean("124","Bu",2000);
		ProductBean S3=new ProductBean("125","Soe",3000);
		ProductBean S4=new ProductBean("126","Thu",4000);
		ProductBean S5=new ProductBean("127","Ni",5000);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Key :\t");
		String key=s.next();
		Map <String,ProductBean> map = new HashMap<String,ProductBean>();
		map.put(S1.getPdCode(),S1);
		map.put(S2.getPdCode(),S2);
		map.put(S3.getPdCode(),S3);
		map.put(S4.getPdCode(),S4);
		map.put(S5.getPdCode(),S5);
		if (map.containsKey(key)) {
		for (Map.Entry m:map.entrySet()){
			if (key.equals(m.getKey())) {
				System.out.println("PdCode :"+((ProductBean) m.getValue()).getPdCode());
				System.out.println("PdName :"+((ProductBean) m.getValue()).getPdName());
				System.out.println("PdPrice :"+((ProductBean) m.getValue()).getPdPrice());
				}	
		}
	}
		else {System.out.println("No Data");}
	}
}
