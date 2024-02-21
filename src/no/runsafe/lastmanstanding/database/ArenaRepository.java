package no.runsafe.lastmanstanding.database;

import no.runsafe.framework.api.database.ISchemaUpdate;
import no.runsafe.framework.api.database.Repository;
import no.runsafe.framework.api.database.SchemaUpdate;
import no.runsafe.lastmanstanding.arena.Arena;

import javax.annotation.Nonnull;
import java.util.List;

public class ArenaRepository extends Repository
{
	public List<Arena> getArenas()
	{
		return null;
	}

	@Nonnull
	@Override
	public String getTableName()
	{
		return "lms_arenas";
	}

	@Nonnull
	@Override
	public ISchemaUpdate getSchemaUpdateQueries()
	{
		ISchemaUpdate update = new SchemaUpdate();

		update.addQueries("CREATE TABLE `lms_arenas` (" +
			"`arenaName` VARCHAR(20) NOT NULL," +
			"`arenaField` LONGTEXT NOT NULL," +
			"`chestSpawns` LONGTEXT NOT NULL," +
			"`playerSpawns` LONGTEXT NOT NULL," +
			"`enabled` BIT(1) NOT NULL DEFAULT '1'," +
			"PRIMARY KEY (`arenaName`)" +
		")");

		return update;
	}
}
