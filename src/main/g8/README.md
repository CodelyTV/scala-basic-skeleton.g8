# ✨ $name$

[![License](https://img.shields.io/github/license/$organization$/$name;format="lower,snake"$?style=flat-square)](/LICENSE) 

[![GitHub Repo stars](https://img.shields.io/github/stars/$organization$/$name;format="lower,snake"$?style=flat-square)](https://github.com/$organization$/$name;format="lower,snake"$/stargazers)

[![Continuous Integration status](https://img.shields.io/github/actions/workflow/status/$organization$/$name;format="lower,snake"$/ci.yml?style=flat-square)](https://github.com/$organization$/$name;format="lower,snake"$/actions/workflows/ci.yml)

$description$

## 🚀 Environment setup

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

## ✅ Tests

Just run:

```shell
sbt test
```

There is also the `sbt t` alias 😊

## 🤽‍ Pre-push Git hook

There's one Git hook included. It's inside the `doc/hooks` folder, and it will run the `prep` SBT task before pushing to any remote.

This `prep` task is intended to run all the checks you consider before pushing.
At this very moment, it tries to compile and check the code style rules with ScalaFmt.
 
You can define what this task does by modifying the `prep` task in the `build.sbt` file.
We like the approach of just having to run 1 single SBT task instead of multiple tasks because it's more efficient (the hook doesn't have to create multiple SBT sessions), and also because this way we can control the pre push tasks with the SBT alias defined at the `build.sbt` without altering the hooks.
 
If you want to install this hook, just `cd doc/hooks` and run `./install-hooks.sh`.

## ⚖️ License

See [`LICENSE`](LICENSE).

## 🤔 About

Project developed by $organization$ and bootstrapped with the [Codely Scala Basic Skeleton (powered by Giter 8)](https://github.com/CodelyTV/scala-basic-skeleton.g8).
