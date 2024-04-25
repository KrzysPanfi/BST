public class Wezel {
    private int dane;
    private Wezel lewedziecko;
    private Wezel prawedziecko;

    public Wezel(int dane) {
        this.dane = dane;
    }

    public Wezel(int dane, Wezel lewedziecko, Wezel prawodziecko) {
        this.dane = dane;
        this.lewedziecko = lewedziecko;
        this.prawedziecko = prawodziecko;
    }

    public int getDane() {
        return dane;
    }

    public void setDane(int dane) {
        this.dane = dane;
    }

    public Wezel getLewedziecko() {
        return lewedziecko;
    }

    public void setLewedziecko(Wezel lewedziecko) {
        this.lewedziecko = lewedziecko;
    }

    public Wezel getPrawodziecko() {
        return prawedziecko;
    }

    public void setPrawodziecko(Wezel prawodziecko) {
        this.prawedziecko = prawodziecko;
    }
}
