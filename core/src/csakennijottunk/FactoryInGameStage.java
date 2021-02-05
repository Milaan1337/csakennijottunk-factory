package csakennijottunk;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
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
    public int points = 0;
    public float ido = 1f;
    public int price = 1000;
    public int factories = 0;
    public int priceupgrade = 500;
    public int getPoints(){
        return points;
    }

    public void setPoints(int points){
        this.points = points;
        pointCounter.setText(getPoints());
    }

    public FactoryInGameStage(MyGame game) {
        super(new ExtendViewport(90,160), game);
        //Actorok\\
        setCameraResetToLeftBottomOfScreen();
        FactoryActor factoryActor = new FactoryActor(game);
        //addActor(factoryActor);
        BuyButton buyButton = new BuyButton(game);
        addActor(buyButton);
        AdderUpgrade adderUpgrade = new AdderUpgrade(game);
        addActor(adderUpgrade);
        //Actorok\\

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
        //Click listenerek\\
        buyButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                if (factories == 0) {

                    if (getPoints() >= price) {
                        setPoints(getPoints() - price);
                        addActor(factoryActor);
                        factories = factories + 1;
                        buyButton.remove();
                        System.out.println(factories);

                    } else {
                        System.out.println("Nincs elég pénz");
                    }
                    }
                }
            });

        adderUpgrade.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                if (getPoints() >= priceupgrade){
                    setPoints(getPoints() - priceupgrade);
                    System.out.println("Köszi a vásárlást");
                }
                else {

                    System.out.println("Nincs pénzed");

                }
            }
        });




    }
}
