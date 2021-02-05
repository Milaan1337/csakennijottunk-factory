package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import csakennijottunk.FactoryGame;
import csakennijottunk.TesztIndito;

public class IngGameInditas {
    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width=300;
        config.height=600;
        new LwjglApplication(new TesztIndito(false), config);
    }
}
