import org.testng.annotations.Test;

public class InvocationCountNEnable {

    @Test(invocationCount=0)
    public void InvocationTest(){
        System.out.println("Just Do it! ! !");
    }

    @Test(invocationCount=4, enabled=false)
    public void EnabledTest(){
        System.out.println("I will not do! ! !");
    }
}
