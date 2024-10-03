package fr.istic.prg1.tp07;

public class Exe1 {


	static boolean aLaLigne = true;

	public static int plusUn(int nbre){
		return nbre+1;
	}

	public static void affichePlusUn(int nbre, boolean aLaLigne){
		System.out.print(plusUn(nbre));
		if(aLaLigne){
			System.out.println("");
		}
	}

	public static void afficheNbreEtPlusUn(int nbre){
		System.out.println("La valeur du nombre est " + nbre +
		 ", la valeur du nombre suivant est " + plusUn(nbre));
		 System.out.println("");
	}

	public static void afficheNbreEtPlusUnIntervalle(int valMin, int valMax){
		for(int i=0; i<= valMax; i++){
			afficheNbreEtPlusUn(i);
		}
	}

	public static void main(String[] args) {
		int nbre = 8;
		int valMin = -2;
		int valMax = 5;

		affichePlusUn(nbre, aLaLigne);
		afficheNbreEtPlusUn(nbre);
		afficheNbreEtPlusUnIntervalle(valMin, valMax);
	}

}
