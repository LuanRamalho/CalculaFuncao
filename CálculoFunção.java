public class CálculoFunção 
{

    public static void main(String[] args) 
    {
        Adição a = new Adição();
        System.out.println("DADOS DE ADIÇÃO");
        a.adição(7.5, 8.5);
        a.adição(4.55, 3.44);
        a.adição(7.55, 9.55);
        
        System.out.println("");
        
        Subtração s = new Subtração();
        System.out.println("DADOS DE SUBTRAÇÃO");
        s.subtração(8.55, 4.66);
        s.subtração(4.66, 7.88);
        s.subtração(6.5, 9.25);
        
        System.out.println("");
        
        Multiplicação m = new Multiplicação();
        System.out.println("DADOS DE MULTIPLICAÇÃO");
        m.multiplicação(5, 66);
        m.multiplicação(2.25, 6.5);
        m.multiplicação(6.85, 8.95);
        m.multiplicação(1.5, 7.3);
        
        System.out.println("");
        Divisão d = new Divisão();
        System.out.println("DADOS DE DIVISÃO");
        d.divisão(6, 8);
        d.divisão(7.2, 0.2);
        d.divisão(6.4, 7.2);
        d.divisão(2.5, 5.5);
        
        System.out.println("");
        Porcentagem p = new Porcentagem();
        System.out.println("DADOS DE PORCENTAGEM");
        p.perc(255, 800);
        p.perc(466, 955);
        p.perc(350, 1250);
        p.perc(766, 876);
        p.perc(55, 85);
        
        System.out.println("");
        Exponencial e = new Exponencial();
        System.out.println("DADOS DE POTÊNCIA");
        e.exp(4,4);
        e.exp(6, 8);
        e.exp(512, 0.3333);
        e.exp(6,10);
        e.exp(10, 4);
        e.exp(1024, 0.25);
    }
}
