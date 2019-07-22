/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Aluno
 */
public class SalaMedia extends Sala{
    
    public SalaMedia(int numero, int quantidade, String sessao, int cadeiras, double lucro, String tipo) {
        super(numero, quantidade, sessao, cadeiras, lucro, tipo);
    }

    @Override
    public double venda() {
        //
       return 0;
    }
    
}
