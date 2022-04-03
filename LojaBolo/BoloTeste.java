public class BoloTeste {
    public static void main(String[] args) {

    FormaBolo fb = new FormaBolo();
    
    Bolo fb1 = fb.getBolo(FormaBolo.Tipo.ABACAXI);
    fb1.sobreobolo();
    Bolo b1 = fb.getBolo(FormaBolo.Tipo.PRESTIGIO);
    b1.sobreobolo();
    Bolo f1 = fb.getBolo(FormaBolo.Tipo.FLORESTANEGRA);
    f1.sobreobolo();
    Bolo f2 = fb.getBolo(FormaBolo.Tipo.CHOCONINHO);
    f2.sobreobolo();

    
    }
}
        /*Abacaxi ab = new Abacaxi();
        ab.sobreobolo();
        ab.receita();

        FlorestaNegra fn = new FlorestaNegra();
        fn.sobreobolo();
        fn.receita();

        Choconinho ch = new Choconinho();
        ch.sobreobolo();
        ch.receita();

        Prestigio pt = new Prestigio();
        pt.sobreobolo();
        pt.receita();*/

