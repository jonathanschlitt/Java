package reflection_security_manager;

public class Safe {
  String secretContent;
  int code;

  public Safe() {
    System.setSecurityManager(new SecurityManager());
    this.secretContent = "Top Secret data.";
    this.code = 42;
  }

  public void access(int code) {
    if (this.code == code) {
      System.out.println(secretContent);
    } else {
      System.out.println("Access denied.");
    }
  }
}
