public class DrzewoBST {

    private Wezel root;

    public void add(Wezel tmp, int key) {
        if (root == null) {
            this.root = new Wezel(key);
            return;
        }

        if (key > tmp.getDane() && tmp.getPrawodziecko() == null) {
            Wezel n = new Wezel(key);
            tmp.setPrawodziecko(n);

        } else if (key <= tmp.getDane() && tmp.getLewedziecko() == null) {
            Wezel n = new Wezel(key);
            tmp.setLewedziecko(n);

        } else if (key > tmp.getDane() && tmp.getPrawodziecko() != null) {
            add(tmp.getPrawodziecko(), key);
        } else if (key <= tmp.getDane() && tmp.getLewedziecko() != null) {
            add(tmp.getLewedziecko(), key);
        }
    }

    public Wezel Remove(Wezel tmp, int key) {

        if (this.root == null) {
            return tmp;
        }

        if (key < tmp.getDane() && tmp.getLewedziecko() != null) {
            tmp.setLewedziecko(Remove(tmp.getLewedziecko(), key));
        } else if (key > tmp.getDane() && tmp.getPrawodziecko() != null) {
            tmp.setPrawodziecko(Remove(tmp.getPrawodziecko(), key));
        } else {

            if (tmp.getLewedziecko() == null) {
                return tmp.getPrawodziecko();
            } else if (tmp.getPrawodziecko() == null) {
                return tmp.getLewedziecko();
            }
            tmp.setDane(Getmin(tmp.getPrawodziecko()).getDane());
            tmp.setPrawodziecko(Remove(tmp.getPrawodziecko(), tmp.getDane()));
        }
        return tmp;
    }


    public Wezel Getmin(Wezel tmp) {
        while (tmp.getLewedziecko() != null) {
            tmp = tmp.getLewedziecko();
        }
        return tmp;
    }

    public Wezel GetMax(Wezel tmp) {
        while (tmp.getPrawodziecko() != null) {
            tmp = tmp.getPrawodziecko();
        }
        return tmp;
    }

    public Wezel Find(Wezel tmp, int key) {
        if (tmp == null || tmp.getDane() == key) {
            return tmp;
        }

        if (tmp.getDane() < key) {
            return Find(tmp.getPrawodziecko(), key);
        }
        return Find(tmp.getLewedziecko(), key);

    }
    void inorder(Wezel root) {
        if (root != null) {
            inorder(root.getLewedziecko());
            System.out.print(root.getDane() + " ");
            inorder(root.getPrawodziecko());
        }
    }

    public Wezel getRoot() {
        return root;
    }

    public void setRoot(Wezel root) {
        this.root = root;
    }
}

