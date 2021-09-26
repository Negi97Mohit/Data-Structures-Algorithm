import java.util.Scanner;	

public class binarySearch{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int[] b=arrRecieve();
		System.out.println("Enter the number to be found");
		int ser=sc.nextInt();
		int pos=bSearch(ser,b);
		System.out.println(pos);
	}
	public static int[] arrRecieve(){
		int length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		length=sc.nextInt();
		int[]  a=new int[length];
		for(int i=0;i<length;i++){
			System.out.format("Enter the %d element\n",i);
			a[i]=sc.nextInt();
		}
		for(int j=0;j<length;j++){
			System.out.format("The %d element of the array is %d\n",j,a[j]);
			
		}
		return a;
	}

	public static int bSearch(int ser,int[] arr){
		int len=arr.length;
		int low=0;
		int high=len-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(ser<arr[mid])
				high=mid-1;
			else if(ser>arr[mid])
				low=mid+1;
			else
				return mid;
		}
		return -1;

	}

}