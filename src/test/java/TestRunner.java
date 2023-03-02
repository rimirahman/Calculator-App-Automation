import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends Setup {

  @Test(priority = 1)
  public void doSum() throws InterruptedException {
      CalcScreen calcScreen=new CalcScreen(driver);
      String sum=calcScreen.doSum();
      System.out.println("The sum of 9 and 5 is : "+sum);
      Assert.assertEquals(sum,"14");
  }

  @Test(priority = 2)
  public void doSubtraction() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String subtraction= calcScreen.doSubtraction();
        System.out.println("The subtraction of 8 and 3 is : "+subtraction);
        Assert.assertEquals(subtraction,"5");
    }

    @Test(priority = 3)
    public void doMultiplication() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String multiplication= calcScreen.doMultiplication();
        System.out.println("The multiplication of 14 and 5 is : "+multiplication);
        Assert.assertEquals(multiplication,"70");
    }

    @Test(priority = 4)
    public void doDivision() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String division= calcScreen.doDivision();
        System.out.println("The division of 70 and 10 is : "+division);
        Assert.assertEquals(division,"7");
    }

    @Test(priority = 5)
    public void doEquation() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String solve= calcScreen.doEquation();
        System.out.println("The result of the equation is : "+solve);
        Assert.assertEquals(solve,"260");
    }
}
