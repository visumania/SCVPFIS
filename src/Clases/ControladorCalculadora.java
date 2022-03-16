package Clases;

import Interfaz.VistaCalculadora;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControladorCalculadora implements ActionListener {
    private VistaCalculadora vCalculadora = null;
    private Calculadora calculadora = null;
    
    float numero1 = 0, numero2 = 0;
    String operacion = null;
    
    public ControladorCalculadora(){
        vCalculadora = new VistaCalculadora();
        calculadora = new Calculadora();
        
        addListener();
        
        vCalculadora.setLocationRelativeTo(null);
        vCalculadora.setVisible(true);
    }
    
    private void addListener(){
        vCalculadora.jButtonNumeroCero.addActionListener(this);
        vCalculadora.jButtonNumeroUno.addActionListener(this);
        vCalculadora.jButtonNumeroDos.addActionListener(this);
        vCalculadora.jButtonNumeroTres.addActionListener(this);
        vCalculadora.jButtonNumeroCuatro.addActionListener(this);
        vCalculadora.jButtonNumeroCinco.addActionListener(this);
        vCalculadora.jButtonNumeroSeis.addActionListener(this);
        vCalculadora.jButtonNumeroSiete.addActionListener(this);
        vCalculadora.jButtonNumeroOcho.addActionListener(this);
        vCalculadora.jButtonNumeroNueve.addActionListener(this);
        
        vCalculadora.jButtonSuma.addActionListener(this);
        vCalculadora.jButtonResta.addActionListener(this);
        vCalculadora.jButtonMultiplicacion.addActionListener(this);
        vCalculadora.jButtonDivision.addActionListener(this);
        vCalculadora.jButtonComa.addActionListener(this);
        vCalculadora.jButtonIgual.addActionListener(this);
        vCalculadora.jButtonVaciar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buffer;
        
        switch(e.getActionCommand())
        {
            case "numero0":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + "0");
                break;
                
            case "numero1":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + "1");
                break;
                
            case "numero2":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + "2");
                break;
                
            case "numero3":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + "3");
                break;
                
            case "numero4":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + "4");
                break;
                
            case "numero5":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + "5");
                break;
                
            case "numero6":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + "6");
                break;
                
            case "numero7":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + "7");
                break;
                
            case "numero8":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + "8");
                break;
                
            case "numero9":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + "9");
                break;
                
            case "Suma":
                numero1= Float.valueOf(vCalculadora.jTextPanePantallaCalculadora.getText());
                vCalculadora.jTextPanePantallaCalculadora.setText("");
                operacion = "+";
                break;
                
            case "Resta":
                numero1= Float.valueOf(vCalculadora.jTextPanePantallaCalculadora.getText());
                vCalculadora.jTextPanePantallaCalculadora.setText("");
                operacion = "-";
                break;
                
            case "Multiplicacion":
                numero1= Float.valueOf(vCalculadora.jTextPanePantallaCalculadora.getText());
                vCalculadora.jTextPanePantallaCalculadora.setText("");
                operacion = "x";
                break;
                
            case "Division":
                numero1= Float.valueOf(vCalculadora.jTextPanePantallaCalculadora.getText());
                vCalculadora.jTextPanePantallaCalculadora.setText("");
                operacion = "/";
                break;
                
            case "Coma":
                buffer = vCalculadora.jTextPanePantallaCalculadora.getText();
                vCalculadora.jTextPanePantallaCalculadora.setText(buffer + ".");
                break;
                
            case "Igual":
                numero2 = Float.valueOf(vCalculadora.jTextPanePantallaCalculadora.getText());
                
                if(operacion.equals("+"))
                    vCalculadora.jTextPanePantallaCalculadora.setText(Float.toString(calculadora.suma(numero1, numero2)));
                
                if(operacion.equals("-"))
                    vCalculadora.jTextPanePantallaCalculadora.setText(Float.toString(calculadora.resta(numero1, numero2)));
                
                if(operacion.equals("x"))
                    vCalculadora.jTextPanePantallaCalculadora.setText(Float.toString(calculadora.multiplicacion(numero1, numero2)));
                
                if(operacion.equals("/"))
                    vCalculadora.jTextPanePantallaCalculadora.setText(Float.toString(calculadora.division(numero1, numero2)));
                break;
                
            case "Vaciar":
                numero1 = numero2 = 0;
                buffer = operacion = null;
                vCalculadora.jTextPanePantallaCalculadora.setText("");
                break;
        }
    }
}