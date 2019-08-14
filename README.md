# 🚀 CodelyTV Scala Bootstrap (g8 template)
 
[![Software License][ico-license]][link-license]
[![Build Status][ico-travis]][link-travis]
 
## ℹ️ Introduction 

This is a [Giter8][g8] template intended to serve as a starting point if you want to bootstrap a project in Scala.
 
It could be useful if you want to start a kata, a little exercise or project from scratch. The idea is that you don't have to worry about the boilerplate, just run `sbt new codelytv/scala-basic-skeleton.g8` and you're ready to go:
* Latest versions of Scala, SBT and ScalaTest in order to practice with them
* Best practices applied:
  * [`README.md`][link-readme] (badges included)
  * [`LICENSE`][link-license]
  * [`build.sbt`][link-build-sbt]
  * [`.scalafmt.conf`][link-scalafmt-config]
  * [`.gitignore`][link-gitignore]
  * [`.editorconfig`][link-editorconfig]
  * [`.travis.yml`][link-travis-yml]

## ☝️ How To Start

[Video screencast](http://codely.tv/screencasts/scala-sbt-new/) (in Spanish) 

1. Install the [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) & [SBT](http://www.scala-sbt.org/) tools
2. Create your new project: `sbt new codelytv/scala-basic-skeleton.g8`
3. Set your project parameters. When you run the previous command, you'll be asked for the project parameters such as the Scala language version, the project name and package, and so on.
4. Move to your project folder and start coding! The template will leave you an example class just to get started quicker in the `src/main` directory (we avoid the `scala` default subdirectory because we don't want to split by programming language). 
5. Done! 🎉🦄🌈

You can now move to your project's directory, enter the SBT shell with the `sbt` command, and run the test example with `test` or `t`.

## 🤽‍ Pre-push Git hook

There's one Git hook included. It's inside the `doc/hooks` folder and it will run the `prep` SBT task before pushing to any remote.

This `prep` task is intended to run all the checks you consider before pushing. At this very moment, it try to compile and check the code style rules with ScalaFmt.
 
You can define what this task does modifying the `prep` task in the `build.sbt` file. We like the approach of just running 1 single SBT task as the hook instead of multiple tasks because it's more efficient (the hook doesn't have to run SBT multiple times), and also because this way we can control the pre push tasks with the SBT alias defined at the `build.sbt` without altering the hooks.
 
If you want to install this hook, just `cd doc/hooks` and run `./install-hooks.sh`.

## ☕🐘 Other programming languages

* [Java](https://github.com/CodelyTV/java-basic-skeleton)
* [PHP](https://github.com/CodelyTV/php-basic-skeleton)
* [Scala](https://github.com/CodelyTV/scala-basic-skeleton): This other skeleton is not based in the Gitter8 template system. So you can actually clone the repo and just start coding.

## ❓ About

This hopefully helpful utility has been developed by [CodelyTV][link-author] and [contributors][link-contributors].

We'll try to maintain this project as simple as possible, but Pull Requests are welcome!

## ⚖️ License

The MIT License (MIT). Please see [License File][link-license] for more information.

[ico-license]: https://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat-square
[ico-travis]: https://img.shields.io/travis/CodelyTV/scala-basic-skeleton.g8/master.svg?style=flat-square

[g8]: http://www.foundweekends.org/giter8/
[link-license]: LICENSE
[link-travis]: https://travis-ci.org/CodelyTV/scala-basic-skeleton
[link-readme]: README.md
[link-build-sbt]: blob/master/src/main/g8/build.sbt
[link-scalafmt-config]: blob/master/src/main/g8/.scalafmt.conf
[link-gitignore]: blob/master/src/main/g8/.gitignore
[link-editorconfig]: blob/master/src/main/g8/.editorconfig
[link-travis-yml]: blob/master/src/main/g8/.travis.yml
[link-author]: https://github.com/CodelyTV
[link-contributors]: ../../contributors

