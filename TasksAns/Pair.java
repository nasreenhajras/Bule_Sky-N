/**
 * Created by 2020 on 08/03/2021.
 */
public class Pair<A,B> {
   A sfrst;
    B secen;

    public Pair(A sfrst, B secen) {
        this.sfrst = sfrst;
        this.secen = secen;
    }

    public A getSfrst() {
        return sfrst;
    }

    public void setSfrst(A sfrst) {
        this.sfrst = sfrst;
    }

    public B getSecen() {
        return secen;
    }

    public void setSecen(B secen) {
        this.secen = secen;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "sfrst=" + sfrst +
                ", secen=" + secen +
                '}';
    }

    public static void main(String[] args) {
        Pair<String,Integer>Ibookpair=new Pair<>("book1",11);

    }
}
