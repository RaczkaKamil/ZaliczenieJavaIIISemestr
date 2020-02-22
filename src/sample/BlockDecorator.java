package sample;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;


public class BlockDecorator extends Block  {
   final Block baseBlock;
    List<Color> list = new ArrayList<>();
    int number;

    public List<Color> setUpList() {
        list.add(Color.BLUE);
        list.add(Color.CYAN);
        list.add(Color.DARKORANGE);
        list.add(Color.DARKKHAKI);
        list.add(Color.GREEN);
        return list;
    }

    public BlockDecorator(Block baseBlock, int number) {
        setUpList();
        this.number = number;
     this.baseBlock = baseBlock;
     this.baseBlock.setColorAndGetBlock(getColor());


    }

    @Override
        public Color getColor()
    {
        System.out.println("KOLOR Z LISTY: "+list.get(this.number));
        return list.get(this.number);
    }


}
