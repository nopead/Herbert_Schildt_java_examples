package tenthedition2018.chapter8.classes;

import tenthedition2018.chapter7.classes.Box;

class BoxWeight extends Box{
	double weight;
	
	BoxWeight(){
		super();
		weight = -1;
	}
	
	BoxWeight(BoxWeight obj){
		super(obj);
		weight = obj.weight;
	}
	
	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}
	
	BoxWeight(double w, double h, double d, double m){
		super(w,h,d);
		weight = m;
	}	
}

