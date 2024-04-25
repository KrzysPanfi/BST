public class DrzewoBST {

    private Wezel root;

    public void add(int liczba) {
        if (root == null) {
            root = new Wezel(liczba);
        }
        Wezel tmp = root;
        while (true) {
            if (liczba > tmp.getDane() && tmp.getPrawodziecko() == null) {
                Wezel n = new Wezel(liczba);
                tmp.setPrawodziecko(n);
                break;
            } else if (liczba <= tmp.getDane() && tmp.getPrawodziecko() == null) {
                Wezel n = new Wezel(liczba);
                tmp.setLewedziecko(n);
                break;
            } else if (liczba > tmp.getDane() && tmp.getPrawodziecko() != null) {
                tmp = tmp.getPrawodziecko();
            } else if (liczba <= tmp.getDane() && tmp.getPrawodziecko() != null) {
                tmp = tmp.getLewedziecko();
            }
        }
    }


    public void remove(int liczba) {
        Wezel tmp = root;
        while (true) {
            if (tmp.getDane() == liczba) {
                tmp = tmp.getPrawodziecko();
                tmp.setPrawodziecko(null);
                break;
            } else if (liczba > tmp.getDane()&&tmp.getPrawodziecko()!=null) {
                tmp = tmp.getPrawodziecko();
            } else if (liczba <= tmp.getDane()&&tmp.getLewedziecko()!=null) {
                tmp = tmp.getLewedziecko();
            }
        }
    }
    public void Getmin()
}
