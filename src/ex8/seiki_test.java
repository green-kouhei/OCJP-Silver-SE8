package ex8;

public class seiki_test {

	public static void main(String[] args) {
		int count = 0;
		String str = "a. b. c. d. e";
		String[] array = str.split(".");
		System.out.println(str+array.length);
		for(String s : array){
			System.out.print(s);
			count++;
		}
		System.out.print(count);

	}

}
