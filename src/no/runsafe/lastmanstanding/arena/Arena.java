package no.runsafe.lastmanstanding.arena;

import java.util.ArrayList;
import java.util.List;

public class Arena
{
	public List<StartLocation> getStartingLocations()
	{
		return startLocations;
	}

	public void deleteStartLocation(StartLocation location)
	{
		startLocations.remove(location);
	}

	private final List<StartLocation> startLocations = new ArrayList<StartLocation>(0);
}
