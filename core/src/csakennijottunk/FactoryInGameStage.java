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
    MyLabel productCounter;
    public int points = 0;
    public int ido = 1;
    public int price = 500;
    public int factories = 0;
    public int priceupgrade = 100;
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

    public int getProducts(){
        return products;
    }

    public void setProducts(int products){
        this.products = products;
    }

    public FactoryInGameStage(MyGame game) {
        super(new ExtendViewport(90, 160), game);
        addBackButtonScreenBackByStackPopListener();
        //Actorok\\
        setCameraResetToCenterOfScreen();
        FactoryActor factoryActor = new FactoryActor(game);
        addActor(new InGameBackground(game, 0, 0));
        //addActor(factoryActor);
        BuyButton buyButton = new BuyButton(game);
        BuyButton2 buyButton2 = new BuyButton2(game);
        buyButton.setY(87);
        buyButton.setX(-5);
        buyButton2.setY(87);
        buyButton2.setX(-5);
        BuyButton3 buyButton3 = new BuyButton3(game);
        buyButton3.setZIndex(91);
        buyButton3.setY(87);
        buyButton3.setX(-5);
        AdderUpgrade adderUpgrade = new AdderUpgrade(game);
        adderUpgrade.setX(-5);
        adderUpgrade.setY(65);
        PointAdderButton pointAdderButton = new PointAdderButton(game);
        addActor(pointAdderButton);
        pointAdderButton.setX(-5);
        pointAdderButton.setY(-20);
        FactoryShop factoryShop = new FactoryShop(game);
        addActor(factoryShop);
        factoryShop.setX(50);
        factoryShop.setY(35);
        ShopExit shopExit = new ShopExit(game);
        shopExit.setX(56);
        shopExit.setY(84);
        FactoryWarehouse factoryWarehouse = new FactoryWarehouse(game);
        addActor(factoryWarehouse);
        factoryWarehouse.setY(-17.5f);
        factoryWarehouse.setX(55);
        FactoryActor2 factoryActor2 = new FactoryActor2(game);
        factoryActor2.setPositionCenter(90);
        FactoryActor3 factoryActor3 = new FactoryActor3(game);
        factoryActor3. setPositionCenter(150);
        CoinIcon coinIcon = new CoinIcon(game);
        addActor(coinIcon);
        coinIcon.setY(150);
        coinIcon.setX(0);
        ProductIcon productIcon = new ProductIcon(game);
        addActor(productIcon);
        productIcon.setX(-6);
        productIcon.setY(120);
        ShopBackground shopBackground = new ShopBackground(game);
        shopBackground.setX(-5);
        shopBackground.setY(40);
        factoryActor.setX(-3);
        factoryActor.setY(70);
        factoryActor2.setY(70);
        factoryActor3.setY(70);
        factoryActor2.setX(27);
        factoryActor3.setX(57);

        //Actorok\\

        //Labelek\\
        pointCounter = new MyLabel(game, "" + getPoints(), new PointCounter(game));
        addActor(pointCounter);
        pointCounter.setFontScale(0.3f);
        pointCounter.setY(117);
        pointCounter.setX(20);
        pointCounter.setFontScale(0.3f);
        pointCounter.setAlignment(2);

        productCounter = new MyLabel(game, "" + getProducts(), new ProductCounter(game));
        addActor(productCounter);
        productCounter.setFontScale(0.3f);
        productCounter.setY(90);
        productCounter.setX(20);
        productCounter.setFontScale(0.3f);
        productCounter.setAlignment(2);


        //Labelek\\

        //Money timer\\
            addTimer(new TickTimer(1, true, new TickTimerListener() {
                @Override
                public void onTick(Timer sender, float correction) {
                    super.onTick(sender, correction);
                    productCounter.setText("Money:" + getPoints() );
                    if (pointupgraded == false) {
                        setPoints(getPoints() + 10000);

                    }
                    else{
                        setPoints(getPoints() + 12);
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

        //Product timer\\
        addTimer(new TickTimer(1, true, new TickTimerListener() {
            @Override
            public void onTick(Timer sender, float correction) {
                super.onTick(sender, correction);
                productCounter.setText("" + getProducts());
            }
        }));

        addTimer(new TickTimer(1, true, new TickTimerListener() {
            @Override
            public void onTick(Timer sender, float correction) {
                super.onTick(sender, correction);
                if (factories==1){
                    setProducts(getProducts() + 1);
                }

                if (factories==2){
                    setProducts(getProducts() + 3);
                }

                if (factories==3){
                    setProducts(getProducts() + 6);
                }
            }
        }));

        //Lomi timer\\

        //Lomi timer\\
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

        buyButton2.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                if (factories == 1) {

                    if (getPoints() >= 1500) {
                        setPoints(getPoints() - 1500);
                        addActor(factoryActor2);
                        factories = factories + 1;
                        buyButton2.remove();
                        System.out.println(factories);

                    } else {
                        System.out.println("Nincs elég pénz");
                    }
                }
            }
        });

        buyButton3.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                if (factories == 2) {

                    if (getPoints() >= 3000) {
                        setPoints(getPoints() - 3000);
                        addActor(factoryActor3);
                        factories = factories + 1;
                        buyButton3.remove();
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
                if (getProducts() < 10) {
                    setProducts(getProducts() + 1);
                }
                else if(getProducts() >= 10){
                    System.out.println("Túl sokat lomiztál!");
                }
            }
        });

        factoryShop.addListener(new ClickListener(){

            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);

                addActor(shopBackground);
                shopBackground.setZIndex(90);

                if (factories == 0) {
                    addActor(buyButton);
                    buyButton.setZIndex(94);
                }

                if (factories == 1) {
                    addActor(buyButton2);
                    buyButton2.setZIndex(95);
                }

                if (factories == 2) {
                    addActor(buyButton3);
                    buyButton.setZIndex(92);
                }
                if (pointupgraded ==false) {
                    addActor(adderUpgrade);
                    adderUpgrade.setZIndex(96);
                }
                addActor(shopExit);
                shopExit.setZIndex(91);
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
                shopBackground.remove();
            }
        });


        //Click listener\\

        factoryWarehouse.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                    if (getProducts() >= 100){
                        setProducts(getProducts() - 10);
                        setPoints(getPoints() + 1000);
                    }
                    else{
                        System.out.println("Nincs még 100terméked!");
                    }
            }
        });

        addActor(new SmokeActor(game));

    }
}
