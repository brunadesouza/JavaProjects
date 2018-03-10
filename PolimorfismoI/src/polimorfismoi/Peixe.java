/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoi;

/**
 *
 * @author office_computer
 */
public class Peixe extends Animal{
    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comida de Peixe");
    }

    @Override
    public void emitirSom() {
        System.out.println("Nao emite som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}
