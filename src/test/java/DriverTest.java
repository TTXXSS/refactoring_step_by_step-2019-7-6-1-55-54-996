import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DriverTest {
    private static Driver driver;

    @BeforeAll
    public static void init() {
        driver = new Driver();
    }

    @Test
    public void should_return_true_when_call_checkDriver_by_giving_18() {
        //given
        driver.setAge(18);

        //when
        boolean isAgeValid = driver.isLegalDriver();

        //then
        Assertions.assertEquals(isAgeValid, true);


    }

    @Test
    public void should_return_true_when_call_checkDriver_by_giving_over_18() {
        //given
        driver.setAge(19);

        //when
        boolean isAgeValid = driver.isLegalDriver();

        //then
        Assertions.assertEquals(isAgeValid, true);


    }

    @Test
    public void should_return_false_when_call_checkDriver_by_giving_less_18() {
        //given
        driver.setAge(15);

        //when
        boolean isAgeValid = driver.isLegalDriver();

        //then
        Assertions.assertEquals(isAgeValid, false);


    }
}
