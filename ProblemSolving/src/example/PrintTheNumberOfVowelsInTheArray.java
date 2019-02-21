/*Declare and take input from the user in character array, 
 * and you have to print total number of vowels in that 
 * array (e.g. d t i o o a r w h s h w q n x b , 
 * total number of vowels are 4 (as i o o a ) ). 
 */
package example;
class PrintTheNumberOfVowelsInTheArray {
	public static void main(String[] args) {
        char []arr= {'a','b','e','f','i','o','e','a','u','t','e','j'};
        for(char i=0;i<arr.length;i++) {
        	if(arr[i]=='a'||arr[i]=='o'||arr[i]=='e'||arr[i]=='i'||arr[i]=='u') {
        		System.out.println(arr[i]);
        	}
        }
	}
}
