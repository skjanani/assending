import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,j,n,temp;
    System.out.println("Sorting an elements");
    Scanner ja=new Scanner(System.in);
    n=ja.nextInt();
	int[]b=new int[n];
	for(i=0;i<n;i++){
		b[i]=ja.nextInt();
	}
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(b[i]>b[j]){
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				}
		}
	}
	System.out.println("Asending order");
	for(i=0;i<n;i++){
		System.out.println(b[i]);
		}
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(b[i]<b[j]){
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				}
		}
	}
	/*System.out.println("Desending order");
	for(i=0;i<n;i++){
		System.out.println(b[i]);
		
	}*/
	}
	

}
