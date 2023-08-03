package invariants_assertions;

public class Invariants {

  public static void main(String[] args) {
    Invariants i1 = new Invariants();

    i1.setX(100);
    i1.getX();
  }

  private int x = 100;;

  public void setX(int x) {
    this.x = x;
    checkInvariants();
  }

  public int getX() {
    return this.x;
  }

  public void checkInvariants() {
    assert (this.x >= 0 && this.x <= 100);
  }
}
