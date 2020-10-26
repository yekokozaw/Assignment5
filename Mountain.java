package mycat;

public class Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mountain obj=new Mountain();
		obj.converter(5);
		
	}
	public void converter(int x) {
		
		int k=0;
		int number=1;
		for(int i=1;i<=x;i++, k=0,number=1) {
			for(int count=1;count<=x-i;++count) {
				System.out.print(" ");
			}
			while(k != 2 * i - 1) {
                System.out.print(number);
                k++;
                number++;
            }
			System.out.println();
	
		}
	}
}
