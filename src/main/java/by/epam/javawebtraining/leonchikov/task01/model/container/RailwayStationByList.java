package by.epam.javawebtraining.leonchikov.task01.model.container;

import by.epam.javawebtraining.leonchikov.task01.model.entity.Train;
import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.NoPlaceInRwException;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public class RailwayStationByList implements RailwayStationInterface<List<Train>> {

    private static final int MAX_CAPACITY = 25;

    private List<Train> trainList;

    public RailwayStationByList() {
        trainList = new LinkedList<>();
    }

    public RailwayStationByList(RailwayStationByList rw) {
        this.trainList = rw.trainList;
    }

    @Override
    public List<Train> getTrainArray() {
        return trainList;
    }

    @Override
    public int getCurrentTrainCount() {
        return trainList.size();
    }

    @Override
    public void addTrain(Train train) {

        if (trainList.size() < MAX_CAPACITY) {
            if (train != null) {
                trainList.add(train);
            }
        } else {
            try {
                throw new NoPlaceInRwException();
            } catch (NoPlaceInRwException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void removeTrain(Train train) {
        if (train != null) {
            trainList.remove(train);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RailwayStationByList that = (RailwayStationByList) o;
        return Objects.equals(trainList, that.trainList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainList);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("TrainArray:\n");

        for (Train aTrainArray : trainList) {
            builder.append(aTrainArray).append("\n");
        }
        return builder + "";
    }
}
