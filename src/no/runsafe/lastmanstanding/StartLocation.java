package no.runsafe.lastmanstanding;

import no.runsafe.framework.api.ILocation;

public class StartLocation
{
	public StartLocation(ILocation location)
	{
		this.location = location;
	}

	public ILocation getLocation()
	{
		return location;
	}

	private final ILocation location;
}
