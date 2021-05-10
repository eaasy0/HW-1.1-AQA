package ru.netology.test;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashBackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfBelow1000() {
        Assert.assertEquals(service.remain(980),20);
    }

    @Test
    public void shouldCalculate500() {
        Assert.assertEquals(service.remain(1500),500);
    }

    @Test
    public void shouldCalculateNull() {
        Assert.assertEquals(service.remain(2000), 0);
    }
}



