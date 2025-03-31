/*
 * Activity 4.9.2
 */

public class Hooved extends Animal
{
  private String food;
  private boolean nocturnal;
  private double aveLifeSpan;

  public Hooved(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }

  public Hooved()
  {
    System.out.println("A hooved animal has arrived.");
  }

  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}
