package by.epam.javawebtraining.leonchikov.task01.model.container;

import by.epam.javawebtraining.leonchikov.task01.model.TrainAdd;
import by.epam.javawebtraining.leonchikov.task01.model.entity.Train;
import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalRwCapacityException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RailwayStationTest {

    private static RailwayStation railwayStation;
    private static Train[] trains;


    @BeforeClass
    public static void init() {
        railwayStation = TrainAdd.createTrains();
        trains = new Train[railwayStation.getCurrentTrainCount()];

        trains[0] = railwayStation.getTrainArray()[0];
        trains[1] = railwayStation.getTrainArray()[1];
        trains[2] = railwayStation.getTrainArray()[2];
        trains[3] = railwayStation.getTrainArray()[3];
        trains[4] = railwayStation.getTrainArray()[4];
    }

    @Test
    public void getCapacity() {
        assertEquals(5, railwayStation.getCapacity());
    }

    @Test
    public void setCapacity() throws IllegalRwCapacityException {
        assertEquals(5, railwayStation.setCapacity(5));
    }

    @Test(expected = IllegalRwCapacityException.class)
    public void setCapacityIllegal() throws IllegalRwCapacityException {
        railwayStation.setCapacity(26);
    }

    @Test
    public void getTrainArray() {
        assertEquals(new Train[]{trains[0], trains[1], trains[2], trains[3], trains[4]}
                , railwayStation.getTrainArray());
    }

    @Test
    public void getCurrentTrainCount() {
        assertEquals(5, railwayStation.getCurrentTrainCount());
    }

    @Test
    public void addTrain() {
        RailwayStation railwayStationForAdd = new RailwayStation();
        railwayStationForAdd.addTrain(trains[0]);
        assertEquals(new Train[]{trains[0]}, railwayStationForAdd.getTrainArray());
    }

    @Test
    public void removeTrain() {
        RailwayStation railwayStationToRemove = new RailwayStation();
        railwayStationToRemove.addTrain(trains[0]);
        railwayStationToRemove.addTrain(trains[1]);
        railwayStationToRemove.addTrain(trains[2]);
        railwayStationToRemove.addTrain(trains[3]);
        railwayStationToRemove.removeTrain(trains[1]);
        assertEquals(new Train[]{trains[0], trains[2], trains[3]}, railwayStationToRemove.getTrainArray());
    }

}