package ru.noname07.lab5.console.commands;

import ru.noname07.lab5.collection.CollectionManager;

public class UpdateID extends Command {

    public UpdateID() {
        super("update", "update the value of collection element by id");
        //TODO Auto-generated constructor stub
    }

    @Override
    public void execute(String[] args) { // TODO
        if (!CollectionManager.getCollection().isEmpty()) {
            super.execute(args);
        } else {System.err.println("Error: Collection is empty.");}
    }

    
}
