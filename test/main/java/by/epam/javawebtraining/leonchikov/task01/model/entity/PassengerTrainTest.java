package by.epam.javawebtraining.leonchikov.task01.model.entity;

import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalPassengerTrainValueException;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerTrainTest {

    private PassengerTrain passenger = new PassengerTrain("First", 10, 20, Train.TrainType.PASSENGER, 200);

    @Test
    public void getPassengerValue() {

        assertEquals(200, passenger.getPassengerValue());
    }


    @Test
    public void setPassengerValue() throws IllegalPassengerTrainValueException {

        passenger.setPassengerValue(300);

        assertEquals(300, passenger.getPassengerValue());
    }

    @Test(expected = IllegalPassengerTrainValueException.class)
    public void setPassengerValueBelowZero() throws IllegalPassengerTrainValueException {

        passenger.setPassengerValue(-20);
    }

}