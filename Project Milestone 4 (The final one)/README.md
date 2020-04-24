# CS111 Project Description Fall 2016 Milestone 4

In this final milestone, you will be implementing a GUI interface for your game. The source code you submit will be via sakai, as the GUI will be human verified.

Using the ConnectFour.java game driver, edit the code to make use of the GUI code we have given you. Descriptions of the classes and their relevant methods appear below. Also general tips on what to include in your driver also appear below.
 
ChipColor.java – an enumerated type that allows you to specify a token’s color. Usage of this class allows you to specify colors. e.g. ChipColor.BLUE specifies the color blue, while ChipColor.RED specifies the color red. Use as parameters to the CFGUI constructor
CFGUI.java – defines the main GUI of the board. The constructor takes the three parameters – the game board (of type Board), player 1’s chip color (of type ChipColor [ see above]), player 2’s chip color – in that order

#### Method Summary

* CFGUI(Board b, ChipColor c1, ChipColor c2) – constructor
* void redraw() – method must be called every time your board is updated
* void gameOver(int player) – method must be called when your game is over and winner is determined. Parameter is player’s id. Pass in 0 in the case of tie.
* void close() – method must be called before exiting your game (closes the GUI window)

GIO.java – allows you to output and input from the GUI. Your use is optional. You may modify HumanPlayer.java to use GIO.readInt() if you wish, or continue to use IO for inputs.

#### Method Summary

* static int read…(String prompt) – ask the user for a … using the prompt given as a parameter in a pop up window. Returns said …. Where … is any of int, boolean or String
* static void displayMessage(String message) – displays the given string as a pop up message in the GUI
#### Hints and tips:

In your ConnectFour.java file, you must:
* Create a CFGUI object
* Call redraw() everytime there’s a change on your board
* Call gameOver() to notify the GUI of who won

You have complete freedom in how you want to implement your game. You can modify any of the files we’ve given you (but must submit them!).
#### Ideas for implementation:
custom chooseable colors, Human v human, human v computer easy, human v computer hard, etc. This is your time to be creative. If you’re doing anything that would require the player to do anything special, please  make a notation in a file called readme.txt

##### What to submit:
Every thing you need to make your program compile and run.
##### Scoring:
* 10 points if we are able to play your game (without errors)          
* 0 points for anything else.
