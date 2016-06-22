package paczka;

public class Tablice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1=new int[]{1, 2, 3};
		int[] tab2=new int[]{1, 2, 3};
	
		int sumOfTwoTabl=sumTabl(tab1)+sumTabl(tab2);
		System.out.print("Suma tablic to: "+sumOfTwoTabl);
	}
	
	static int sumTabl(int[] table){
		int sumTab=0;
		for(int i=0; i<table.length; ++i){
			sumTab+=table[i];
		}
		return sumTab;
	}

}
