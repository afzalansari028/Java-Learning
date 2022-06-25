package ArrayIntro;

public class negativeRightside
{
	public static void main(String args[])
	{
		int num[] = {1,-2,3,4,-3,4,-6,8};
		int temp[] = new int[num.length];
		int i = 0;
		int j = num.length-1;
		for(int k=0;k<num.length;k++) {
			if(num[k] > 0)
			{
				temp[i] = num[k];
				i++;
			}
			else {
				temp[j] = num[k];
				j--;
			}
		}
		for(i=0;i<num.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
