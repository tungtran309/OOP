package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DataModel dataModel = new DataModel();
        dataModel.createData();

        Interface screen = new Interface();
        screen.menu();
    }
}
