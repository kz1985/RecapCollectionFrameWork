package com.OOP;

public class EEE_InterfaceImpe extends EEE_InterfaceApproachOfFeeding{
public static void main(String[] args) {
	EEE_InterfaceApproachOfFeeding ie = new EEE_InterfaceApproachOfFeeding();
	ie.foods();
	ie.drinks();
	ie.tests();
	String ff = EEE_InterfaceFeed.fruites("Watermaellon");
	 
}
}
