import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void TelevisionisOnTest() {
        Television tv = new Television();
        tv.toggleOn();
        assertTrue(tv.isOn());
    }

    @Test
    public void Televisionisofftest() {
        Television tv = new Television();
        tv.toggleOn();
        assertFalse(tv.isOn());
    }

    @Test
    public void increaseVolume() {
        Television tv = new Television();
        tv.toggleOn();
        tv.increase();
        tv.increase();
        tv.increase();
        tv.increase();
        assertEquals(4, tv.getvolume());
    }

    @Test
    public void decreaseVolume() {
        Television tv = new Television();
        tv.toggleOn();
        tv.increase();
        tv.increase();
        tv.increase();
        tv.increase();
        tv.decrease();
        assertEquals(3, tv.getvolume());
    }

    @Test
    public void changeChannel() {
        Television tv = new Television();
        tv.toggleOn();
        tv.changeChannel(2);
        assertEquals(2,tv.getchannel());
    }


}
