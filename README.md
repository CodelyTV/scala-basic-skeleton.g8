<p align="center">
  <a href="https://codely.com">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="https://codely.com/logo/codely_logo-dark.svg">
      <source media="(prefers-color-scheme: light)" srcset="https://codely.com/logo/codely_logo-light.svg">
      <img alt="Codely logo" src="https://codely.com/logo/codely_logo.svg">
    </picture>
  </a>
</p>

<h1 align="center">
  🧬⚡ Codely Scala Basic Skeleton (powered by Giter 8)
</h1>

<p align="center">
    <a href="https://github.com/CodelyTV"><img src="https://img.shields.io/badge/Codely-OS-green.svg?style=flat-square" alt="Codely Open Source"/></a>
    <a href="https://pro.codely.com"><img src="https://img.shields.io/badge/Codely-Pro-black.svg?style=flat-square" alt="Codely Pro Courses"/></a>
    <a href="/LICENSE"><img src="https://img.shields.io/github/license/CodelyTV/scala-basic-skeleton.g8?style=flat-square" alt="License"/></a>
    <a href="https://github.com/CodelyTV/scala-basic-skeleton.g8/stargazers"><img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/CodelyTV/scala-basic-skeleton.g8?style=flat-square"></a>
    <a href="https://github.com/CodelyTV/scala-basic-skeleton.g8/actions/workflows/ci.yml"><img src="https://img.shields.io/github/actions/workflow/status/CodelyTV/scala-basic-skeleton.g8/ci.yml?style=flat-square" alt="Continuous Integration status" /></a>
</p>

<p align="center">
  Template for bootstrapping your new Scala project following idiomatic best practices powered by Giter 8.
  <br />
  <br />
  <a href="#-related-resources">💡 Related resources</a> | <a href="https://github.com/CodelyTV/scala-basic-skeleton.g8/stargazers">🌟 Repository Stargazers</a>
</p>
 
## 🚀 How to use

Run the following command and you're ready to go:

```shell
sbt new codelytv/scala-basic-skeleton.g8
```

You can now move to your project's directory, enter the SBT shell with the `sbt` command, and run the tests with `test` or `t`.

### Project creation wizard

It will ask for some parameters like your desired project name or the organization to customize the generated project package name.

It will also ask for the version of some dependencies such as Scala (the language itself), SBT, or ScalaTest. If you do not know which version to choose for any of these dependencies, just go with the default one. These suggestions are dynamically generated based on the latest stable version available in Maven at the moment of creating your project 😊🤟

### Pre-requisites

You only need the common tooling used for developing Scala applications:

- [JDK](https://www.oracle.com/java/technologies/downloads/)
- [SBT](https://www.scala-sbt.org/download)

<details>
<summary>Installing instructions for macOS with SDKMAN!</summary>

If you use macOS, we would recommend using SDKMAN! to manage different JDK versions and tooling:

1. [Install SDKMAN with homebrew](https://github.com/sdkman/homebrew-tap?tab=readme-ov-file#installation)
2. Install the JDK you prefer. If you ask us, we will opt for:
   1. [Check the latest Java LTS JDK version](https://endoflife.date/oracle-jdk)
   2. Check the latest Zulu distribution version for that LTS with:
      ```shell
      sdk list java
      ```
   3. Install it:
      ```shell
      sdk install java XX.YY.ZZ-zulu
      ```
3. Install the latest SBT:
   ```shell
   sdk install sbt
   ```
</details>

## 💎 Features

- Permissive [`LICENSE`](LICENSE): Allow using projects created with this template for commercial and private purposes.
- [Continuous Integration for the template](https://github.com/CodelyTV/scala-basic-skeleton.g8/actions/workflows/ci.yml): Use GitHub Actions to validate every commit merging to `main` to guarantee correctness.
- Complete [`README.md`](README.md) example: Include badges for CI status and other fancy stuff.
- Latest versions of Scala, SBT and ScalaTest. Always: They are dynamically suggested based on the latest stable version available while creating your project.
- Minimum dependencies: Just the most common for starting up, and you can delete them in your `build.sbt` once the project has been created:
  - [ScalaTest](https://scalatest.org): Test runner.
  - [ScalaMock](https://scalamock.org): Test doubles generator.
  - [nscala-time](https://github.com/nscala-time/nscala-time): Commonly used library wrapping Joda Time offering a Scala-friendly API like: `2.hours + 45.minutes`.
  - [pprint](https://github.com/com-lihaoyi/PPrint): Much better than `System.out.println(x.toString)`.
- Other ecosystem tools already configured to follow idiomatic best practices:
  - [Scalafmt](https://scalameta.org/scalafmt) Code formatter: [Already configured](src/main/g8/.scalafmt.conf) following idiomatic best practices.
  - [EditorConfig](https://editorconfig.org): [Ready to follow Scala conventions](src/main/g8/.editorconfig).
- Opinions:
  - Configured to avoid the `scala/` default subdirectory because we don't want to split source code by programming language. That is, instead of having the `src/main/scala/` and `src/test/scala/` folders you will be able to code right in `src/main/` and `src/test/` ones.
  - [`.gitignore`](src/main/g8/.gitignore): Avoid including particular ignore rules for any specific IDE or OS. They must be included in [your global Git config](https://docs.github.com/en/get-started/getting-started-with-git/ignoring-files#configuring-ignored-files-for-all-repositories-on-your-computer) saving that noise from the project-specific rules.
  - Include [SBT aliases for common tasks](src/main/g8/build.sbt). You will be able to run your tests with `t`, compile with `c`, or run all the tasks needed to execute before doing a Git push (compile source and test, and check source and test code style) with `prep`

## 🤽‍ Pre-push Git hook

There's one Git hook included. It's inside the `doc/hooks` folder, and it will run the `prep` SBT task before pushing to any remote.

This `prep` task is intended to run all the checks you consider before pushing.
At this very moment, it tries to compile and check the code style rules with ScalaFmt.
 
You can define what this task does by modifying the `prep` task in the `build.sbt` file.
We like the approach of just having to run 1 single SBT task instead of multiple tasks because it's more efficient (the hook doesn't have to create multiple SBT sessions), and also because this way we can control the pre push tasks with the SBT alias defined at the `build.sbt` without altering the hooks.
 
If you want to install this hook, just `cd doc/hooks` and run `./install-hooks.sh`.

## 💡 Related resources

### 🧑‍🎓 Related learning resources

- [Scala courses (Spanish)](https://pro.codely.com/library/?category=Scala)
- [Software architecture courses (Spanish)](https://pro.codely.com/library/?category=Arquitectura+de+Software)
- [Backend courses (Spanish)](https://pro.codely.com/library/?category=Backend)

### 🧑‍💻 Related skeleton repositories

#### 🧬 Scala repositories

- [🌱 Scala Basic Skeleton (without Giter8)](https://github.com/CodelyTV/scala-basic-skeleton)
- [🎯 Scala DDD Example](https://github.com/CodelyTV/scala-ddd-example)

#### ♨️ Java

- [🌱 Java Basic Skeleton](https://github.com/CodelyTV/java-basic-skeleton)
- [🦠 Java OOP Examples](https://github.com/CodelyTV/java-oop-examples)
- [🧱 Java SOLID Examples](https://github.com/CodelyTV/java-solid-examples)
- [🎯 Java DDD Example](https://github.com/CodelyTV/java-ddd-example)

#### 🟪 Kotlin

- [🌱 Kotlin Basic Skeleton](https://github.com/CodelyTV/kotlin-basic-skeleton)
- [🎯 Kotlin API Skeleton](https://github.com/CodelyTV/kotlin-api-skeleton)

#### 🦈 C#

- [🌱 C# Basic Skeleton](https://github.com/CodelyTV/csharp-basic-skeleton)
- [✨ C# DDD Skeleton](https://github.com/CodelyTV/csharp-ddd-skeleton)

#### 🟨 JavaScript

- [🌱 JavaScript Basic Skeleton](https://github.com/CodelyTV/javascript-basic-skeleton)

#### 🔷 TypeScript

- [🌱 TypeScript Basic Skeleton](https://github.com/CodelyTV/typescript-basic-skeleton)
- [🕸️ TypeScript Web Skeleton](https://github.com/CodelyTV/typescript-web-skeleton)
- [🌍 TypeScript API Skeleton](https://github.com/CodelyTV/typescript-api-skeleton)
- [✨ TypeScript DDD Skeleton](https://github.com/CodelyTV/typescript-ddd-skeleton)
- [🎯 TypeScript DDD Example](https://github.com/CodelyTV/typescript-ddd-example)

#### 🐘 PHP

- [🌱 PHP Basic Skeleton](https://github.com/CodelyTV/php-basic-skeleton)
- [✨ PHP DDD Skeleton](https://github.com/CodelyTV/php-ddd-skeleton)
- [🎯 PHP DDD Example](https://github.com/CodelyTV/php-ddd-example)

## ⚖️ License

See [`LICENSE`](LICENSE).

## 🤝 Contributing

See [`CONTRIBUTING.md`](CONTRIBUTING.md).

## 🤔 About

This hopefully helpful resource has been developed by [Codely](https://github.com/CodelyTV) and [contributors](https://github.com/CodelyTV/scala-basic-skeleton.g8/graphs/contributors).

If you appreciate this contribution and want to show some support to our Open Source contributions, you have several options:

- Without leaving GitHub:
  - Give a star to this repository and be listed as a [stargazer](https://github.com/CodelyTV/scala-basic-skeleton.g8/stargazers)
  - Follow [CodelyTV on GitHub](https://github.com/CodelyTV)
- Follow us on other social networks:
  - [YouTube](https://youtube.com/codelytv)
  - [Twitch](https://twitch.tv/codelytv)
  - [Twitter](https://x.com/codelytv)
  - [LinkedIn](https://linkedin.com/company/codelytv)
  - [Instagram](https://instagram.com/codelytv)
- Sponsoring our work:
  - [GitHub Sponsors Donation](https://github.com/sponsors/CodelyTV)
  - [Subscribe to our course platform](https://codely.com)
