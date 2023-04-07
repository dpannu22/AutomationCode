package learning_java_2nd_Apr_basicsofjava;

public class Assignment_Inc_Dec {

	public static void main(String[] args) {
		int i=1; 
		--i; 
		//i=0
		int j = --i - i-- - ++i; //j=-3, i=-1 
		  //j = -1 - (-1) -(-1) // j = 1, i = -1
		  //i = -1,    -2 - (-1) = -1
		System.out.println(i);
		System.out.println(j);
		
		int k = j-- - --i + ++j - ++j + i--;// k=-1, 
		  //k = 
		int l = i-- - ++j - --j +k--;
		
		
		
		System.out.println(i); //-4
		System.out.println(j); //2
		System.out.println(k); //-1
		System.out.println(l); //-8
		
	}

}
