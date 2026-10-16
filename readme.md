# Low-Level Design

Java exercises written while working through *Head First Design Patterns* (Freeman & Robson). Each directory under `src/` covers one pattern, using the book's example.

## Patterns

| Pattern | Directory | Example | Entry point |
|---|---|---|---|
| Strategy | `Strategy/Ducks` | Ducks with swappable fly/quack behaviors | `MiniDuckSimulator` |
| Observer | `Observer/WeatherStation` | Weather station pushing updates to displays | `WeatherStation` |
| | `Observer/SwingObserverExample` | Swing button listeners as observers | `SwingObserverExample` |
| Decorator | `Decorator/Starbuzz` | Coffee orders wrapped in condiment decorators | `StarbuzzCoffee` |
| | `Decorator/LowerCaseInputStream` | Custom `java.io` stream decorator | `InputTest` |
| Factory | `Factory/Pizza` | Regional pizza stores and ingredient factories | `PizzaTester` |
| Singleton | `Singleton` | Classic singleton and a chocolate boiler | none |
| Command | `Command/Remote` | Remote control with undo and macro commands | `RemoteLoader` |
| Adapter | `Adapter/Ducks` | Turkeys adapted to act like ducks | `DuckTestDrive` |
| Facade | `Adapter/HomeTheater` | One facade over home theater components | `HomeTheaterTestDrive` |
| Template Method | `Template-Method/StarBuzz` | Coffee and tea sharing a brewing algorithm | `BeverageTestDrive` |
| | `Template-Method/Ducks` | Sorting ducks with `Comparable` | `DuckSortTestDrive` |
| | `Template-Method/JFrame` | `JFrame.paint` as a hook | `MyFrame` |
| Iterator / Composite | `Iterator` | Nested menus walked with a composite iterator | `MenuTestDrive` |
| State | `State` | Gumball machine with state objects | `GumballMachineTestDrive` |
| Proxy | `Proxy/Rmi` | Minimal Java RMI service | `MyRemoteImpl`, `MyRemoteClient` |
| | `Proxy/Remote` | Remote monitor for the gumball machine | `GumballMonitorTestDriveServer`, `GumballMonitorTestDriveClient` |
| | `Proxy/Virtual` | Placeholder icon shown while an image loads | `ImageProxyTestDrive` |
| | `Proxy/Dynamic` | Access control with `java.lang.reflect.Proxy` | `MatchMakingTestDrive` |
| Compound | `Combined/Ducks` | Adapter, Composite, Decorator, Factory and Observer combined | `DuckSimulator` |
| MVC | `ModelViewController` | Beat-tempo DJ app, plus a heart-monitor model adapted into it | `DJTestDrive`, `HeartTestDrive` |

## Running

This is an IntelliJ IDEA project with `src/` as the source root. To run an example, open the project and run the entry-point class's `main` method.

From the command line, most directories use the default package and compile on their own:

```sh
cd src/Strategy/Ducks
javac -d /tmp/out *.java
java -cp /tmp/out MiniDuckSimulator
```

`Combined`, `Iterator`, `ModelViewController`, `Singleton` and `State` declare packages, and `Proxy/Remote` imports from `State`. Compile those from `src/`:

```sh
cd src
javac -d /tmp/out State/*.java
java -cp /tmp/out State.GumballMachineTestDrive
```

### Notes

- `InputTest` reads `test.txt` from the working directory. Run it from `src/Decorator/LowerCaseInputStream`.
- The RMI examples need a registry. Start `rmiregistry` from the compiled classes directory, then the server, then the client.
- `Observer/SwingObserverExample`, `Template-Method/JFrame`, `Proxy/Virtual` and `ModelViewController` open Swing windows.
