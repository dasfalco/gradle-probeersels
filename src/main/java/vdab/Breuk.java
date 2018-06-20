package vdab;

public class Breuk {

    int teller;
    int noemer;



    public Breuk (int teller, int noemer){
        this.teller=teller;
        this.noemer=noemer;
        }

    public Breuk() {

    }

    public Breuk plus (Breuk input){
        Breuk output = new Breuk(1,2);
        int n1 = this.getTeller()*input.getNoemer();
        int n2 = this.getNoemer()*input.getTeller();
        int n3 = this.getNoemer()*input.getNoemer();

        output.setTeller(n1 + n2);
        output.setNoemer(n3);

        return output;
        }
    public Breuk min (Breuk input) {
        Breuk output = new Breuk(1, 2);
        int n1 = this.getTeller() * input.getNoemer();
        int n2 = this.getNoemer() * input.getTeller();
        int n4 = this.getNoemer() * input.getNoemer();

        output.setTeller(n1 - n2);
        output.setNoemer(n4);

        return output;
        }
    public Breuk vermenigvuldigen (Breuk input) {
        Breuk output = new Breuk(1, 2);
        int n1 = this.getTeller() * input.getNoemer();
        int n2 = this.getNoemer() * input.getTeller();
        int n3 = this.getNoemer() * input.getNoemer();

        output.setTeller(n1 - n2);
        output.setNoemer(n3);

        return output;
    }
    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public void setNoemer(int noemer) {
        this.noemer = noemer;
    }
}
