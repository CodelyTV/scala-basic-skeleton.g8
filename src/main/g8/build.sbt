Settings.settings

libraryDependencies := Dependencies.all

SbtAliases.aliases.flatMap { case (alias, command) =>
  addCommandAlias(alias, command)
}
