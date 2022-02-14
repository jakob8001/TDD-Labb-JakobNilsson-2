import org.junit.jupiter.api.*;

public class TestEmployee {

    Employee TestObject;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Nu börjar vi: ");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Nu slutar vi: ");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Start: ");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Slut: ");

        TestObject = new Employee("Jakob", "Nilsson", 23, 10.000);
    }



}
