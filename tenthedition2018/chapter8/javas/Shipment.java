package tenthedition2018.chapter8.classes;

import tenthedition2018.chapter8.classes.BoxWeight;

class Shipment extends BoxWeight{
	double cost;
	
	Shipment(Shipment obj){
		
	}
	
	Shipment(double w, double h, double d, double m, double c){
		super(w, h, d, m);
		cost = c;
	}
	
	Shipment(){
		super();
		cost = -1;
	}
	
	Shipment(double len, double m, double c){
		super(len, m);
		cost = c;
	}
}