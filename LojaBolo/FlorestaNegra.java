public class FlorestaNegra extends Bolo {
    public FlorestaNegra() {
        setNome(" Bolo de FlorestaNegra");
        setPreco(9, 59f);
        setTipo("Com chocolate amargo.");
    }

    @Override
    public void receita() {
        System.out.println("Chocolate, leite e Morango");
    }
}
