import java.util.*;

/**
 * Se crea un programa para que los votantes, voten por una de tres opciones.
 * 
 * @author  Sandra Martin, Israel Severiche, Jose Alvarez
 * @version 20190818
 */

class votacion
{
	public static void main( String args[])
	{
		int voto = 0, tota = 0, totb = 0, totc = 0;
		int respuesta = 0, votos = 0;
				
		do
		{
			Scanner leer = new Scanner (System.in);
			System.out.println("Por quien desea votar:");
			System.out.println("Codigo\t"+"Nombre");
			System.out.println("1\t"+"Bisbal R.");
			System.out.println("2\t"+"Deital H.");
			System.out.println("3\t"+"Mancilla H.");
			
			System.out.println("Ingrese el codigo de candidato seguido de presionar la tecla enter");
			
			voto = leer.nextInt();
			votos = votos+1;
			
			switch (voto)
			{
				case 1:
				{
					tota = tota+1;
					break;
				}
				case 2:
				{
					totb = totb+1;
					break;
				}
				case 3:
				{
					totc = totc+1;
					break;
				}
				
			}
			
			System.out.println("¿Desea continuar con la votacion?");
			System.out.println("1 = Si\t 2 = No");
			respuesta = leer.nextInt();
		}while (respuesta != 2);
		
		System.out.println("Nombre\t\tTotal Votos\tPorcentaje");
		System.out.println("Bisbal R.\t"+tota+"\t\t"+((100/votos)*tota)+"%");
		System.out.println("Deital H.\t"+totb+"\t\t"+((100/votos)*totb)+"%");
		System.out.println("Mancilla H.\t"+totc+"\t\t"+((100/votos)*totc)+"%");
		
	}
}