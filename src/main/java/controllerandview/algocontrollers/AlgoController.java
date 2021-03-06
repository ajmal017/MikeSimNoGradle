package main.java.controllerandview.algocontrollers;

import main.java.model.MainModelThread;
import main.java.model.positionsorders.MikePosOrders;

public abstract class AlgoController {

    /**
     * Starts the Algo. Returns true if launch successful.
     * @param entryPrice
     * @return
     */
//    public abstract boolean launch(int entryPrice, MainModelThread model, MikePosOrders posOrders);

    public abstract boolean cancel(int entryPrice, MainModelThread model, MikePosOrders posOrders);

    public abstract void mikeGridPaneButtonPressed(int pricePressed, MainModelThread model, MikePosOrders posOrders);

    public abstract String getSimpleDescriptionRow1();
    public abstract String getSimpleDescriptionRow2();

//    public abstract int getAmount();
}
