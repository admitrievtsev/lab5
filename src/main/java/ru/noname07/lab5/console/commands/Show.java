package ru.noname07.lab5.console.commands;

import ru.noname07.lab5.collection.CollectionManager;
import ru.noname07.lab5.utils.Printer;

public class Show extends Command {

    public Show() {
        super("show", "display all elements of the collection");
    }

    @Override
    public void execute() { // TODO ???
        Printer.printCollection(CollectionManager.getCollection());
    }

    
}