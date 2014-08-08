package no.runsafe.lastmanstanding.commands;

import no.runsafe.framework.api.IScheduler;
import no.runsafe.framework.api.command.AsyncCommand;
import no.runsafe.framework.api.command.ICommandExecutor;
import no.runsafe.framework.api.command.argument.IArgumentList;

public class TestCommand extends AsyncCommand
{
	protected TestCommand(IScheduler scheduler)
	{
		super("test", "Science!", "runsafe.lms", scheduler);
	}

	@Override
	public String OnAsyncExecute(ICommandExecutor executor, IArgumentList parameters)
	{
		return "Good work!";
	}
}
