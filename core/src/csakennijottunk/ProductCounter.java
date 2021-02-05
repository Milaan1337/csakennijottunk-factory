package csakennijottunk;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;

public class ProductCounter extends Label.LabelStyle {
    public ProductCounter(MyGame game) {
        super(game.getMyAssetManager().getFont("Factory/font-factory.ttf"), Color.YELLOW);
    }
}
