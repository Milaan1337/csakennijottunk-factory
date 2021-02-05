package csakennijottunk;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyStage;
import hu.csanyzeg.master.MyBaseClasses.Timers.MultiTickTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.MultiTickTimerListener;
import hu.csanyzeg.master.MyBaseClasses.Timers.TickTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.TickTimerListener;
import hu.csanyzeg.master.MyBaseClasses.Timers.Timer;
import hu.csanyzeg.master.MyBaseClasses.UI.MyLabel;

public class FactoryInGameStage extends MyStage {
    ClickListener c1;
    public float time = 0;
    MyLabel pointCounter;
    public int points = 0;
    public int ido = 1;
    public int price = 1000;
    public int factories = 0;
    public int priceupgrade = 500;
    public int pontado = 6;
    public boolean pointupgraded = false;
    public int products = 0;
    public int maxproduct = 200;
    public int getPoints(){
        return points;
    }

    public void setPoints(int points){
        this.points = points;
        pointCounter.setText(getPoints());
    }

    public FactoryInGameStage(MyGame game) {
        super(new ExtendViewport(90, 160), game);
        //Actorok\\
        setCameraResetToCenterOfScreen();
        FactoryActor factoryActor = new FactoryActor(game);
        //addActor(factoryActor);
        BuyButton buyButton = new BuyButton(game);
        buyButton.setPositionCenter(50);
        AdderUpgrade adderUpgrade = new AdderUpgrade(game);
        PointAdderButton pointAdderButton = new PointAdderButton(game);
        addActor(pointAdderButton);
        FactoryShop factoryShop = new FactoryShop(game);
        addActor(factoryShop);
        factoryShop.setX(40);
        factoryShop.setY(40);
        ShopExit shopExit = new ShopExit(game);
        shopExit.setX(40);
        shopExit.setY(40);
        //Actorok\\

        //Labelek\\
        pointCounter = new MyLabel(game, "Life: ", new PointCounter(game));
        addActor(pointCounter);
        pointCounter.setFontScale(0.3f);
        pointCounter.setPositionCenter(80);
        pointCounter.setFontScale(0.3f);
        pointCounter.setAlignment(2);


        //Labelek\\

        //Money timer\\
            addTimer(new TickTimer(1, true, new TickTimerListener() {
                @Override
                public void onTick(Timer sender, float correction) {
                    super.onTick(sender, correction);
                    if (pointupgraded == false) {
                        setPoints(getPoints() + 60);
                    }
                    else{
                        setPoints(getPoints() + 120);
                    }
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
                    pointupgraded = true;
                    adderUpgrade.remove();
                    System.out.println("Köszi a vásárlást");
                }
                else {

                    System.out.println("Nincs pénzed");

                }
            }
        });


        pointAdderButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                    setPoints(getPoints() + 5);
            }
        });

        factoryShop.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                if (factories == 0) {
                    addActor(buyButton);
                }
                addActor(adderUpgrade);
                addActor(shopExit);
                factoryShop.remove();
            }
        });

        shopExit.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                buyButton.remove();
                adderUpgrade.remove();
                shopExit.remove();
                addActor(factoryShop);
            }
        });



        factoryActor.addListener(c1 = new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
               addTimer(new MultiTickTimer(1, pontado, new MultiTickTimerListener(){
                   @Override
                   public void onTick(MultiTickTimer sender, float correction, int count) {
                       super.onTick(sender, correction, count);
                       time = time + 1;
                       Gdx.app.log("FACTORY ACTOR", String.valueOf(6 - time));
                   }

                   @Override
                   public void onStop(MultiTickTimer sender) {
                       super.onStop(sender);


                   }
               }));
            }
        });

        //Click listener\\




    }
}
