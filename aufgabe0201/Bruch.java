package aufgabe0201;

public class Bruch {

        private int zaehler, nenner;
        private String meinBruch;

        public Bruch (int zaehler, int nenner){
            setZaehler(zaehler);
            setNenner(nenner);
        }

        public String toString(){

            return String.format("%d/%d",this.zaehler, this.nenner);
        }

        public Bruch addieren(Bruch b){
               return new Bruch(this.zaehler*nenner + this.nenner*b.zaehler, this.nenner*b.nenner);
        }

        public Bruch subtrahieren(Bruch b){
            return new Bruch(this.zaehler*nenner - this.nenner*b.zaehler, this.nenner*b.nenner);
        }

        public Bruch multipliziere (Bruch b){
            return new Bruch(this.zaehler*b.zaehler, this.nenner*b.nenner);
        }

        public Bruch dividieren (Bruch b){
            return new Bruch(this.zaehler*b.nenner, this.nenner*b.zaehler);
        }

    int getZaehler(){
            return this.zaehler;
    }

    int getNenner(){
            return this.nenner;
    }

    void setZaehler(int z){
            if (z<0){
                zaehler=z*-1;
            }
            else{
                zaehler=z;
            }
    }

    void setNenner(int n){
            if(n == 0) {
                  nenner = n+1;
            }
            else if (n<0){
                nenner=n*-1;
            }
            else {
                nenner=n;
            }
    }
}
