# CodelyTV Scala Bootstrap (base / project skeleton)
 
[![Software License][ico-license]][link-license]
[![Build Status][ico-travis]][link-travis]
 
## Introduction 

This is a [Giter8][g8] template intended to serve as a starting point if you want to bootstrap a project in Scala.
 
It could be useful if you want to start from scratch a kata or a little exercise or project. The idea is that you don't have to worry about the boilerplate, just clone this repo and there you go:
* Latest versions of Scala, SBT and ScalaTest in order to practice with them
* Best practices applied:
  * [`README.md`][link-readme] (badges included)
  * [`LICENSE`][link-license]
  * [`build.sbt`][link-build-sbt]
  * [`.scalafmt.conf`][link-scalafmt-config]
  * [`.gitignore`][link-gitignore]
  * [`.editorconfig`][link-editorconfig]
  * [`.travis.yml`][link-travis-yml]

## How To Start

1. Install the [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) & [SBT](http://www.scala-sbt.org/) tools
2. Create your new project: `sbt new codelytv/scala-bootstrap-template.g8`
3. Done! 🎉🦄🌈

Now you can move to your project's directory, enter inside the SBT shell with the `sbt` command, and run the test example with `test` or `t`.

## Pre-push Git hook

There's one Git hook included. It's inside the `doc/hooks` folder and it will run the `prep` SBT task before pushing to any remote.

This `prep` task is intended to run all the checks you consider before pushing. At this very moment, it try to compile and check the code style rules with ScalaFmt.
 
You can define what this task does just modifying the `prep` task in the `build.sbt` file. We like the approach of just running 1 single SBT task as the hook instead of multiple tasks because it's more efficient (the hook doesn't has to run SBT multiple times), and also because this way we can control the pre push tasks just with the SBT alias defined at the `build.sbt` without altering the hooks.
 
If you want to install this hook, just `cd doc/hooks` and run `./install-hooks.sh`.

## Other programming languages

* [PHP](https://github.com/CodelyTV/php-bootstrap)
* [Scala](https://github.com/CodelyTV/scala_bootstrap): This other bootstrap is not based in the Gitter8 template system. So you can actually clone the repo and just start coding.

## About

This hopefully helpful utility has been developed by [CodelyTV][link-author] and [contributors][link-contributors].

We'll try to maintain this project as simple as possible, but Pull Requests are welcomed!

## License

Licensed under CC0 1.0. Please see [License File][link-license] for more information.

[ico-license]: https://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat-square
[ico-travis]: https://img.shields.io/travis/CodelyTV/scala_bootstrap/master.svg?style=flat-square

[g8]: http://www.foundweekends.org/giter8/
[link-license]: LICENSE
[link-travis]: https://travis-ci.org/CodelyTV/scala_bootstrap
[link-readme]: README.md
[link-build-sbt]: blob/master/src/main/g8/build.sbt
[link-scalafmt-config]: blob/master/src/main/g8/.scalafmt.conf
[link-gitignore]: blob/master/src/main/g8/.gitignore
[link-editorconfig]: blob/master/src/main/g8/.editorconfig
[link-travis-yml]: blob/master/src/main/g8/.travis.yml
[link-author]: https://github.com/CodelyTV
[link-contributors]: ../../contributors

