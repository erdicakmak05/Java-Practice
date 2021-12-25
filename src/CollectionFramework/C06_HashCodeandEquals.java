package CollectionFramework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player {
	private String isim;
	
	private int id;

	public Player(String isim, int id) {
		super();
		this.isim = isim;
		this.id = id;
	}

	@Override
	public String toString() {
		return "ID=" + id + ", Isım = " + isim;
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, isim);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return id == other.id && Objects.equals(isim, other.isim);
	}

}

public class C06_HashCodeandEquals {

	public static void main(String[] args) {
		
		Set<Player> hashSet = new HashSet<>();
		
		Player player1 = new Player("Mustafa", 1);
		Player player2 = new Player("Mehmet", 10);
		Player player3 = new Player("Emre", 6);
		Player player4 = new Player("Mustafa", 1);
		
		hashSet.add(player1);
		hashSet.add(player2);
		hashSet.add(player3);
		hashSet.add(player4);
		
		for(Player p : hashSet) {
			System.out.println(p);
		}
		
		

	}

}
