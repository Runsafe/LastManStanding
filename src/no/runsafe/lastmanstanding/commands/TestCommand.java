package no.runsafe.lastmanstanding.commands;

import no.runsafe.framework.api.IScheduler;
import no.runsafe.framework.api.command.argument.IArgumentList;
import no.runsafe.framework.api.command.player.PlayerAsyncCommand;
import no.runsafe.framework.api.player.IPlayer;

public class TestCommand extends PlayerAsyncCommand
{
	protected TestCommand(IScheduler scheduler)
	{
		super("test", "Science!", "runsafe.lms", scheduler);
	}

	@Override
	public String OnAsyncExecute(IPlayer executor, IArgumentList parameters)
	{
		return "Good work!";
	}
}
