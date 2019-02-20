import java.util.Scanner;
class KonverterSuhu{
		Scanner input = new Scanner(System.in);
		public static void main(String[] args){
				KonverterSuhu ks = new KonverterSuhu();
				ks.runThis();
		}
		void runThis(){
				System.out.print("Masukkan suhu dalam Celcius:");
				float celcius = input.nextFloat();
				Temperatur t = new Temperatur(celcius);
				System.out.println("Suhu dalam Celcius		:"+celcius);
				System.out.println("Suhu dalam Fahrenheit 	:"+t.getFahrenheit());
				System.out.println("Suhu dalam Kelvin		:"+.getKelvin());
				System.out.println("Suhu dalam Reamur		:"+t.getReamur());
				System.out.println("Suhu dalam Reamur		:"+t.getReamur());
		}
		