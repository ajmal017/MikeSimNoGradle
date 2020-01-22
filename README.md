# MikeSimJava
Trading simulator using TWS API for paper trading. Test bed for custom algos.
package com.ib.* is needed to connect to Interactive Brokers API.


###TODO:

historical data for instruments other that SPY

multiple stepper algo buttton - one button - many simple stepper algos every 1 cent price move
multiple trailing stop algo button

open long pos above ask
open long orders abobe ask
open short pos below bid
open short orders below bid

Make trailing stop algo

Make button "Flatten position" in PositionsWindow
Make button "Cancel algos and flatten position

PositionsWindow - short positions on grey background in red - make long positions on grey background in blue

bug in transferring single position from MikePosOrders to another MikePosOrders: -50 turns into -40?
display order amount in third row of topMikeGridPane in MikePosWindow - the bug is in update function
inside MikePosWindow - switching displayed MikePosOrders clears the error

Create control for 'multiple stepper algo'

craete something in MikePosOrders that takes multiple positions and make one new one - preserving the closed PL


Controller for simpleStepperAlgo done. review it and add to ControllerPositionsWindow.
need to update fxml file so it points to correct controller

total open sell orders below bid
total open buy orders above ask

cancel all algos pertaining to chosen MikePosOrders
make sure that when cancelling algo at price (existing function in AlgoManager) only algos pertaining to chosen Posorders are cancelled - would be a bug if cancelling algos at a given price in SPY0 MikePosOrders cancelled algos in all other MikePosOrders at this price too.
 


1. pressing buttons in PositionsWindow launches algos. This is currently hardcoded.
Make something so that you can choose which algo is launched by column1, which by column2,
etc. Use a JavaFX ChoiceBox to choose the column - selecting a column should
change the contents of AnchorPane columnActionsAnchorPane in ControllerPositionsWindow.java
columnActionsAnchorPane should have another ChoiceBox inside it with all the available
algos listed. Choosing one of the Algos should change the contents of another Pane
below the choicebox depending on the Algo selected. columnActionsAnchorPane does not 
have to be an AnchorPane - it can be another kind of Pane. The Panes used should be
defined in an .fxml file for easy use with SceneBuilder.

#current commit:
Working on GUI. 