package LojaDeBolo;

public class Choconinho extends Bolo {

    public Choconinho() {
        setNome(" Bolo de choconinho");
        setPreco(1, 60f);
        setTipo("Com Morango");
    }

    @Override
    public void receita() {
        System.out.println("Receita");
    }

}
