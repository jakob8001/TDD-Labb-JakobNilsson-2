import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestEmployee {

    Employee TestObject1;
    Employee TestObject2;
    Employee TestObject3;

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

        TestObject1 = new Employee("Jakob", "Nilsson", 23, 10.000);
        TestObject2 = new Employee("Marcus", "Davidsson", 33, 10.000);
        TestObject3 = new Employee("Anki", "Pham", 24, 10.000);
    }

    @Test
    public void checkGetUniqueID(){
        int expected = 1;

        int actual = TestObject1.getUniqueID();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkUniqueID(){

        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 3;

        int actual1 = TestObject1.getUniqueID();
        int actual2 = TestObject2.getUniqueID();
        int actual3 = TestObject3.getUniqueID();

        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }

    @Test
    public void getFnameTest(){
        String expected = "Jakob";

        String actual = TestObject1.getFname();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkSetFnameTest(){
        String expcted = "Göran";

        TestObject1.setFname(expcted);

        String actual = TestObject1.getFname();

        Assertions.assertEquals(expcted,actual);
    }

    @Test
    public void getEnameTest(){
        String expected = "Nilsson";

        String actual = TestObject1.getEname();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkSetEnameTest(){
        String expected = "Svensson";

        TestObject1.setEname(expected);

        String actual = TestObject1.getEname();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkGetAgeTest(){
        int expected = 23;

        int actual = TestObject1.getAge();
    }

}
