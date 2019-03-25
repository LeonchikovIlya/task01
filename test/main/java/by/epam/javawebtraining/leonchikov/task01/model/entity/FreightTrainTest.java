package by.epam.javawebtraining.leonchikov.task01.model.entity;

import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalFreightTrainValueException;
import org.junit.Test;

import static org.junit.Assert.*;

public class FreightTrainTest {

    private FreightTrain freight = new FreightTrain("First", 10, 20, Train.TrainType.FREIGHT, 200);

    @Test
    public void getFreightValue() {

        assertEquals(200, freight.getFreightValue());
    }


    @Test
    public void setFreightValue() throws IllegalFreightTrainValueException {

        freight.setFreightValue(10);

        assertEquals(10, freight.getFreightValue());
    }

    @Test(expected = IllegalFreightTrainValueException.class)
    public void setFreightValueBelowZero() throws IllegalFreightTrainValueException {

        freight.setFreightValue(-20);
    }

    @Test (expected = ClassCastException.class)
    public void equalsOtherClass() {
        PassengerTrain other = new PassengerTrain("First", 10, 20, Train.TrainType.FREIGHT, 200);
        freight.equals(other);
    }

    @Test
    public void equalsTheSameObject() {
        assertTrue(freight.equals(freight));
    }

    @Test
    public void equalsNullObject() {
        assertFalse(freight.equals(null));
    }

    @Test
    public void equalsWithOherParametrs() {
        FreightTrain other = new FreightTrain("Other", 100, 20, Train.TrainType.FREIGHT, 200);
        assertFalse(freight.equals(other));
    }
}