package ru.netology.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashBackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfBelow1000() {

        int actual = service.remain(500);
        Assert.assertEquals(actual, 500);

    }

    @Test
    public void shouldCalculateIf1000() {

        int actual = service.remain(1000);
        Assert.assertEquals(actual, 1000);

    }

    @Test
    public void shouldCalculateIfOver1000() {

        int actual = service.remain(1500);
        Assert.assertEquals(actual, 500);

    }

}




