package no.runsafe.lastmanstanding;

import no.runsafe.framework.RunsafeConfigurablePlugin;
import no.runsafe.framework.api.command.Command;
import no.runsafe.framework.features.Commands;
import no.runsafe.lastmanstanding.commands.AddStartLocation;

public class LastManStanding extends RunsafeConfigurablePlugin
{
	//	public static IDebug Debugger = null;

	@Override
	protected void pluginSetup()
	{
//		Debugger = getComponent(IDebug.class);

		// Framework features
		addComponent(Commands.class);
		//addComponent(Database.class);
		//addComponent(Events.class);
		//addComponent(FrameworkHooks.class);
		//addComponent(LUAScripts.class);
		//addComponent(UniverseRegistration.class);

		// Commands
		Command mainCommand = new Command("lms", "Last Man Standing commands", null);

		Command startLocationCommand = new Command("start", "Commands to manage start locations", null);
		startLocationCommand.addSubCommand(getInstance(AddStartLocation.class));

		mainCommand.addSubCommand(startLocationCommand);

		addComponent(mainCommand);
	}
}
