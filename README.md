# java.avimehenwal

> code practise

```
java --version

openjdk version "11.0.7" 2020-04-14
OpenJDK Runtime Environment (build 11.0.7+10-post-Ubuntu-3ubuntu1)
OpenJDK 64-Bit Server VM (build 11.0.7+10-post-Ubuntu-3ubuntu1, mixed mode, sharing)


set -x PATH_TO_FX $HOME/mySoftwares/openjfx-14.0.1_linux-x64_bin-sdk/javafx-sdk-14.0.1/lib
set -x PATH (pwd) $HOME/mySoftwares/openjdk-12+32_linux-x64_bin/jdk-12

```

![IntelliJ Run Configuration](demo/intellij.png)

## Desktop Application

> We set scene on stage

* https://en.wikipedia.org/wiki/Apache_POI
* https://openjfx.io/
  * Desktop application than can run across multiple devices
  * [JavaFX](https://en.wikipedia.org/wiki/JavaFX) intended to replace swings as standard GUI
  * How to hook up controllers with UI Elements?
    * looks more advanced
      * can have 3D animations, charts
  * built into openJDK
  * stage - entire window
  * scene - content - buttons and menus
    * layout - arrangement on screen
* https://gluonhq.com/products/scene-builder/

```
--module-path /home/avi/mySoftwares/javafx-sdk-11.0.2/lib --add-modules=javafx.controls
```

## Issues

* https://github.com/gluonhq/client-samples/issues/9
* FXML Loader?


### Scenebuilder

* `/opt/SceneBuilder/SceneBuilder`
* [ ] Transision between scene to scene


## Native desktop App

* [Electron](https://youtu.be/m3OjWNFREJo)
* cross platform - MacOS, Windows
* render HTML, CSS and JS in a chrome window
* vscode, slack, discord, atlassian
* access nodeJS
* entrypoint `main.js`
* Add system tray
* Electron packager


### Pro

* render chrome with nodeJS
* Leverage Web Talent

### Cons

* Larger app size even with small functionality
* Higher resources consumption
* Alternatives - javaFX

## Resources

* https://github.com/callicoder/javafx-examples
* https://www.tutorialspoint.com/javafx/index.htm
* https://openjfx.io/javadoc/14/
* https://fxdocs.github.io/docs/index.html
* https://github.com/gluonhq/scenebuilder/wiki/Basic-JavaFX-project-with-Scene-Builder


### Demos

![demo1](demo/eventListner.png)
![demo2](demo/tileLayout.png)
![demo3](demo/title.png)
![demo4](demo/hello-world.png)