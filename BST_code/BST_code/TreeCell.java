public class TreeCell<T> {
    private T datum;
    private TreeCell<T> left, right;

    public TreeCell(T x) {
        datum = x;
    }

    public TreeCell(T x, TreeCell<T> lft, TreeCell<T> rgt) {
        datum = x;
        left = lft;
        right = rgt;
    }

    public T getDatum() {
        return datum;
    }

    public TreeCell<T> getLeft() {
        return left;
    }

    public TreeCell<T> getRight() {
        return right;
    }

    public void setDatum(T obj) {
        datum = obj;
    }

    public void setLeft(TreeCell<T> c) {
        left = c;
    }

    public void setRight(TreeCell<T> c) {
        right = c;
    }
} 

