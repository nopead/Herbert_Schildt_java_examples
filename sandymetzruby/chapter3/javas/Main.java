package sandymetzruby.chapter3.classes;

import java.util.HashMap;
import sandymetzruby.chapter3.classes.Wheel;
import sandymetzruby.chapter3.classes.Gear;
import sandymetzruby.chapter3.classes.GearWrapper;

class Main{
	public static void main(String[] args){
		HashMap<String, Object> argsForGear = new HashMap();
		argsForGear.put("chairing", 52);
		argsForGear.put("cog", 11);
		argsForGear.put("wheel", new Wheel(26, 1.5));
		Gear gear = GearWrapper.createGear(argsForGear);
		
		System.out.println(gear.gearInchesByVariable());
	}
}