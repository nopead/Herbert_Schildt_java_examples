package chapter8.classes;

import chapter8.classes.Shipment;

class DemoShipment{
	public static void main(String[] args){
		
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
		Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
		
		double vol;
		
		vol = shipment1.getVolume();
		
		System.out.println("shipment1 vol = " + vol);
		System.out.println("shipment1 weight = " + shipment1.weight);
		System.out.println("shipment1 cost = $" + shipment1.cost);
		
		vol = shipment2.getVolume();
		System.out.println("shipment2 vol = " + vol);
		System.out.println("shipment2 weight = " + shipment2.weight);
		System.out.println("shipment2 cost = $" + shipment2.cost);
	}
}