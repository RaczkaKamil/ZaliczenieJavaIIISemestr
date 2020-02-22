package sample;

import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

class BlockScene{
    Rectangle rect = new Rectangle();
    Scene scene;
    double width;
    double height;
    double localX;
    Block block;
    Color color;
    Group group;
    TranslateTransition tt = new TranslateTransition();
    BlockScene(Block block){
        this.block = block;
        this.localX = block.localX;
     this.width = block.width;
     this.height = block.heigh;
     this.color = block.color;
     this.group = block.group;
     this.scene = block.scene;
     scene.setFill(Color.GRAY);
        System.out.println("KONCOWY KOLOR: "+ block.color);
        rect.setWidth(this.width);
        rect.setHeight(this.height);
        rect.setFill(this.color);
        group.getChildren().add(rect);
        redraw();


        }
    public void redraw() {
        Thread thread = new Thread(() -> {

            double locX=scene.getWidth() / 2 - (width / 2 );
            double locY=scene.getHeight() / 2 - height/2;
            rect.setTranslateX(locX);
            rect.setTranslateY(locY);

            tt.setFromX(rect.getTranslateX());
            tt.setToX(rect.getTranslateX() + localX);
            tt.setDuration(Duration.millis(1000));
            tt.setNode(rect);
            tt.play();

        });
        thread.start();

      }



        }