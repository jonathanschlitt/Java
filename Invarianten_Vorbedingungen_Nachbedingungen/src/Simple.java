
public class Simple {
    public static void main(String[] args) throws Exception {

        Simple s = new Simple(0);

        s.increment(Integer.MAX_VALUE);
    }

    private int number = 0;

    public Simple(int x) {
        assert (this.number == 0) : "Invariant error";
        this.number = x;
    }

    public int getNumber() {
        return this.number;
    }

    public void increment(int x) {
        assert (this.number < 5 && this.number >= 0) : "PreCondition error";
        number += x;
        System.out.println(number);
        assert (this.number != Integer.MAX_VALUE) : "PostCondition error";
    }

    public void checkInvariants() {
        assert (this.number == 0) : "Invariant error";
    }

    public void checkPreCondition() {
        assert (this.number < 5) : "PreCondition error";
    }

    public void checkPostCondition() {
        assert (this.number != Integer.MAX_VALUE) : "PostCondition error";
    }
}
