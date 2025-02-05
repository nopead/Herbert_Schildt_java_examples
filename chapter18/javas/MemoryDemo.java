package chapter18.classes;

class MemoryDemo{
	public static void main(String[] args){
		Runtime r = Runtime.getRuntime();
		
		long mem1;
		long mem2;
		Integer[] someinits = new Integer[1000];
		
		System.out.println("Всего памяти: " + r.totalMemory());
		mem1 = r.freeMemory();
		
		System.out.println("Свободной памяти исходно: " + mem1);
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("Свободной памяти после очистки: " + mem1);
		
		for (int i = 0; i < someinits.length; i++){
			someinits[i] = new Integer(i);
		}
		
		mem2 = r.freeMemory();
		System.out.println("Свободной памяти после выделения: " + mem2);
		System.out.println("Использовано памяти для выделения: " + (mem1 - mem2));
		
		for (Integer ob: someinits){
			ob = null;
		}
		
		r.gc();
		mem2 = r.freeMemory();
		System.out.println("Свободной памяти после очистки отвергнутых объектов типа Integer: " + mem2);
	}
}