package by.epam.javawebtraining.leonchikov.task01.controller;


import by.epam.javawebtraining.leonchikov.task01.model.entity.consts.EntityConsts;
import by.epam.javawebtraining.leonchikov.task01.model.exception.logicException.IllegalHopperMaterialTypeException;
import by.epam.javawebtraining.leonchikov.task01.model.logic.Finder;
import by.epam.javawebtraining.leonchikov.task01.model.logic.Sorter;
import by.epam.javawebtraining.leonchikov.task01.model.logic.Sum;
import by.epam.javawebtraining.leonchikov.task01.util.Parser.Parser;
import by.epam.javawebtraining.leonchikov.task01.util.Reader.Reader;
import by.epam.javawebtraining.leonchikov.task01.util.Serializator.TrainSerializator;
import mycollections.MyArrayList;
import by.epam.javawebtraining.leonchikov.task01.model.container.RailwayStation;
import by.epam.javawebtraining.leonchikov.task01.model.entity.*;
import by.epam.javawebtraining.leonchikov.task01.view.Printable;
import by.epam.javawebtraining.leonchikov.task01.view.Printer;
import mycollections.MyLinkedList;
import org.apache.log4j.Logger;

import java.util.Locale;

/**
 * @author Ilya Leonchikov
 * @version 1.0 14 Feb 2019
 */
public class Controller {

    public static final Logger logger = Logger.getRootLogger();

    public static void main(String[] args) {

        RailwayStation railwayStation = new RailwayStation();

        System.out.println(Sorter.bySpeed(railwayStation));

        PassengerTrain train1 = new PassengerTrain("First", 10, 20, Train.TrainType.PASSENGER, 200);
        Hopper train2 = new Hopper("Second", 50, 10, Train.TrainType.HOPPER, 200, Hopper.Material.LOOSE);
        PassengerTrain train3 = new PassengerTrain("Third", 100, 15, Train.TrainType.PASSENGER, 200);
        PassengerTrain train4 = new PassengerTrain("Fourth", 150, 15, Train.TrainType.PASSENGER, 200);
        HighSpeedTrain train5 = new HighSpeedTrain("Fifth", 300, 15, Train.TrainType.HIGHSPEED, 200
                , HighSpeedTrain.WagonType.FIRST_CLASS);
        HighSpeedTrain train6 = new HighSpeedTrain("Six", 200, 15, Train.TrainType.HIGHSPEED, 200
                , HighSpeedTrain.WagonType.FIRST_CLASS);

        Printable FilePrinter = Printer.createPrinter(Printer.Type.FILE);
        Printable ConsolePrinter = Printer.createPrinter(Printer.Type.CONSOLE);

        railwayStation.addTrain(train1);
        railwayStation.addTrain(train2);
        Locale locale = new Locale("ru", "RU");
        Locale locale1 = new Locale("en", "UK");
        EntityConsts.changeLocale(locale);


        RailwayStation railwayStation2 = new RailwayStation(railwayStation);

//        ConsolePrinter.print(Reader.readFromFile("C:\\Users\\User\\IdeaProjects\\Pro\\src"
//                + "\\main\\java\\by\\epam\\javawebtraining\\leonchikov\\task01\\util\\input\\input"));


        ConsolePrinter.print(Parser.totalTrainListFromFile("C:\\Users\\User\\IdeaProjects\\Pro\\src"
                + "\\main\\java\\by\\epam\\javawebtraining\\leonchikov\\task01\\util\\input\\input"));
/*

        TrainSerializator.write(train5,"C:\\Users\\User\\IdeaProjects\\Pro\\src"
                + "\\main\\java\\by\\epam\\javawebtraining\\leonchikov\\task01\\util\\output\\testAutoSerializator");
*/

     /*   ConsolePrinter.print(TrainSerializator.read("C:\\Users\\User\\IdeaProjects\\Pro\\src"
                + "\\main\\java\\by\\epam\\javawebtraining\\leonchikov\\task01\\util\\output\\testAutoSerializator"));*/


    }

}
