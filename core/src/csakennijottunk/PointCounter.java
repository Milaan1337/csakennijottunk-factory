package csakennijottunk;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;

public class PointCounter extends Label.LabelStyle {
    public PointCounter(MyGame game) {
        super(game.getMyAssetManager().getFont("Factory/font-factory.ttf"), Color.GREEN);
    }
}
