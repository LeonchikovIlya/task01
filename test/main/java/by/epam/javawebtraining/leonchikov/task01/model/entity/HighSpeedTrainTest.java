package by.epam.javawebtraining.leonchikov.task01.model.entity;

import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalHighSpeedTrainWagonTypeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighSpeedTrainTest {

    private HighSpeedTrain highSpeed = new HighSpeedTrain("First", 10, 20, Train.TrainType.HIGHSPEED, 200
            , HighSpeedTrain.WagonType.FIRST_CLASS);

    @Test
    public void getWagonType() {

        assertEquals(HighSpeedTrain.WagonType.FIRST_CLASS, highSpeed.getWagonType());
    }

    @Test
    public void setWagonType() throws IllegalHighSpeedTrainWagonTypeTypeException {

        highSpeed.setWagonType(HighSpeedTrain.WagonType.COMMON);

        assertEquals(HighSpeedTrain.WagonType.COMMON, highSpeed.getWagonType());
    }

    @Test(expected = IllegalHighSpeedTrainWagonTypeTypeException.class)
    public void setWagonTypeByNull() throws IllegalHighSpeedTrainWagonTypeTypeException {

        highSpeed.setWagonType(null);
    }
}