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


    Wezel Remove(Wezel tmp, int key) {

        if (tmp == null) {
            return tmp;
        }


        if (key < tmp.getDane()) {
            tmp.setLewedziecko(Remove(tmp.getLewedziecko(), key));
        }

        else if (key > tmp.getDane()) {
            tmp.setPrawodziecko(Remove(tmp.getPrawodziecko(), key));
        }

        else {

            if (tmp.getLewedziecko() == null) {
                return tmp.getPrawodziecko();
            } else if (tmp.getPrawodziecko() == null) {
                return tmp.getLewedziecko();
            }


            tmp.setDane(Getmin(tmp.getPrawodziecko()));

            tmp.setPrawodziecko(Remove(tmp.getPrawodziecko(), tmp.getDane()));
        }

        return root;
    }
  public  int Getmin(Wezel root) {
        int minv = root.getDane();
        while (root.getLewedziecko() != null) {
            minv = root.getLewedziecko().getDane();
            root = root.getLewedziecko();
        }
        return minv;
    }
    public int GetMax(Wezel root){
        int maxv= root.getDane();
        while(root.getPrawodziecko()!=null){
            maxv=root.getPrawodziecko().getDane();
            root = root.getPrawodziecko();
        }
        return maxv;
    }

    public Wezel getRoot() {
        return root;
    }
}
