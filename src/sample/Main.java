package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {
    int numberOfColor=0;
    double localX =0;
    Scene scene;
    Group group;
    double width = 50;
    double heigh = 50;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        group = new Group();
        scene = new Scene(group, 500, 500);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();

        Block block = new Block(group,scene,localX,width,heigh);
        System.out.println("BLOK1: "+block.getColor());
        BlockBuilder sb = new BlockBuilder(block);
        BlockScene blockScene = sb.build();
        scene.setOnKeyPressed(eventKeyPressed);



    }

    EventHandler<KeyEvent> eventKeyPressed = new EventHandler<KeyEvent>() {

        @Override
        public void handle(KeyEvent event) {
            if (event.getCode() == KeyCode.SPACE) {

                double finalLocalX = localX + 60;
                double finalHeigh = heigh /2;
                double finalWidth = width /2;
                Block block = new Block(group,scene,finalLocalX,finalWidth,finalHeigh);
                Block block2 = new Block(group,scene,-finalLocalX,finalWidth,finalHeigh);
               BlockDecorator blockDecorator = new BlockDecorator(block,numberOfColor);
               BlockDecorator blockDecorator2 = new BlockDecorator(block2,numberOfColor);
                BlockBuilder sb = new BlockBuilder(blockDecorator.baseBlock);
                BlockBuilder sb2 = new BlockBuilder(blockDecorator2.baseBlock);
                BlockScene blockScener = sb.build();
                BlockScene blockScener2 = sb2.build();
               // BlockBuilder sb = new BlockBuilder(group,scene,finalLocalX,finalWidth,finalHeigh);
                //BlockScene blockScene = sb.build();
               // BlockBuilder sbn = new BlockBuilder(group,scene,-finalLocalX,finalWidth,finalHeigh);
               // BlockScene blockScenee = sbn.build();

                localX = finalLocalX;
                width=finalWidth;
                heigh = finalHeigh;
                System.out.println("NUMER "+numberOfColor);
              numberOfColor++;
            }
        }
    };


    public static void main(String[] args) {
        launch(args);
    }
}
