package TiposVariaveis;

public class OperadoresBooleanos {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);

        int c, d;
        c = 6;
        d = 6;

        String resultado2 = c == d ? "verdadeiro" : "falso";
        System.out.println(resultado2);
    }
}
