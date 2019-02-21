/*
 * Take two integer arrays of 10 indices each and initialize them. 
 * Then copy the contents of both of the arrays in a third array, 
 * one consecutive index from one array at a time. 
E.g. if the array1 has 1 2 3 4 5 6 7 8 9 10 stored and array2 
has 11 12 13 14 15 16 17 18 19 20 stored then array three will 
have 1 11 2 12 3 13 4 14 5 15 6 16 7 17 8 18 9 	19 10 20 stored. 
*/
package example;
public class ArrayExample {

	public static void main(String[] args) {
		/*int a1[]=new int[11];
		for(int i=1;i<a1.length;i++) {
			a1[i]=i;
		}
		int a2[]=new int[11];
		for(int j=1;j<a2.length;j++) {
			a2[j]=j+10;
		}
		int a3[]=new int[20];
		int j=0,k=0;
		for(int i=1;i<a1.length;i++) {
			for(j=1;j<a2.length;j++) {
				a3[k]=a1[i];
				a3[k+1]=a2[j];
       			k++;	
			}
		}*/
		/*int arr1[]= {1,2,3,4,5,6,7,8,9,10};
		int arr2[]= {11,12,13,14,15,16,17,18,19,20};*/
		
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		
		int j=0,k=0;
		for(int i=1;i<=arr1.length;i++) {
			arr1[j]=i;
			j++;
		}
		for(int i=11;i<=20;i++) {
			arr2[k]=i;
			k++;
		}
		int arr3[]=new int[20];
		int index3=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[index3++]=arr1[i];
			arr3[index3++]=arr2[i];
			
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]+" ");
		}
	}   

}
