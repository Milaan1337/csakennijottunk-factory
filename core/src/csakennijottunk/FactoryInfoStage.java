package csakennijottunk;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyStage;
import hu.csanyzeg.master.MyBaseClasses.UI.MyLabel;

public class FactoryInfoStage extends MyStage {
    ClickListener c1;
    BackButton backButton;
    public FactoryInfoStage(MyGame game) {
        super(new ExtendViewport(90, 160), game);
        setCameraResetToCenterOfScreen();
        addBackButtonScreenBackByStackPopListener();
        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.font= game.getMyAssetManager().getFont("Factory/font-factory.ttf");
        labelStyle.fontColor = Color.LIGHT_GRAY;

        MyLabel label = new MyLabel(game, "Basics:", labelStyle);
        label.setFontScale(0.20f);
        label.setPosition(5, 140);
        addActor(label);

        label = new MyLabel(game, "Make products and sell ", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 130);
        addActor(label);

        label = new MyLabel(game, "them for money, you can steal", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 125);
        addActor(label);

        label = new MyLabel(game, "products by pressing the steal", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 120);
        addActor(label);

        label = new MyLabel(game, "button, and you can sell your", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 115);
        addActor(label);

        label = new MyLabel(game, "products by clicking on the", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 110);
        addActor(label);

        label = new MyLabel(game, "warehouse", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 105);
        addActor(label);

        label = new MyLabel(game, "Upgrades and factory", labelStyle);
        label.setFontScale(0.20f);
        label.setPosition(5, 95);
        addActor(label);

        label = new MyLabel(game, "purchase:", labelStyle);
        label.setFontScale(0.20f);
        label.setPosition(5, 88);
        addActor(label);

        label = new MyLabel(game, "You can buy factories and", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 75);
        addActor(label);

        label = new MyLabel(game, "upgrades by clicking on the", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 70);
        addActor(label);

        label = new MyLabel(game, "shop icon.", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 65);
        addActor(label);

        label = new MyLabel(game, "The goal is to earn 100 000 Coins.", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 60);
        addActor(label);

        label = new MyLabel(game, "Good luck and have a great fun!", labelStyle);
        label.setFontScale(0.15f);
        label.setPosition(5, 55);
        addActor(label);

        backButton = new BackButton(game);
        backButton.setSize(30, 30);
        backButton.setPosition(0, 0);
        addActor(backButton);


    }
}
