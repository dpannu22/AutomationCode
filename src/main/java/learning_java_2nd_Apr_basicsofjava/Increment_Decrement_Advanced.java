package learning_java_2nd_Apr_basicsofjava;

public class Increment_Decrement_Advanced {

	public static void main(String[] args) {
		int i=1; //latest value is 1
		
		i = i++ + i--;
		
		// i = 1 + 2 = 3
		// 
		
		System.out.println(i);
		
		int j=1; //latest value of j is 1
		j++; //latest value of j is 2
		int k = ++j - j--; //latest value of k is 3 - 3 = 0
		//latest value of j becomes 2
		
		System.out.println("latest value of k is " + k); //0
		System.out.println("latest value of j is " + j);
		
		int l = ++j + j++ - --k + k--;
		// l = 3 + 3 - (-1) + (-1) = 6
		// j = 3, 4 = 4
		// k = -1,           -2 = -2
		
		System.out.println(j); //4
		System.out.println(k); //-2
		System.out.println(l); //6
		
		
	
		
	}

}
