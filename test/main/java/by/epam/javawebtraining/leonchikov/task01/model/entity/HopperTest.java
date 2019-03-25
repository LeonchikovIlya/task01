package by.epam.javawebtraining.leonchikov.task01.model.entity;

import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalHopperMaterialTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

public class HopperTest {

    private Hopper hopper = new Hopper("First", 10, 20, Train.TrainType.HOPPER, 200, Hopper.Material.LOOSE);

    @Test
    public void getMaterial() {

        assertEquals(Hopper.Material.LOOSE, hopper.getMaterial());
    }


    @Test
    public void setMaterial() throws IllegalHopperMaterialTypeException {

        hopper.setMaterial(Hopper.Material.SINGLE_PEACE);

        assertEquals(Hopper.Material.SINGLE_PEACE, hopper.getMaterial());
    }

    @Test(expected = IllegalHopperMaterialTypeException.class)
    public void setMaterialByZero() throws IllegalHopperMaterialTypeException {

        hopper.setMaterial(null);
    }
}