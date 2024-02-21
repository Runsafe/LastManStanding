package no.runsafe.lastmanstanding.database;

import no.runsafe.framework.api.database.*;

import javax.annotation.Nonnull;

public class ArenaRepository extends Repository
{
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
