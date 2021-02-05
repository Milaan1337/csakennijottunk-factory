package csakennijottunk;

import com.badlogic.gdx.utils.viewport.ExtendViewport;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyStage;
import hu.csanyzeg.master.MyBaseClasses.Timers.MultiTickTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.MultiTickTimerListener;
import hu.csanyzeg.master.MyBaseClasses.Timers.OneTickTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.OneTickTimerListener;
import hu.csanyzeg.master.MyBaseClasses.Timers.PermanentTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.PermanentTimerListener;

public class FactoryInGameStage extends MyStage {
    public int points = 0;

    public int getPoints(){
        return points;
    }

    public void setPoints(int points){
        this.points = points;
    }

    public FactoryInGameStage(MyGame game) {
        super(new ExtendViewport(90,160), game);

        addTimer(new MultiTickTimer(60f,9999999, new MultiTickTimerListener(){
            @Override
            public void onTick(MultiTickTimer sender, float correction, int count) {
                super.onTick(sender, correction, count);
                setPoints(getPoints() + 60);
                System.out.println(getPoints());
            }
        }

        ));

    }
}
