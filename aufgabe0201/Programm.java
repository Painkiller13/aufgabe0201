package aufgabe0201;

public class Programm {
    
    public static void main(String[] arg){
        Bruch a = new Bruch(1,-2);
        Bruch b = new Bruch(1,2);
        Bruch c;
        Bruch d;
        Bruch e;
        Bruch f;

        c = a.addieren(b);
        d = a.subtrahieren(b);
        e = a.multipliziere(b);
        f = a.dividieren(b);



        System.out.println("a = "+a.getZaehler()+"/"+a.getNenner());
        System.out.println("b = "+b.getZaehler()+"/"+b.getNenner());
        System.out.println("a + b = "+c.getZaehler()+"/"+c.getNenner());
        System.out.println("a - b = "+d.getZaehler()+"/"+d.getNenner());
        System.out.println("a * b = "+e.getZaehler()+"/"+e.getNenner());
        System.out.println("a / b = "+f.getZaehler()+"/"+f.getNenner());
    }
}
