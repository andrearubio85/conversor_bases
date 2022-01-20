import javax.swing.JOptionPane;

public class bases_numericas {

    public static void main(String [] args){
        int op;
        do{

        int opc = Integer.parseInt(JOptionPane.showInputDialog("1. Binario a octal\n" +
                "2. Binario a decimal\n" +
                "3. Binario a hexadecimal\n" +
                "4. Octal a binario\n" +
                "5. Octal a decimal\n" +
                "6. Octal a hexadecimal\n" +
                "7. Decimal a binario\n" +
                "8. Decimal a octal\n" +
                "9. Decimal a hexadecimal\n" +
                "10. Hexadecimal a binario\n" +
                "11. Hexadecimal a octal\n" +
                "12. Hexadecimal a decimal\n" +
                "Seleccione: "));

        if (opc < 1 || opc > 12) {
            JOptionPane.showMessageDialog(null,"Elección no válida");
            return;
        }

        if(opc == 1){
            int bin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
                if (!validarBinario(bin)) {
                    JOptionPane.showMessageDialog(null,"Número no válido");
                    return;
                }
                int deci = binarioADecimal(bin);
                String octalResultante = decimalAOctal(deci);
                JOptionPane.showMessageDialog(null, "El octal es: "+ octalResultante);
        }
        if(opc == 2){
            int bin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if (!validarBinario(bin)) {
                JOptionPane.showMessageDialog(null,"Número no válido");
                return;
            }
            int deci = binarioADecimal(bin);
            deci = binarioADecimal(bin);
            JOptionPane.showMessageDialog(null,"El decimal es: "+deci);

        }
        if(opc == 3){
            int bin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            if(!validarBinario(bin)){
                JOptionPane.showMessageDialog(null, "Número no válido");
                return;
            }
            int deci = binarioADecimal(bin);
            String hexa = decimalAHexadecimal(deci);
            JOptionPane.showMessageDialog(null,"El hexadecimal es: " + hexa);

        }
        if(opc == 4){
            int oc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if (!validarOctal(oc)) {
                JOptionPane.showMessageDialog(null,"Número no válido");
                return;
            }
            int deci = octalADecimal(oc);
            String binarioRes = decimalABinario(deci);
            JOptionPane.showMessageDialog(null,"El binario es: " + binarioRes);
        }
        if(opc == 5){
            int oc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if (!validarOctal(oc)) {
                JOptionPane.showMessageDialog(null,"Número no válido");
                return;
                }
                int deci = octalADecimal(oc);
                JOptionPane.showMessageDialog(null,"El decimal es: " + oc);
        }
        if(opc == 6){
            int oc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if(!validarOctal(oc)){
                JOptionPane.showMessageDialog(null,"Número no válido");
                return;
            }
            int deci = octalADecimal(oc);
            String hexadecimalRes = decimalAHexadecimal(deci);
            JOptionPane.showMessageDialog(null,"El hexadecimal es: " + hexadecimalRes);
        }
        if(opc == 7){
            int deci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if(!validarDecimal(deci)){
                JOptionPane.showMessageDialog(null,"Número no válido");
                return;
            }
            String binarioRes = decimalABinario(deci);
            JOptionPane.showMessageDialog(null,"El binario es: " + binarioRes);

        }
        if(opc == 8){
            int deci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
             if(!validarDecimal(deci)){
                JOptionPane.showMessageDialog(null,"Número no válido");
                return;
            }
            String octalRes = decimalAOctal(deci);
            JOptionPane.showMessageDialog(null,"El octal es: " + octalRes);
        }

        if(opc == 9){
            int deci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if (!validarDecimal(deci)) {
                JOptionPane.showMessageDialog(null,"Número no válido");
                return;
                }
            String hexadecimalRes = decimalAHexadecimal(deci);
            System.out.println("El hexadecimal es: " + hexadecimalRes);

        }
        if(opc == 10){
            String hexa;
            hexa = JOptionPane.showInputDialog("Ingrese un número: ");
            if (!validarHexadecimal(hexa)) {
                JOptionPane.showMessageDialog(null,"Número no válido");
                    return;
                }
               int deci = hexadecimalADecimal(hexa);
               String binarioRes = decimalABinario(deci);
               JOptionPane.showMessageDialog(null, "El binario es: " + binarioRes);

        }
        if(opc == 11){
            String hexa;
            hexa = JOptionPane.showInputDialog("Ingrese un número: ");
            if (!validarHexadecimal(hexa)) {
            JOptionPane.showMessageDialog(null,"Número no válido");
            return;
            }
            int deci = hexadecimalADecimal(hexa);
            String octalRes = decimalAOctal(deci);
            JOptionPane.showMessageDialog(null,"El octal es: " + octalRes);

        }
        if(opc == 12){
            String hexa;
            hexa = JOptionPane.showInputDialog("Ingrese un número: ");
            if (!validarHexadecimal(hexa)) {
                JOptionPane.showMessageDialog(null,"Número no válido");
                return;
            }
            int deci = hexadecimalADecimal(hexa);
            JOptionPane.showMessageDialog(null,"El decimal es: " + deci);
        }
        op=Integer.parseInt(JOptionPane.showInputDialog("\n1.-Regresar al menu principal \n2.-Salir"));

    }while(op==1);

}

     public static boolean validarDecimal(int deci) {
        // Decimal pasa la validación con el hecho de que sea entero
        return true;
    }

     public static boolean validarBinario(int bin) {
        // Comprobar si solo se compone de unos y ceros
        String binarioComoCadena = String.valueOf(bin);
        for (int i = 0; i < binarioComoCadena.length(); i++) {
            char caracter = binarioComoCadena.charAt(i);
            if (caracter != '0' && caracter != '1') {
                return false;
            }
        }
        return true;
    }

    public static boolean validarOctal(int oc) {
        // comprobar si solo tiene números del 0 al 7
        String octalComoCadena = String.valueOf(oc);
        String caracteresOctales = "01234567";
        for (int i = 0; i < octalComoCadena.length(); i++) {
            char caracter = octalComoCadena.charAt(i);
            // Si no se encuentra dentro de los caracteres válidos, regresamos false
            if (caracteresOctales.indexOf(caracter) == -1) {
                return false;
            }
        }
        return true;
    }

    // Nota: se debe enviar la cadena hexadecimal convertida a mayúsculas
    public static boolean validarHexadecimal(String hexa) {
        // Comprobar si solo tiene números del 0 al 9 y letras de la A a la F
        String caracteresHexadecimales = "0123456789ABCDEF";
        for (int i = 0; i < hexa.length(); i++) {
            char caracter = hexa.charAt(i);
            // Si no se encuentra dentro de los caracteres válidos, regresamos false
            if (caracteresHexadecimales.indexOf(caracter) == -1) {
                return false;
            }
        }
        return true;
    }

    //De Decimal a otras bases
    public static String decimalABinario(int deci) {
        String bin = "";
        while (deci > 0) {
            bin = deci % 2 + bin;
            deci = deci / 2;
        }
        return bin;
    }

    public static String decimalAOctal(int deci) {
        int residuo;
        String oc = "";
        char[] caracteresOctales = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while (deci > 0) {
            residuo = deci % 8;
            char caracter = caracteresOctales[residuo];
            oc = caracter + oc;
            deci = deci / 8;
        }
        return oc;
    }

    public static String decimalAHexadecimal(int deci) {
        int residuo;
        String hexa = "";
        char[] caracteresHexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (deci > 0) {
            residuo = deci % 16;
            char caracterHexadecimal = caracteresHexadecimales[residuo];
            hexa = caracterHexadecimal + hexa;
            deci = deci / 16;
        }
        return hexa;
    }

    // Conversiones de otras bases a decimal
    public static int binarioADecimal(int bin) {
        int deci = 0;
        int potencia = 0;
        // Ciclo infinito hasta que binario sea igual a 0
        while (true) {
            if (bin == 0) {
                break;
            } else {
                int temp = bin % 10;
                deci += temp * Math.pow(2, potencia);
                bin = bin / 10;
                potencia++;
            }
        }
        return deci;
    }

    public static int octalADecimal(int oc) {
        int deci = 0;
        int potencia = 0;
        // Ciclo infinito que se rompe cuando octal es igual a 0
        while (true) {
            if (oc == 0) {
                break;
            } else {
                int temp = oc % 10;
                deci += temp * Math.pow(8, potencia);
                oc = oc / 10;
                potencia++;
            }
        }
        return deci;
    }

    public static int hexadecimalADecimal(String hexa) {
        String caracteresHexadecimales = "0123456789ABCDEF";
        hexa = hexa.toUpperCase();
        int deci = 0;
        for (int i = 0; i < hexa.length(); i++) {
            char caracter = hexa.charAt(i);
            int posicionEnCaracteres = caracteresHexadecimales.indexOf(caracter);
            deci = 16 * deci + posicionEnCaracteres;
        }
        return deci;
    }
}
