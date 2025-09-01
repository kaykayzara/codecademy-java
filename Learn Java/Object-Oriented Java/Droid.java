/*
 Project: Build a Droid (Codecademy – Learn Java)

 Summary:
 - Define a simple `Droid` class that models state (name, batteryLevel)
   and behavior (performing tasks, reporting battery).
 - Practice instance fields, constructors, instance methods, `toString()`,
   and using objects in `main`.

 Concepts practiced:
 - Classes/objects, fields, constructors
 - Method parameters/return types, `void` methods
 - Overriding `toString()`
 - Mutating object state

 Run:
   javac Droid.java
   java Droid

 Possible extensions:
 - Guard battery not dropping below 0; cap at 100.
 - Add `energyReport()` and `energyTransfer(Droid other, int amount)`.
 - Input handling or a simple command menu in `main`.
*/

// 1) Create a public class `Droid` and include `public static void main(String[] args)`.
public class Droid {
  // 2) Declare instance field `int batteryLevel` (whole-number battery percent).
  int batteryLevel;
  // 3) Declare instance field `String name` (the droid’s name).
  String name;

  // 4) Create a constructor `Droid(String droidName)`.
  public Droid(String droidName) {
    // 5) In the constructor, set `name = droidName` and `batteryLevel = 100`.
    name = droidName;
    batteryLevel = 100;
  }

  // 9) Define method `void performTask(String task)`.
  public void performTask(String task) {
    // 10) Inside `performTask`, print "<name> is performing task: <task>".
    System.out.println(name + " is performing task: " + task);
    // 11) After printing, reduce `batteryLevel` by 10 (batteryLevel = batteryLevel - 10).
    batteryLevel -= 10;
  }

  // 8) Override `public String toString()` to return an intro string, e.g.:
  //    "Hello, I'm the droid: <name>".
  @Override
  public String toString() {
    return "Hello, I'm the droid: " + name;
  }

  public static void main(String[] args) {
      // 6) In main, instantiate a `Droid` named "Codey" (e.g., `new Droid("Codey")`).
    Droid droidName = new Droid("Codey");
    // 7) Print the variable (will use `toString()` when implemented).
    System.out.println(droidName);
    // 12) In main, call `performTask` on your droid for a few tasks and print results.
    droidName.performTask("take out the trash");
    droidName.performTask("teach math");
    droidName.performTask("sing a song");
  }



}
