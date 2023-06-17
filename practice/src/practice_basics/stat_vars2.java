package practice_basics;

public class stat_vars2 {
	static int i=10;
	stat_vars2(){
		i++;
		System.out.println(i);
	}

	public static void main(String[] args) {
		new stat_vars2();
		new stat_vars2();
		new stat_vars2();
		new stat_vars2();

	}

}
