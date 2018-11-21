public class Calculator {

    int A = 15;
    int B = 30;

    public void addAtoB() {
        int result = A + B;
        System.out.println( "Wynik dodawania wynosi " + result);
    }

    public void substractBfromA() {
        int result = B - A;
        System.out.println("Wynik odejmowania wynosi " + result);
    }

    public static void main (String [] args) {

        Calculator calculator = new Calculator();
        calculator.addAtoB();
        calculator.substractBfromA();
    }
}