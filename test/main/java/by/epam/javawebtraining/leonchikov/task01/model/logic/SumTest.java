package by.epam.javawebtraining.leonchikov.task01.model.logic;


import by.epam.javawebtraining.leonchikov.task01.model.TrainAdd;
import by.epam.javawebtraining.leonchikov.task01.model.container.RailwayStation;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Ilya Leonchikov
 * @version 1.0 20 Feb 2019
 */
public class SumTest {

    private static RailwayStation railwayStation;
    private static RailwayStation emptyRailwayStation = new RailwayStation();;

    @BeforeClass
    public static void init() {

        railwayStation = TrainAdd.createTrains();
    }

    @Test
    public void trainPassenger() {
        assertEquals(4, Sum.trainPassenger(railwayStation));
    }

    @Test
    public void trainPassengerByNull() {
        assertEquals(-1,Sum.trainPassenger(null));
    }

    @Test
    public void trainPassengerByEmptyRw() {
        assertEquals(-1, Sum.trainPassenger(emptyRailwayStation));
    }

    @Test
    public void trainWagon() {
        assertEquals(84, Sum.trainWagon(railwayStation));
    }

    @Test
    public void trainWagonByNull() {
        assertEquals(-1,Sum.trainWagon(null));
    }

    @Test
    public void trainWagonByEmptyRw() {
        assertEquals(-1, Sum.trainWagon(emptyRailwayStation));
    }
}