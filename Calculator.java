class Calculator {

    public static void main(String[] args) {

        double a = 0.0;
        double b = 0.0;
        
        // TODO : Get args a, b
        // a = Double.parseDouble(args[0]);
        // b = Double.parseDouble(args[1])

        System.out.println("Numero 1: " + a);
        System.out.println("Numero 2: " + b);
        System.out.println("Division: " + Math.div(a, b));
        System.out.println("Suma: " + Math.sum(a, b));
        System.out.println("Multiplicacion: " + Math.mult(a, b));
        System.out.println("Modulo: " + Math.mod(a, b));
        System.out.println("Resta: " + Math.subs(a, b));

    }

}
