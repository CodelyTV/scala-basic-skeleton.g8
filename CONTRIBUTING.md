# 🧑‍💻 Contributing

> [!NOTE]
> These are instructions on how to contribute to this project.
> If you just want to create a new project using this template, follow [the `README.md` instructions](README.md).

There are two ways to test your changes:

- ⚡ Quick feedback loop: Recommended while developing
- ✨ End-user check: Recommended to run at least before creating your Pull Request to ensure the project creation experience is as expected

## ⚡ Quick feedback loop (SBT plugin)

1. Enter into an SBT session in the root directory of your fork:
   ```shell
   sbt
   ```
2. Generate a project and run its test as done in [the CI workflow](.github/workflows/ci.yml):
   ```shell
   g8Test
   ```
3. Move to the generated project:
   ```shell
   cd target/sbt-test/Codely\ Scala\ Basic\ Skeleton/scripted/
   ```
4. Inspect it as you wish (check folder structure, run SBT tasks, open in IDE…), or run an SBT session watching for changes in case of creating the project again:
   ```shell
   sbt
   ~ compile
   ```

## ✨ End-user check (test template locally)

Following [the official Giter8 instructions on how to test templates locally](https://www.foundweekends.org/giter8/testing.html):

1. [Install Coursier](https://get-coursier.io/docs/cli-installation). For macOS:
   ```shell
   brew install coursier/formulas/coursier
   ```
2. If you are only interested in installing coursier just to be able to use giter 8, the templating system powering this skeleton, customize its setup parametrizing the apps to install:
   ```shell
   cs setup --apps cs,giter8
   ```
3. Create a project based on the local template:
   - You can do so by experiencing the project creation wizard end-users will see (recommended at least once just before submitting your PR):
     ```shell
     g8 file://scala-basic-skeleton.g8/
     ```
   - You can also create a project in a non-interactive way by just accepting the default parameters and overriding the destination folder if it already exists:
     ```shell
     g8 file://scala-basic-skeleton.g8/ --force
     ```
   - Or even specifying just the desired properties between [the available ones](src/main/g8/default.properties):
     ```shell
     g8 file://scala-basic-skeleton.g8/ --name=codely_template_test --force
     ```
4. Move to the generated project:
   ```shell
   cd codely_template_test/
   ```
5. Inspect it as you wish (check folder structure, run SBT tasks, open in IDE…), or run an SBT session watching for changes in case of creating the project again:
   ```shell
   sbt
   ~ compile
   ```


