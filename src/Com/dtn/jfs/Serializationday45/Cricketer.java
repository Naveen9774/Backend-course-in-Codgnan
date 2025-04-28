package Com.dtn.jfs.Serializationday45;

import java.io.Serializable;

class Cricketer implements Serializable{
	String name;
	String country;
    int matches;
	int catches;
	int runs;
	public Cricketer(String name, String country, int matches, int catches, int runs) {
		super();
		this.name = name;
		this.country = country;
		this.matches = matches;
		this.catches = catches;
		this.runs = runs;
	}
	@Override
	public String toString() {
		return name+"----"+country+"----"+matches+"----"+catches+"----"+runs;
	}
}