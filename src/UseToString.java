class MyFrog {
	
	private String name;
	private int id;
	
	public MyFrog(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		
		/*  return String.format("%4d: %s", id, name); */
		StringBuilder sb = new StringBuilder("");
		sb.append(id).append(": ").append(name);
		return sb.toString();
	}
}
public class UseToString {

	public static void main(String[] args) {
		MyFrog frog1 = new MyFrog(7, "Yure");
		
		System.out.println(frog1);

	}

}
