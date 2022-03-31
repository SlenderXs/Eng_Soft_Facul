package LojaDeBolo;

import LojaDeBolo.Bolo;

public class Prestigio extends Bolo {
    public Prestigio() {
        setNome(" Bolo de Prestigio");
        setPreco(70, 89f);
        setTipo("Com bombom");
    }

    @Override
    public void receita() {
        System.out.println("Receita");
    }

}
