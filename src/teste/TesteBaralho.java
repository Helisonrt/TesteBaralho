/**
 * <copyright>
 * 
 * Copyright 2012 Burno Vicelli <brunodosax@hotmail.com>
 * Copyright 2012 Helison Teixeira <helisonreus@gmail.com>
 * 
 * Este programa e todos os materiais que o acompanham estão disponibilizados
 * sob a licença GPL versão 3, que acompanha esta distribuição e está disponível
 * em http://www.gnu.org/licenses/gpl.html
 * </copyright>
 */

package teste;

import java.util.ArrayList;
import pds.baralho.*;

/**
 * Classe que testa o funcionamento da biblioteca do baralho
 * 
 * Universidade Federal do Pampa 
 * Graduação: Engenharia de Software 
 * Disciplina: Práticas de Desenvolvimento de Software
 * Professor: Wagner de Melo Reck
 * Semestre: 5° - 2012/01
 * @author Helison Teixeira
 * @author Bruno Vicelli
 * @version 1.5 @Date 15/06/2012
 * 
 */
public class TesteBaralho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carta carta;
        Baralho baralho = new Baralho();
        MonteDescarte monte = new MonteDescarte();
        System.out.println("EXIBINDO BARALHO CRIADO");
        baralho.exibirBaralhoCompleto();
        baralho.embaralhar();
        System.out.println("EXIBINDO BARALHO EMBARALHADO 1");
        baralho.exibirBaralhoCompleto();
        baralho.embaralhar(300);
        System.out.println("EXIBINDO BARALHO EMBARALHADO 2");
        baralho.exibirBaralhoCompleto();
        baralho.cortar(10);
        System.out.println("BARALHO CORTADO NA POSICAO 30");
        baralho.exibirBaralhoCompleto();
        carta = baralho.getPrimeiraCarta();
        System.out.println("----------------------" + carta.getNumero() + " " + carta.getnaipe() + "------------------------------");
        baralho.exibirBaralhoCompleto();
        Carta ultima;
        ultima = baralho.getUltimaCarta();
        System.out.println("----------------------" + ultima.getNumero() + " " + ultima.getnaipe() + "------------------------------");
        baralho.exibirBaralhoCompleto();
        baralho.moverPrimeiraParaOFim();
        System.out.println("---------------------------------------------------------------");
        baralho.exibirBaralhoCompleto();
        System.out.println("Movendo "+carta.getNumero()+" de "+carta.getnaipe()+" para o monte de descarte");
        carta.setNumero("A");
        carta.setnaipe("copas");
        monte.moverParaMonteDeDescarte(carta);        
        System.out.println("Movendo  A de ouro pro monte de descarte");
        monte.moverParaMonteDeDescarte("ouro", "A");
        monte.exibirMonteDescarte();
        monte.removeDoMonteDeDescarte(carta);
        System.out.println("Sem A de Copas");
        monte.exibirMonteDescarte();
        System.out.println("Remover A de OURO e Adicionar A de copas");
        monte.removeDoMonteDeDescarte("ouro", "A");
        monte.moverParaMonteDeDescarte(carta);
        monte.exibirMonteDescarte();
        monte.moverParaMonteDeDescarte("PAUS", "8");
        monte.moverParaMonteDeDescarte("COPAS", "9");
        carta = monte.retornarCartaDoMonteDeDescarte(1);
        System.out.println("Exibir o 8 de paus, a carta na posicao 1 do array");
        System.out.println(carta.getNumero()+" de "+carta.getnaipe());
        ArrayList<Carta> monteDescarte = monte.retornarMonteDeDescarte();
        System.out.println("Exibindo todas as cartas do monte de descarte");
        for (int i =0; i<= monteDescarte.size()-1;i++){
            System.out.println("Numero: "+monteDescarte.get(i).getNumero()+" Naipe: "+ monteDescarte.get(i).getnaipe());;
        }
        System.out.println("That's All Folks :)");
        System.exit(0);
        //monte.moverParaMonteDeDescarte(carta);
    }
}
