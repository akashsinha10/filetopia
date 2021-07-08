package org.example.filetopia;

import org.example.filetopia.screens.WelcomeScreen;

public class filetopiaApplication {

    public static void main(String[] args) {
    	
    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.introWS();
    	welcome.GetUserInput();

    }
}
