import java.util.*;

public class twoSummer{
	public static void main(String[] args){
		long startTime=System.nanoTime();
		int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13};
		int target=9;
		int arr= twoSum(a,target);
		System.out.println("Total Pairs: "+ arr);
		long endTime=System.nanoTime();
		long elapsed=endTime-startTime;
		System.out.println("Total Time (nanoSec): "+elapsed);
	}	
	public static int twoSum(int[] nums,int ser){
		int[] arr=new int[2];
		int counter=0;
		Hashtable<Integer, Integer> num=new Hashtable<Integer, Integer>();
		for(int i=0;i<nums.length;i++){
			Integer n=num.get(nums[i]);
			if(n==null)
				num.put(nums[i],i);
			n=num.get(ser-nums[i]);
			if(n!=null)
				counter+=1;
			}
			return counter;
		}
	}
