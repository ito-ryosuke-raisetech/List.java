package List;

import java.util.ArrayList;


;
public class List {

	public static void main(String[] args) {
		//listの活用(要素の数）
	ArrayList<String> list = new ArrayList<>();
	
	System.out.println(list.size());  // 0
	list.add("まぐろ");   //0
	list.add("かつお");  //1
    list.add("サーモン");   //2
    
    System.out.println(list.size()); // 3
    
    //listの活用（get)
    System.out.println(list.get(0));  // "まぐろ"
    System.out.println(list.get(2));  // "サーモン"
	
    
    
	}

}
