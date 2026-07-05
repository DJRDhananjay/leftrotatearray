public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int n=arr.length;
		int result[]=new int[n];
		int k=2;
		k=k%n;
		for(int i=0;i<n;i++){
		    result[(i-k+n)%n]=arr[i];
		}
		for(int num:result){
		    System.out.print(num+" ");
		}
	    
	}
}
