import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {



    @Test

    public void cashbackFrom900() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);

    }

    @Test

    public void cashbackFrom1000 () {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);

    }
    @Test

    public void cashbackFrom1100 () {
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(1100);

        Assert.assertEquals(actual, expected);

    }
}
