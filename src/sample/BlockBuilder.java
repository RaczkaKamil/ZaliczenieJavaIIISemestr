package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class BlockBuilder {
    Color color;
    Block block;



    public BlockBuilder(Block block) {
        this.block = block;
    }

    BlockScene build(){
        return new BlockScene(block);
    }

}
