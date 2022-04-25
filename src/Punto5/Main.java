package Punto5;

public class Main {
    public static void main(String[] args) {

        FunctionaInterface.InterfacePi pi = () -> 3.1416;
        System.out.println(pi.getPiValue());

    }

}