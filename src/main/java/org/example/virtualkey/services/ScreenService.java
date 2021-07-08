package org.example.filetopia.services;

import org.example.filetopia.screens.FileOptionsScreen;
import org.example.filetopia.screens.Screen;
import org.example.filetopia.screens.WelcomeScreen;
import org.example.filetopia.entities.Directory;


public class ScreenService {
	
	//static Directory dir = new Directory();
	
	
	
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
