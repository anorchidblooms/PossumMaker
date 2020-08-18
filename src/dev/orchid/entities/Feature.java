package dev.orchid.entities;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Feature {
    String name;
    //Image sheet;
    Image image;
    Image mask;
    ImageView view;
    Color userColor;

    public Feature(String name){
        getType(name);
    }

    private void getType(String name) {
        if(name.equals("body")){
            this.name=name;
            String shortcut =name+".png";
            this.image = new Image(String.format("%s.png",shortcut));
            this.mask = new Image(String.format("m%s.png", shortcut));
        }
        //else if(name.equals("body"))
    }

}
