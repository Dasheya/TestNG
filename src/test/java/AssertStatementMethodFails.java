import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertStatementMethodFails {
    @Test(priority=1)
    public void createUser(){
        Assert.fail();
        System.out.println("createUser...user created successufuly");

    }

    @Test(priority=3, dependsOnMethods="createUser")
    public void deleteUser(){
        System.out.println("deleteUser...");
    }
}
