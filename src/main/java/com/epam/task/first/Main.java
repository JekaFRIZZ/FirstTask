package com.epam.task.first;

import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArrayLogic;
import com.epam.task.first.view.ArrayPrinter;
import com.epam.task.first.view.ConsoleArrayPrinter;


public class Main {

    public static void main(String[] args) {

        Array array = new Array(1,5,7);
        ArrayLogic arrayLogic = new ArrayLogic();

        ArrayPrinter printer = new ConsoleArrayPrinter();
        printer.print(array);

        System.out.println(arrayLogic.findAverageValue(array));
    }
}
