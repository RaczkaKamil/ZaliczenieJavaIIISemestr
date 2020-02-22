package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Block {
    Scene scene;
    Group group;
    double width = 50;
    double heigh = 50;
    double localX = 50;
    Color color;
    Block block;

    public Block(Group group, Scene scene, double localX, double width, double heigh) {
        this.group = group;
        this.scene = scene;
        this.localX = localX;
        this.width = width;
        this.heigh = heigh;
        this.color = Color.RED;
    }

    public Block() {
    }
public Block setColorAndGetBlock(Color color){
        this.color = color;
        return  block;
}

    public Color getColor() {
        return this.color;
    }
}
