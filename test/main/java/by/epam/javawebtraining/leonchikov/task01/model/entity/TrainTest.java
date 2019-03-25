package by.epam.javawebtraining.leonchikov.task01.model.entity;

import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalTrainMaxSpeedException;
import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalTrainNameException;
import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalTrainTypeException;
import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalTrainWagonNumberException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainTest {

    private Train train = new Train("First", 10, 20, Train.TrainType.UNKNOWN, 200);

    @Test
    public void getName() {

        assertEquals("First", train.getName());
    }

    @Test
    public void setName() throws IllegalTrainNameException {

        train.setName("Other one");

        assertEquals("Other one",train.getName());
    }

    @Test(expected = IllegalTrainNameException.class)
    public void setNameByNull() throws IllegalTrainNameException {

        train.setName(null);
    }

    @Test
    public void getMaxSpeed() {

        assertEquals(10, train.getMaxSpeed());
    }

    @Test
    public void setMaxSpeed() throws IllegalTrainMaxSpeedException {

        train.setMaxSpeed(50);

        assertEquals(50,train.getMaxSpeed());
    }

    @Test(expected = IllegalTrainMaxSpeedException.class)
    public void setMaxSpeedBelowZero() throws IllegalTrainMaxSpeedException {

        train.setMaxSpeed(-100);
    }

    @Test
    public void getWagonNumber() {

        assertEquals(20, train.getWagonNumber());
    }

    @Test
    public void setWagonNumber() throws IllegalTrainWagonNumberException {

        train.setWagonNumber(500);

        assertEquals(500,train.getWagonNumber());
    }

    @Test(expected = IllegalTrainWagonNumberException.class)
    public void setWagonNumberBelowZero() throws IllegalTrainWagonNumberException {

        train.setWagonNumber(-100);
    }

    @Test
    public void getTrainType() {

        assertEquals(Train.TrainType.PASSENGER, train.getTrainType());
    }

    @Test
    public void setTrainType() throws IllegalTrainTypeException {

        train.setTrainType(Train.TrainType.FREIGHT);

        assertEquals(Train.TrainType.FREIGHT,train.getTrainType());
    }

    @Test(expected = IllegalTrainTypeException.class)
    public void setTrainTypeByNull() throws IllegalTrainTypeException {
            train.setTrainType(null);
    }
}