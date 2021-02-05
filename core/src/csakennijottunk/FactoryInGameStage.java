package csakennijottunk;

import com.badlogic.gdx.utils.viewport.ExtendViewport;

import java.awt.Point;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyStage;
import hu.csanyzeg.master.MyBaseClasses.Timers.MultiTickTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.MultiTickTimerListener;
import hu.csanyzeg.master.MyBaseClasses.Timers.OneTickTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.OneTickTimerListener;
import hu.csanyzeg.master.MyBaseClasses.Timers.PermanentTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.PermanentTimerListener;
import hu.csanyzeg.master.MyBaseClasses.Timers.TickTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.TickTimerListener;
import hu.csanyzeg.master.MyBaseClasses.Timers.Timer;
import hu.csanyzeg.master.MyBaseClasses.UI.MyLabel;

public class FactoryInGameStage extends MyStage {
    MyLabel pointCounter;
    AdderUpgrade adderUpgrade;
    public int points = 0;
    public float ido = 1f;
    public int getPoints(){
        return points;
    }

    public void setPoints(int points){
        this.points = points;
        pointCounter.setText(getPoints());
    }

    public FactoryInGameStage(MyGame game) {
        super(new ExtendViewport(90,160), game);

        FactoryActor factoryActor = new FactoryActor(game);
        addActor(factoryActor);
        addActor(new AdderUpgrade(game));

        //Labelek\\
        pointCounter = new MyLabel(game, "Life: ", new PointCounter(game));
        addActor(pointCounter);
        pointCounter.setFontScale(0.3f);
        pointCounter.setPositionCenter(-25);
        pointCounter.setFontScale(0.3f);
        pointCounter.setAlignment(2);
        //Labelek\\

        //Money timer\\
        addTimer(new TickTimer(1,true,new TickTimerListener(){
            @Override
            public void onTick(Timer sender, float correction) {
                super.onTick(sender, correction);
                setPoints(getPoints() + 60);
                System.out.println(getPoints());
            }

            @Override
            public void onStop(Timer sender) {
                super.onStop(sender);
            }

            @Override
            public void onStart(Timer sender) {
                super.onStart(sender);
            }
        }

        ));
        //Money timer\\


    }
}
