import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
        @Test(priority=1)
        public void createUser(){

            System.out.println("Darshan");
            Assert.fail();
        }

        @Test(priority=3, dependsOnMethods="createUser")
        public void deleteUser(){
            System.out.println("deleteUser>Darshan");
        }
    }
