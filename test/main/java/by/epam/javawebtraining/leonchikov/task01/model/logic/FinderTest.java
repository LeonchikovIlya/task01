package by.epam.javawebtraining.leonchikov.task01.model.logic;

import by.epam.javawebtraining.leonchikov.task01.model.TrainAdd;
import by.epam.javawebtraining.leonchikov.task01.model.container.RailwayStation;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Ilya Leonchikov
 * @version 1.0 20 Feb 2019
 */
public class FinderTest {

    private static RailwayStation railwayStation;
    private static RailwayStation emptyRailwayStation = new RailwayStation();;

    @BeforeClass
    public static void init() {

        railwayStation = TrainAdd.createTrains();
    }

    @Test
    public void fastestTrain() {
        assertEquals(railwayStation.getTrainArray()[4], Finder.fastestTrain(railwayStation));
    }

    @Test
    public void fastestTrainByNull() {
        assertNull(Finder.fastestTrain(null));
    }

    @Test
    public void fastestTrainInEmptyRw() {
        assertNull(Finder.fastestTrain(emptyRailwayStation));
    }

    @Test
    public void indexOfFastestTrain() {
        assertEquals(4, Finder.indexOfFastestTrain(railwayStation));
    }

    @Test
    public void indexOfFastestTrainByNull() {
        assertEquals(-1,Finder.indexOfFastestTrain(null));
    }

    @Test
    public void indexOfFastestTrainInEmptyRw() {
        assertEquals(-1,Finder.indexOfFastestTrain(emptyRailwayStation));
    }

    @Test
    public void slowestTrain() {
        assertEquals(railwayStation.getTrainArray()[0], Finder.slowestTrain(railwayStation));
    }

    @Test
    public void slowestTrainByNull() {
        assertNull(Finder.slowestTrain(null));
    }

    @Test
    public void slowestTrainInEmptyRw() {
        assertNull(Finder.slowestTrain(emptyRailwayStation));
    }

    @Test
    public void indexOfSlowestTrain() {
        assertEquals(0, Finder.indexOfSlowestTrain(railwayStation));
    }

    @Test
    public void indexOfSlowestTrainByNull() {
        assertEquals(-1,Finder.indexOfSlowestTrain(null));

    }

    @Test
    public void indexOfSlowestTrainInEmptyRw() {
        assertEquals(-1,Finder.indexOfSlowestTrain(emptyRailwayStation));
    }
}