package csakennijottunk;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyStage;
import hu.csanyzeg.master.MyBaseClasses.UI.MyLabel;

public class FactoryCreditStage extends MyStage {
    BackButton backButton;
    ClickListener c1;
    public FactoryCreditStage(MyGame game) {
            super(new ExtendViewport(90, 160), game);
            addBackButtonScreenBackByStackPopListener();
            setCameraResetToCenterOfScreen();
            Label.LabelStyle labelStyle = new Label.LabelStyle();
            labelStyle.font = game.getMyAssetManager().getFont("Factory/font-factory.ttf");

        MyLabel label = new MyLabel(game, "Creators:", labelStyle);
        label.setFontScale(0.2f);
        label.setPosition(20, 135);
        addActor(label);

        label = new MyLabel(game, "Fellner Milan", labelStyle);
        label.setFontScale(0.2f);
        label.setPosition(20, 120);
        addActor(label);

        label = new MyLabel(game, "Kancsal Mate", labelStyle);
        label.setFontScale(0.2f);
        label.setPosition(20, 110);
        addActor(label);

        label = new MyLabel(game, "Kele Lorand", labelStyle);
        label.setFontScale(0.2f);
        label.setPosition(20, 100);
        addActor(label);

        label = new MyLabel(game, "Zsebok David Ferenc", labelStyle);
        label.setFontScale(0.2f);
        label.setPosition(20, 90);
        addActor(label);

        label = new MyLabel(game, "Teacher:", labelStyle);
        label.setFontScale(0.2f);
        label.setPosition(20, 75);
        addActor(label);

        label = new MyLabel(game, "Tuske Balazs", labelStyle);
        label.setFontScale(0.2f);
        label.setPosition(20, 60);
        addActor(label);

            backButton = new BackButton(game);
            backButton.setPosition(0, 0);
            backButton.setSize(15, 15);
            addActor(backButton);

        }
    }

