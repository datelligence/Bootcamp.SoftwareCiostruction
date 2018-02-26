/*
 *  Taller 2 : fracciones
 *  @authos = "Jorge Eduardo Ardila";
 *  @comentarios = "Tuve dificultad para compilarlo con dependencias,  aun sigo escribiendo codigo en Vim,  y no he 
 *  encontrado como compilar con dependencias.";
 *
 * */

package utlidadesFracciones; 

public class Fraccion {

    // datos
    private int numerador;
    private int denominador;

    // constructor 
    private Fraccion (int a, int b) {
        if(b == 0)  {
            // MensajeError("El denominador no puede ser 0!");
            throw new AssertionError("El Denominador no puede ser = 0!");
        }
        else {
            this.numerador = a;
            this.denominador = b;
        }
    }

    Fraccion () {
        throw new AssertionError("Se requiere Numerador y Denominador");
    }

    Fraccion (int a) {
        throw new AssertionError("Hace falta un segundo digito: Denominador");
    }

    // metodos.

    public void MensajeError(String mensaje) {
        throw new AssertionError(mensaje);
    }

    // calculo Maximo Comun Divisor.
    public static int MCD(int a, int b) {
        return b == 0 ? a : MCD(b, a % b);
    }

    // calculo Minimo Comun Multiplo.
    public static int MCM(int a, int b) {
        return (a * b) / MCD(a, b);
    }

    public Fraccion SimplificarFraccion () {
        int mcd = MCD(this.numerador, this.denominador);
        return new Fraccion(this.numerador / mcd, this.denominador / mcd);
    }

    public Fraccion SumarDosFracciones(Fraccion SegundaFraccion) {
        int mcm = MCM(this.denominador, SegundaFraccion.denominador);
        int a = (SegundaFraccion.denominador / mcm) * this.numerador;
        int b = (this.denominador / mcm) * SegundaFraccion.numerador;

        return new Fraccion(a+b, mcm);
    }

    public Fraccion Inversa(Fraccion fraccion) {
        return new Fraccion(-fraccion.numerador, fraccion.denominador);
    }
    
    public Fraccion RestarDosFracciones(Fraccion SegundaFraccion) {
        return SumarDosFracciones(Inversa(SegundaFraccion));
    }

    public Fraccion ProductoDosFracciones(Fraccion SegundaFraccion) {
       int nuevoNumerador = this.numerador * SegundaFraccion.numerador; 
       int nuevoDenominador = this.denominador * SegundaFraccion.denominador;
       return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
   
    public Fraccion Opuesto(Fraccion fraccion) {
        return new Fraccion (fraccion.denominador, fraccion.numerador);
    }

    public Fraccion DividirDosFracciones(Fraccion SegundaFraccion) {
        return ProductoDosFracciones(Opuesto(SegundaFraccion)); 
    }

}
