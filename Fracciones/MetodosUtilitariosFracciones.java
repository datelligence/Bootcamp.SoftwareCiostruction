package utilidadesFracciones;


public class MetodosUtilitariosFracciones {

    // calculo Maximo Comun Divisor.
    public static int MCD(int a, int b) {
        return b == 0 ? a : MCD(b, a % b);
    }

    // calculo Minimo Comun Multiplo.
    public static int MCM(int a, int b) {
        return (a * b) / MCD(a, b);
    }


}

