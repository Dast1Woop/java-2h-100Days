package notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Notebook {
	
	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String content) {
		notes.add(content);
	}
	
	public void add(String content,int index) {
		notes.add(index, content);
	}
	
	public void delete(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] strings = new String[notes.size()];
		notes.toArray(strings);
		return strings;
	}
	
	public String noteAt(int index) {
		return notes.get(index);
	}
	
	public int noteCount() {
		return notes.size();//⚠️，不是length或count，而是 size
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi");
		
//		Notebook notebook = new Notebook();
//		notebook.add("note1");
//		notebook.add("note2");
//		notebook.add("note3");
////		notebook.add("4",1);
//		
//		System.out.println(notebook.noteCount());
//		System.out.println(notebook.list());
//		
//		notebook.delete(1);
//		System.out.println(notebook.list());
//		
//		int[] a = new int[10];
//		System.out.println(a[0]);
//		
//		String[] strings = new String[10];
//		System.out.println(strings[0]);
//		System.out.println(strings[0].length());
		
//		//for each
//		for (int i : a) {
//			System.out.println(i);
//		}
//		
//		ArrayList<String> strings2 = new ArrayList<>();
//		strings2.add("a");
//		strings2.add("b");
//		strings2.add("a");
//		System.out.println(strings2);
//		
//		HashSet<String> set = new HashSet<>();
//		set.add("a");
//		set.add("b");
//		set.add("a");
//		System.out.println(set);
		
		//hashMap:字典
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(1, "one");
		
		System.out.println(map.keySet());

		System.out.println("map内键值对数量：" + map.size());
//		System.out.println("map内键值对数量：" + map.keySet().size());
		for (Integer keyInteger : map.keySet()) {
			String string = map.get(keyInteger);
			System.out.println(string);
		}
		
		System.out.println("----------");
		System.out.println(map.containsKey(2));	
		System.out.println(map.containsKey(6));
		
	}

}


