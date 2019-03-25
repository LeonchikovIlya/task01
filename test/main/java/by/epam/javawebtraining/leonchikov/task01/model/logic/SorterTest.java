package by.epam.javawebtraining.leonchikov.task01.model.logic;

import by.epam.javawebtraining.leonchikov.task01.model.TrainAdd;
import by.epam.javawebtraining.leonchikov.task01.model.container.RailwayStation;
import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalTrainMaxSpeedException;
import by.epam.javawebtraining.leonchikov.task01.model.entity.Train;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Ilya Leonchikov
 * @version 1.0 20 Feb 2019
 */
public class SorterTest {

    private static RailwayStation railwayStation;
    private static RailwayStation emptyRailwayStation = new RailwayStation();
    private static Train[] trains;

    @BeforeClass
    public static void init() throws IllegalTrainMaxSpeedException {

        railwayStation = TrainAdd.createTrains();

        railwayStation.getTrainArray()[3].setMaxSpeed(100);

        trains = new Train[railwayStation.getCurrentTrainCount()];
        trains[0] = railwayStation.getTrainArray()[0];
        trains[1] = railwayStation.getTrainArray()[1];
        trains[2] = railwayStation.getTrainArray()[2];
        trains[3] = railwayStation.getTrainArray()[3];
        trains[4] = railwayStation.getTrainArray()[4];
    }

    @Test
    public void bySpeed() {
        assertEquals(new Train[]{trains[4], trains[2], trains[3], trains[1], trains[0]}
                , Sorter.bySpeed(railwayStation));
    }

    @Test
    public void bySpeedByNull() {
        assertNull(Sorter.bySpeed(null));
    }

    @Test
    public void bySpeedByEmptyRw() {
        assertNull(Sorter.bySpeed(emptyRailwayStation));
    }

    @Test
    public void byName() {
        assertEquals(new Train[]{trains[4], trains[0], trains[3], trains[1], trains[2]}
                , Sorter.byName(railwayStation));
    }

    @Test
    public void byNameByNull() {
        assertNull(Sorter.byName(null));
    }

    @Test
    public void byNameByEmptyRw() {
        assertNull(Sorter.byName(emptyRailwayStation));
    }

    @Test
    public void byWagon() {
        assertEquals(new Train[]{trains[0], trains[2], trains[3], trains[4], trains[1]}
                , Sorter.byWagon(railwayStation));
    }

    @Test
    public void byWagonByNull() {
        assertNull(Sorter.byWagon(null));
    }

    @Test
    public void byWagonByEmptyRw() {
        assertNull(Sorter.byWagon(emptyRailwayStation));
    }

    @Test
    public void bySpeedAndWagon() {
        assertEquals(new Train[]{trains[4], trains[2], trains[3], trains[1], trains[0]}
                , Sorter.bySpeedAndWagon(railwayStation));
    }

    @Test
    public void bySpeedAndWagonByNull() {
        assertNull(Sorter.bySpeedAndWagon(null));
    }

    @Test
    public void bySpeedAndWagonByEmptyRw() {
        assertNull(Sorter.bySpeedAndWagon(emptyRailwayStation));
    }
}