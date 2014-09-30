mport java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class moreKey {
	 
	public static void main(String[] args) {
		Map<Integer, List<String>> myhm= new HashMap<Integer,List<String>>();
		storeit(myhm,1,"a");
		storeit(myhm,2,"b");
		storeit(myhm,1,"d");
		storeit(myhm,3,"e");
		storeit(myhm,4,"f");
		storeit(myhm,1,"g");
		storeit(myhm,1,"h");
		storeit(myhm,5,"i");
		storeit(myhm,5,"j");
		Map<Integer, List<String>> res = storeit(myhm,6,"k");
		System.out.println(res.toString());
		System.out.println("map size : " + res.size());
	}
	public static Map<Integer, List<String>> storeit(Map<Integer, List<String>> myhm, Integer tt, String st){
		if(!myhm.containsKey(tt)){
			List<String> alt = new LinkedList<String>();
			alt.add(st);
			myhm.put(tt,alt);
		}else{
			List<String> alist = myhm.get(tt);
			alist.add(st);
			myhm.put(tt, alist);
		}
		return myhm;
	}
}
