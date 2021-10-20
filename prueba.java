package prueba;

public class prueba {
	public static void interce(int[] list,int[] list2) {
		int n,m;
		n=list.length;m=list2.length;
		int i=0,j=0;
		while(i<n && j<m) {
			if(list[i]==list2[j]) {
				System.out.print(list[i]+" ");
				i++;j++;
			}
			else if(list[i]<list2[j]) {
				i++;
			}
			else 
				j++;
							
		}
	}
	
	public static void main(String []args){
		
		int[] array= {2,4,8,16,32,64};
		int[] array2= {1,2,3,14,15,16,60,64,68};
		//int[] array= {2,3,5,9};
		//int[] array2= {1,2,3,7,8,9};
		 interce(array,array2);
	}

}
