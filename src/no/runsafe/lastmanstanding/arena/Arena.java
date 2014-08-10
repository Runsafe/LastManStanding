package no.runsafe.lastmanstanding.arena;

import no.runsafe.framework.api.vector.IRegion3D;

import java.util.ArrayList;
import java.util.List;

public class Arena
{
	public Arena(String name)
	{
		arenaName = name;
	}

	public List<StartLocation> getStartingLocations()
	{
		return startLocations;
	}

	public void deleteStartLocation(StartLocation location)
	{
		startLocations.remove(location);
	}

	public String getArenaName()
	{
		return arenaName;
	}

	public boolean isEnabled()
	{
		return enabled;
	}

	private final List<StartLocation> startLocations = new ArrayList<StartLocation>(0);
	private IRegion3D field;
	private final String arenaName;
	private boolean enabled;
}
