import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id = "com.google.android.calculator:id/digit_9")
    AndroidElement btn9;

    @FindBy(id = "com.google.android.calculator:id/digit_5")
    AndroidElement btn5;

    @FindBy(id = "com.google.android.calculator:id/digit_8")
    AndroidElement btn8;

    @FindBy(id = "com.google.android.calculator:id/digit_3")
    AndroidElement btn3;
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    AndroidElement btn1;
    @FindBy(id = "com.google.android.calculator:id/digit_2")
    AndroidElement btn2;
    @FindBy(id = "com.google.android.calculator:id/digit_4")
    AndroidElement btn4;
    @FindBy(id = "com.google.android.calculator:id/digit_7")
    AndroidElement btn7;
    @FindBy(id = "com.google.android.calculator:id/digit_0")
    AndroidElement btn0;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    AndroidElement btnmulti;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    AndroidElement btnminus;
    @FindBy(id = "com.google.android.calculator:id/op_add")
    AndroidElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    AndroidElement btndivision;


    @FindBy(id = "com.google.android.calculator:id/eq")
    AndroidElement btnequal;

    @FindBy(id = "com.google.android.calculator:id/clr")
    AndroidElement btnclear;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    AndroidElement resultfinal;

    public CalcScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String doSum() throws InterruptedException {
        Thread.sleep(1000);
        btn9.click();
        Thread.sleep(1000);
        btnPlus.click();
        Thread.sleep(1000);
        btn5.click();
        Thread.sleep(1000);
        btnequal.click();
        Thread.sleep(1000);
        return resultfinal.getText();

    }

    public String doSubtraction() throws InterruptedException {
        Thread.sleep(1000);
        btnclear.click();
        Thread.sleep(1000);
        btn8.click();
        Thread.sleep(1000);
        btnminus.click();
        Thread.sleep(1000);
        btn3.click();
        Thread.sleep(1000);
        btnequal.click();
        return resultfinal.getText();

    }
    public String doMultiplication() throws InterruptedException {
        Thread.sleep(1000);
        btnclear.click();
        Thread.sleep(1000);
        btn1.click();
        Thread.sleep(1000);
        btn4.click();
        Thread.sleep(1000);
        btnmulti.click();
        Thread.sleep(1000);
        btn5.click();
        Thread.sleep(1000);
        btnequal.click();
        return resultfinal.getText();

    }

    public String doDivision() throws InterruptedException {
        Thread.sleep(1000);
        btnclear.click();
        Thread.sleep(1000);
        btn7.click();
        Thread.sleep(1000);
        btn0.click();
        Thread.sleep(1000);
        btndivision.click();
        Thread.sleep(1000);
        btn1.click();
        Thread.sleep(1000);
        btn0.click();
        Thread.sleep(1000);
        btnequal.click();
        return resultfinal.getText();

    }

    public String doEquation() throws InterruptedException {
        Thread.sleep(1000);
        btnclear.click();
        Thread.sleep(1000);
        btn1.click();
        Thread.sleep(1000);
        btn0.click();
        Thread.sleep(1000);
        btn0.click();
        Thread.sleep(1000);

        btnPlus.click();
        Thread.sleep(1000);

        btn2.click();
        Thread.sleep(1000);
        btn0.click();
        Thread.sleep(1000);
        btn0.click();
        Thread.sleep(1000);
        btnminus.click();
        Thread.sleep(1000);

        btn1.click();
        Thread.sleep(1000);
        btn0.click();
        Thread.sleep(1000);
        btn0.click();
        Thread.sleep(1000);

        btnmulti.click();
        Thread.sleep(1000);
        btn2.click();
        Thread.sleep(1000);

        btndivision.click();
        Thread.sleep(1000);
        btn5.click();
        Thread.sleep(2000);
        btnequal.click();

        return resultfinal.getText();

    }
}
