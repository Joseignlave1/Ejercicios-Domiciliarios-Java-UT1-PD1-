//Ejercicio 5 UT1_PD1
public class Contador {
    private final int max_Count;
    private int contador;
    private int incremento;

    public Contador() {
        this.max_Count = 50;
        this.contador = 1;
        this.incremento = 1;
    }

    public void mostrarContador() {
        for(int i = 0; i < max_Count; i++) {
            System.out.println(contador);
            contador += incremento;
            System.out.println("counter" + contador);
        }
    }


    public static void main (String[] args) {
        Contador contador1 = new Contador();
        contador1.mostrarContador();
    }

}

//Utilizando while
/*
    public void mostrarContador() {
            while(contador <= max_Count) {
                System.out.println(contador);
                contador += incremento;
                System.out.println( "counter" + contador);
            }
        }
 */

//Utilizando do-while

/*
        do {
            System.out.println(contador);
            contador += incremento;
            System.out.println("counter" + contador);
        } while(contador <= max_Count);
 */

//Utilizando for

/*
     public void mostrarContador() {
        for(int i = 0; i < max_Count; i++) {
            System.out.println(contador);
            contador += incremento;
            System.out.println("counter" + contador);
        }
    }
 */


