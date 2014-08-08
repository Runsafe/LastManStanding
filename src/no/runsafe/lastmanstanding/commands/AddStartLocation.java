package no.runsafe.lastmanstanding.commands;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.IScheduler;
import no.runsafe.framework.api.command.argument.IArgumentList;
import no.runsafe.framework.api.command.argument.OptionalArgument;
import no.runsafe.framework.api.command.player.PlayerAsyncCommand;
import no.runsafe.framework.api.player.IPlayer;
import no.runsafe.lastmanstanding.Arena;
import no.runsafe.lastmanstanding.StartLocation;

public class AddStartLocation extends PlayerAsyncCommand
{
	protected AddStartLocation(IScheduler scheduler, Arena arena)
	{
		super("add", "Add a starting location", "runsafe.lms.start.add", scheduler, new OptionalArgument("range"));
		this.arena = arena;
	}

	@Override
	public String OnAsyncExecute(IPlayer executor, IArgumentList parameters)
	{
		Object rangeObj = parameters.getValue("range");
		int range = rangeObj != null ? (Integer) rangeObj : 5;

		ILocation playerLocation = executor.getLocation();
		int deleteCount = 0;

		for (StartLocation startLocation : arena.getStartingLocations())
		{
			if (startLocation.getLocation().distance(playerLocation) <= range)
			{
				arena.deleteStartLocation(startLocation);
				deleteCount++;
			}
		}

		return "&eDeleted &6" + deleteCount + "&e start locations within &6" + range + "&e blocks.";
	}

	private final Arena arena;
}
