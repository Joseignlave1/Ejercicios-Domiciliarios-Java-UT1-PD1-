public class Alumno {
    private String nombre;
    public Alumno () {
        nombre = "pepe";
    }
    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }
    public static int recorrer (String cadena) {
        int res = 0;
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        System.out.println(cadena.length());
        System.out.println(res);
        return res;
    }
    public static int getValor() {
        int[] vector = { 6, 16, 26,36,46,56,66,76 };
        int idx = 7;
        System.out.println(vector[idx]);
        return vector[idx];
    }
    public static char getPrimerCaracter(String palabra) {
        String[] string = new String[5];
        string[1] = palabra;
        return (string[1].charAt(0));
    }
    public static String paraAString(int a) {
        return String.valueOf(a);
    }


    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
        getValor();
    }
}

/*
    a) El error en la clase alumno era qué en el método getNombreAdmiracion(), le estabamos concatenando un objeto de tipo String, pero
    el String alumno se definía en el constructor con el valor de null, por lo qué no podemos concatenar un objeto de tipo String a un objeto de tipo null.

    b) El problema es qué la condición era que i <= cadena.length(), la condición correta es i < cadena.length(), ya qué cuándo i sea igual tiene
      que salir del for,  si la condición es i <= cadena.length(), imaginemos qué tenemos un String con longitud 15, entonces
      llegamos a la iteracción de que i = 15; por ende i == cadena.length(); y va a aumentar, (i++) por ende i = 16; estaríamos entrando en un
      rango inexistente en el String.

    c)En el método getValor() el array de enteros llamado "vector" está mal definido, ya qué los [] deben ir antes del nombre del Array y no después.
      También estábamos intentando acceder a la posición 8 del Array, la cuál era inexistente.


    d)Hay varios problemas en el método, el primero es qué se crea el Array de Strings de manera incorrecta, debe ser con [] antes del nombre de la variable,
      el segundo es qué se está intentando acceder a un índice específico del array de Strings antes de haberle asignado ningún valor a sus elementos
      y por último, al almacenar el String palabra en la primera posición del Array de Strings, si queremos acceder al primer elemento es charAt(0), ya qué estpa
      en el índice 0

    e)Hay varios errores en el método paraAString primero qué al a ya ser un entero, no necesitamos crear un nuevo objeto de tipo Integer que contenga a,
    segundo si lo que queremos es convertir a en un objeto de tipo String, podemos utilizar el método valueOf, qué lo que hace es convertir tipos primitivos
    a su representación en String.


 */
