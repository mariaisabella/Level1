/*John, bib number 1000, is running in San Diego at 6:00 am.  
Maria, bib number 1001, is running in San Diego at 6:00 am. 
Esme, bib number 1002, is running in San Diego at 6:00 am. 

Then add a static method that sets the city:

    public static void setCity(String newCity) {
        //write your code here
    }
    
    	public static void main(String[] args) {
		Runner John = new Runner("John", 20);
		John.describeRunner();
		}
 */

public class RunnerTest {
	public static void main(String[] args) {
		Runner John = new Runner("John", 20);
		System.out.println(John);

		Runner Maria = new Runner("Maria", 20);
		System.out.println(Maria);

		Runner Esme = new Runner("Esme", 20);
		System.out.println(Esme);

		Runner.setCity("Miami");
		System.out.println(John);
		System.out.println(Maria);
		System.out.println(Esme);
	}

}
