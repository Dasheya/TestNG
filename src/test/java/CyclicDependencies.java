import org.testng.annotations.Test;

public class CyclicDependencies {
    @Test(priority=1, dependsOnMethods="deleteUser")
        public void createUser () {
            System.out.println("createUser...user created successufuly");
        }

        @Test(priority = 3, dependsOnMethods = "createUser")
        public void deleteUser () {
            System.out.println("deleteUser...");
        }
  }
