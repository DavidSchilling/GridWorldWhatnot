package critters;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class RadioactiveBug extends Bug
{
	@Override
	public void move()
	{
		Grid<Actor> grid = getGrid();
		if(grid == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (grid.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();
		Uranium uranium = new Uranium(super.getColor());
		uranium.putSelfInGrid(grid, loc);
		
	}
}
