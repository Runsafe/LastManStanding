package no.runsafe.lastmanstanding;

import no.runsafe.framework.RunsafeConfigurablePlugin;
import no.runsafe.framework.api.command.Command;
import no.runsafe.framework.features.Commands;
import no.runsafe.lastmanstanding.arena.Arena;
import no.runsafe.lastmanstanding.commands.AddStartLocation;
import no.runsafe.lastmanstanding.commands.TestCommand;

public class LastManStanding extends RunsafeConfigurablePlugin
{
	@Override
	protected void pluginSetup()
	{
		// Framework features
		addComponent(Commands.class);
		//addComponent(Database.class);
		//addComponent(Events.class);
		//addComponent(FrameworkHooks.class);
		//addComponent(LUAScripts.class);
		//addComponent(UniverseRegistration.class);

		addComponent(Arena.class); // Stick with one arena for now.

		// Commands
		Command mainCommand = new Command("lms", "Commands to control the mini-game", null);
		mainCommand.addSubCommand(getInstance(TestCommand.class));
		addComponent(mainCommand);

		Command startLocationCommand = new Command("start", "Commands to manage start locations", null);
		startLocationCommand.addSubCommand(getInstance(AddStartLocation.class));
		mainCommand.addSubCommand(startLocationCommand);
	}
}
