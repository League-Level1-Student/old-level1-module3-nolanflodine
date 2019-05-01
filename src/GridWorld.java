import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World w=new World();
	w.show();
	Bug b = new Bug();
	Location L=new Location(5, 5);
	w.add(L, b);
	Random r = new Random();
	w.add(r, b);
}
}
