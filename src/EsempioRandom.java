import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EsempioRandom
{
	public static void main(String[] args)
	{
		double random = Math.random();
		//genera un numero double compreso tra 0 e 1(escluso)
		random = random * 97 + 22;

//		int rand = (int)  (random * 97 + 22);
//		System.out.println(random);

		List<String> vocali = new ArrayList<String>();
		vocali.add("A");
		vocali.add("E");
		vocali.add("I");
		vocali.add("O");
		vocali.add("U");
		vocali.add("Y");


		random = Math.random();
		int indice = (int)(random*5);
		System.out.println(vocali.get(indice));
		//0 1 2 3 4
		 //[0,1) intervallo da 0 a 1, 0 incluso, 1 escluso
		//obiettivo [0,4] di soli numeri interi
		//[0,5) numeri decimali
		//discretizzarlo [0,4]
		//0,4.9999999
		//0,1,2,3,4 con una distribuzione baiesiana, tutti con la stessa probabilità di uscire

		//prendo un ruolo casuale
		Random rand = new Random();
		GuardRole[] tuttiRuoli = GuardRole.values(); //[COOK,OFFICER,CHIEF,INFIRMARY]

		int indiceQualsiasi = rand.nextInt(0,tuttiRuoli.length);

		System.out.println(tuttiRuoli[indiceQualsiasi]);

		RisposteRandomiche[] risposte = RisposteRandomiche.values();
		System.out.println(risposte[rand.nextInt(0,risposte.length)]);
	}
}
