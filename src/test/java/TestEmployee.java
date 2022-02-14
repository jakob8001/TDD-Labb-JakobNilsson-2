import com.sun.xml.internal.bind.v2.model.core.ID;
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

    @AfterEach
    public void afterEach(){
        System.out.println("Slut: ");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Start: ");

        TestObject = new Employee("Jakob", "Nilsson", 23, 10.000);
    }

    @Test
    public void checkGetUniqueID(){
        int expected = 1001;

        int ID = TestObject.createUniqueID();
        int actual = TestObject.getUniqueID(ID);
    }



}
