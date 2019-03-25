package by.epam.javawebtraining.leonchikov.task01.model.container;

import by.epam.javawebtraining.leonchikov.task01.model.entity.Train;
import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.NoPlaceInRwException;

public interface RailwayStationInterface<T> {

    T getTrainArray();

    int getCurrentTrainCount();

    void addTrain(Train train) throws NoPlaceInRwException;

    void removeTrain(Train train);

}
