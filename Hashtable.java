/*
System.out.println("Dame velocidad: ");
Scanner lector = new Scanner(System.in);
double velocidad = lector.nextDouble();
*/
public class Hashtable<E> {
public static final int M =23; //Tamaño del listado
List<E>[] data = new List[M]; //Arreglo de Listas
public Hashtable() {
}
