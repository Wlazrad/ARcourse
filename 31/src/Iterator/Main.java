package Iterator;
//iterator pozwala poruszac sie po obiektach roznych do tylu
// nie trzeba nic zmieniac w iteratoze nie trzb podawac typu
import java.util.*;

public class Main {

    public static void main(String[] args) {
	List<String> listaStr= new ArrayList<>();
	listaStr.add("jeden");
	listaStr.add("dwa");
	listaStr.add("trzy");
	listaStr.add("cztery");

	List<Integer> listaInt = new ArrayList<>();
	listaInt.add(100);
	listaInt.add(200);
	listaInt.add(300);
	listaInt.add(400);
// set nie jest lista
// po set nie poruszamy sie do tylu iterator nie daje takiej mozliwosci
	Set<String> kolSet = new HashSet<>();
	kolSet.add("str 1");
	kolSet.add("str 2");
	kolSet.add("str 3");
	kolSet.add("str 4");

	Map<Integer, String> mapa = new HashMap<>();
	mapa.put(1,"jeden");
	mapa.put(2,"dwa");
	mapa.put(3,"trzy");
	mapa.put(4,"cztery");



	for (String s: listaStr){
        System.out.println(s);
    }


    System.out.println("\n ====String List - w przod====");
	//lub .iterator
	Iterator i = listaStr.listIterator();
	while (i.hasNext()){
		System.out.println(((ListIterator)i).nextIndex()+":"+ i.next());
	}
	//hasPrevious  od tylu iteruje
		System.out.println("\n ====String List - w tyl====");
		while (((ListIterator) i).hasPrevious()){
			System.out.println(((ListIterator)i).previousIndex()+":"+ ((ListIterator)i).previous());
		}
//tworzymy iterator na kolekcji
		Iterator p = kolSet.iterator();
		while(p.hasNext()){
			System.out.println(p.next());
		}

		//iterowanie po mapie
		Iterator<Integer> m = mapa.keySet().iterator();
		while(m.hasNext()){
			Integer key = m.next();
			System.out.println(key+":" +mapa.get(key));
		}

	}


}
