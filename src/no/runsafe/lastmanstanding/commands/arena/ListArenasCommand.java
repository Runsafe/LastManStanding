package no.runsafe.lastmanstanding.commands.arena;

import no.runsafe.framework.api.IScheduler;
import no.runsafe.framework.api.command.AsyncCommand;
import no.runsafe.framework.api.command.ICommandExecutor;
import no.runsafe.framework.api.command.argument.IArgumentList;
import no.runsafe.lastmanstanding.arena.Arena;
import no.runsafe.lastmanstanding.arena.ArenaManager;

import java.util.List;

public class ListArenasCommand extends AsyncCommand
{
	protected ListArenasCommand(IScheduler scheduler, ArenaManager manager)
	{
		super("list", "List all available arenas", "runsafe.lms.areans.list", scheduler);
		this.manager = manager;
	}

	@Override
	public String OnAsyncExecute(ICommandExecutor executor, IArgumentList parameters)
	{
		List<Arena> arenaList = manager.getArenas();

		if (arenaList.isEmpty())
			return "&cThere are no arenas set-up.";

		for (Arena arena : arenaList)
			executor.sendColouredMessage("&e%s - %s", arena.getArenaName(), arena.isEnabled() ? "&aENABLED" : "&cDISABLED");

		return null;
	}

	private final ArenaManager manager;
}
