package operadoreslogicos;
// @author TECH MEX

import javax.swing.JOptionPane; //importar la clase JOptionPane

public class OperadoresLogicos {
    String nombre;

    public OperadoresLogicos() {//constructor que manadara a llamar mis metodos
        pideNombre();
        muestraSaludo();
    }

    private void pideNombre() {
        nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre"); //pdeir indormacion al usuario
    }

    private void muestraSaludo() {
        if (nombre == null || nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "no diste tu nombre"); //mostrar mensaje al usuario de que no puso su nombre
        } else {
            JOptionPane.showMessageDialog(null, "Hola" + nombre);
        }

    }

    public static void main(String[] args) {
        new OperadoresLogicos();

    }

}
