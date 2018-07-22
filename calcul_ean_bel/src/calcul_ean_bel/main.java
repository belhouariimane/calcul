package calcul_ean_bel;

public class main {
	 public static int calcul_cle(String code) {
		 	int sum_pair=0;
			int sum_impair=0;
		    int reste=0;
		 for(int i=0;i<code.length();i++){
		   char c=code.charAt(i);
		   int a = Integer.parseInt(String.valueOf(c));  
		 	if(i%2 == 0){
		 		sum_pair+=a*3;
		 	}
		 	else{
		 		sum_impair+=a;
		 	}
		 }
		 reste=(sum_impair+sum_pair)/10;
		 if(reste==0){
		 	return 0;
		 }else{
		 	return 10-reste;
		 }
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String code_cle="303792016200";
	     int cle=calcul_cle(code_cle);
	     System.out.println("la cle est : " );
	     System.out.println(cle); 
	}

}
