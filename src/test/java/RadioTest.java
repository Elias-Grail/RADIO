import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test

    public void testMiddleStantion() {

        Radio radio = new Radio();

        radio.setCurrentStantion(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testNegativeStationValue() {

        Radio radio = new Radio();

        radio.setCurrentStantion(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testZeroStation() {

        Radio radio = new Radio();

        radio.setCurrentStantion(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testFirstStation() {

        Radio radio = new Radio();

        radio.setCurrentStantion(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testPenultimateStation() {

        Radio radio = new Radio();

        radio.setCurrentStantion(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testMaxStation() {

        Radio radio = new Radio();

        radio.setCurrentStantion(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testBeyondMaximumStation() {

        Radio radio = new Radio();

        radio.setCurrentStantion(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testMiddleVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume (50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void testNegativeVolumeValue() {

        Radio radio = new Radio();

        radio.setCurrentVolume (-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testZeroVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume (0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testFirstVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume (1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testPenultimateVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume (99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testMaxVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume (100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testBeyondMaximumVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume (101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testSwitchingStationsPlus() {

        Radio radio = new Radio();
        radio.setCurrentStantion(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testSwitchingStationsMinus() {

        Radio radio = new Radio();
        radio.setCurrentStantion(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testSwitchingAboveMaximumStation() {

        Radio radio = new Radio();
        radio.setCurrentStantion(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testSwitchingAboveMinimumStation() {

        Radio radio = new Radio();
        radio.setCurrentStantion(0);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testCount() {

        Radio radio = new Radio(20);

        radio.setCurrentStantion(19);

        int expected = 19;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

}
