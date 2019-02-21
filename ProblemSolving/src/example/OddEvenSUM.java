package example;

public class OddEvenSUM {

	public static void main(String[] args) {
		int even=0,odd=1;
		for(int i=1;i<20;i++) {
			odd=odd*i;
			i++;
		}
		System.out.println(odd);
        for(int i=2;i<=100;i++) {
        	even=even+i;
        	i++;
        }
        System.out.println(even);
 	}

}
