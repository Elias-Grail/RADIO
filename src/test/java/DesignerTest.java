import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class DesignerTest {

    @Test

    public void testCountStantionMid() {

        Radio radio = new Radio(10);

        radio.setCurrentStantion(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testCountStantionMax() {

        Radio radio = new Radio(10);

        radio.setCurrentStantion(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void testCountStantionMin() {

        Radio radio = new Radio(10);

        radio.setCurrentStantion(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
}
