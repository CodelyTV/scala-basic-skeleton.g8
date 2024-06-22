Settings.settings

SbtAliases.aliases.flatMap { case (alias, command) =>
  addCommandAlias(alias, command)
}
