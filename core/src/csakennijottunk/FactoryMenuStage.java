package csakennijottunk;

import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import javax.sound.sampled.Line;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyStage;

public class FactoryMenuStage extends MyStage {
    StartButton startButton;
    InfoButton infoButton;
    CreditButton creditButton;
    ExitButton exitButton;
    public FactoryMenuStage(MyGame game) {
        super(new ExtendViewport(90,160), game);
        setCameraResetToCenterOfScreen();
        addBackButtonScreenBackByStackPopListener();

        startButton = new StartButton(game);
        startButton.setPosition(20, 80 );
        startButton.setSize(15, 15);
        addActor(startButton);

        exitButton = new ExitButton(game);
        exitButton.setPosition(20, 60);
        exitButton.setSize(15, 15);
        addActor(exitButton);

        creditButton = new CreditButton(game);
        creditButton.setPosition(20, 40);
        creditButton.setSize(15, 15);
        addActor(creditButton);

        infoButton = new InfoButton(game);
        infoButton.setPosition(20, 20);
        infoButton.setSize(15, 15);
        addActor(infoButton);





    }

}
