public class Main {
    public static void main(String args[]) {
      switchDirection animal = new switchDirection(1, 2);
      System.out.println(animal);
      animal.switchThrottle();
      System.out.println(animal);
      animal.setThrottle1(3);
      System.out.println(animal);
      animal.switchThrottle();
      System.out.println(animal);
      animal.setThrottle2(4);
      System.out.println(animal);
      animal.switchThrottle();
      System.out.println(animal);
    }
}