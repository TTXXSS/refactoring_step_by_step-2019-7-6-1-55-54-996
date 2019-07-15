
import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {
    private static  Police police;

    @BeforeAll
    public static void init() {
        police = new Police();
    }

    @Test
    public void should_return_true_when_call_checkDriver_by_giving_18() {
        //given
        Driver driver = new Driver(18);

        //when
        boolean isAgeValid = police.checkDriver(driver);

        //then
        Assertions.assertEquals(isAgeValid, true);


    }

    @Test
    public void should_return_true_when_call_checkDriver_by_giving_over_18() {
        //given
        Driver driver = new Driver(19);

        //when
        boolean isAgeValid = police.checkDriver(driver);

        //then
        Assertions.assertEquals(isAgeValid, true);


    }

    @Test
    public void should_return_false_when_call_checkDriver_by_giving_less_18() {
        //given
        Driver driver = new Driver(15);

        //when
        boolean isAgeValid = police.checkDriver(driver);

        //then
        Assertions.assertEquals(isAgeValid, false);


    }
}