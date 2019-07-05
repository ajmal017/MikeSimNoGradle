package main.java.model.positionsorders;

public class MikeOrder {
    //orderID used inside MikeSimulator
    long orderId;

    enum MikeOrderType{
        BUYLMT,
        SELLLMT,
        BUYSTP,
        SELLSTP
    }
    //BUYLMT, SELLLMT, BUYSTP, SELLSTP
    MikeOrderType ordertype;

    //this stores which position the order is assigned to
    //there can be multiple orders for one price
    //once order is filled - this tells which position is updateed
    long assignedToPosition = 0;

    //the price of the order. priceserver are in cents.
    long price = 0;

    //the size of the order
    long amount = 0;

    //for checking fills - has the order been filled already?
    boolean isFilled = false;

    //for future implementation.
    boolean partialFill = false;

    //was the order cancelled?
    boolean cancelled = false;
}
