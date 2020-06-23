/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author ANTONIO-LIBORIO
 */
public class circulo implements IFiguras{
    
    private double radio;
    private double area;
    private double perimetro;

    @Override
    public void parametros(Double[] datos) {
        radio = datos[0];
    }

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        area = Math.PI * Math.pow(radio,2);
        return area;
    }

    @Override
    public String descripcionString() {
        if(area == 0){
            calcularArea();
        }
        if(perimetro == 0){
            calcularPerimetro();
        }
        return "Esta figura es un Circulo el area es "
                + area + " y el perimetro es " + perimetro ;
    }
    
}
