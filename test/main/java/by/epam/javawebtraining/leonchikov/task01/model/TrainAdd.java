package by.epam.javawebtraining.leonchikov.task01.model;

import by.epam.javawebtraining.leonchikov.task01.model.container.RailwayStation;
import by.epam.javawebtraining.leonchikov.task01.model.entity.HighSpeedTrain;
import by.epam.javawebtraining.leonchikov.task01.model.entity.Hopper;
import by.epam.javawebtraining.leonchikov.task01.model.entity.PassengerTrain;
import by.epam.javawebtraining.leonchikov.task01.model.entity.Train;

/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public class TrainAdd {

    public static RailwayStation createTrains() {

        RailwayStation railwayStation = new RailwayStation();

        railwayStation.addTrain(new PassengerTrain("First", 10, 20, Train.TrainType.PASSENGER, 200));

        railwayStation.addTrain(new Hopper("Second", 50, 10, Train.TrainType.HOPPER, 200, Hopper.Material.LOOSE));

        railwayStation.addTrain(new PassengerTrain("Third", 100, 19, Train.TrainType.PASSENGER, 200));

        railwayStation.addTrain(new PassengerTrain("Fourth", 150, 18, Train.TrainType.PASSENGER, 200));

        railwayStation.addTrain(new HighSpeedTrain("Fifth", 300, 17, Train.TrainType.HIGHSPEED, 200
                , HighSpeedTrain.WagonType.FIRST_CLASS));

        return railwayStation;
    }
}
