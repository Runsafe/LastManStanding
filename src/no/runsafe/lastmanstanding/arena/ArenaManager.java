package no.runsafe.lastmanstanding.arena;

import no.runsafe.framework.api.event.IServerReady;

public class ArenaManager implements IServerReady
{
	public ArenaManager()//ArenaRepository repository, IConsole console)
	{
		//this.repository = repository;
		//this.console = console;
	}

	@Override
	public void OnServerReady()
	{
		//arenas = repository.getArenas();
		//console.logInformation("Loaded %s arenas.", arenas.size());
	}

	//public List<Arena> getArenas()
	//{
	//	return arenas;
	//}

	//private List<Arena> arenas = new ArrayList<>(0);
	//private final ArenaRepository repository;
	//private final IConsole console;
}
