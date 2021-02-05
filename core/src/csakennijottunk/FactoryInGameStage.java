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
        addTimer(new MultiTickTimer(ido,9999999, new MultiTickTimerListener(){
            @Override
            public void onTick(MultiTickTimer sender, float correction, int count) {
                super.onTick(sender, correction, count);
                setPoints(getPoints() + 60);
                System.out.println(getPoints());
            }
        }
        //Money timer\\

        ));

    }
}
