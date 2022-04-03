public class Abacaxi extends Bolo {

    
        public Abacaxi() {
            setNome(" Bolo de Abacaxi");
            setPreco(50, 99f);
            setTipo("Com Morango");
        }
    
        @Override
        public void receita() {
            System.out.println("Receita");
        }
}

