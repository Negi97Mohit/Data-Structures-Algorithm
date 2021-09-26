public class selectionSort{
	public static void main(String[] args){
		int [] a={45,23,1,36,38,4,23,12};
		int len=a.length;
		for(int i=0;i<len-1;i++){
			int min_index=i;
			for(int j=i+1;j<len;j++)
				if(a[j]<a[min_index])
					min_index=j;
			int temp=a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
		}
		for(int k=0;k<len;k++)
			System.out.println(a[k]);
	}
}