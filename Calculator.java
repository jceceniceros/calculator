class Calculator {

    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        char operator = args[1].charAt(0);
        double b = Double.parseDouble(args[2]);
        
        if (operator == '+') {
            System.out.println("Addition = " + Math.sum(a, b));
        }
        if (operator == '-') {
            System.out.println("Substraction = " + Math.subs(a, b));
        }
        if (operator == 'x') {
            System.out.println("Multiplication = " + Math.mult(a, b));
        }
        if (operator == 'd') {
            System.out.println("Division = " + Math.div(a, b));
        }
        if (operator == 'm') {
            System.out.println("Modulus = " + Math.mod(a, b));
        }

    }

}
