public class bSort{
	public static void main(String[] args){
		int[] numbers={45,23,1,36,38,4,23,12};
		int len=numbers.length;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-i-1;j++){
				if(numbers[j]>numbers[j+1]){
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		for(int number: numbers){
			System.out.println(number);
		}

	}
}