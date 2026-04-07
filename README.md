# Prototype Design Pattern – Animal Example

## 📌 Overview
This project demonstrates the **Prototype Design Pattern** in Java.  
Instead of creating new objects using `new`, objects are created by **cloning existing prototype instances**.

---

### Structure

**Animal (Interface)**
- Declares:
  - `clone()` → creates a copy of the object  
  - `getType()` → returns the animal type  

---

**Concrete Classes**
- **Sheep**
  - Property: `name`
- **Cow**
  - Property: `sound`
- **Horse**
  - Property: `color`

Each class:
- Implements `Animal`
- Provides its own `clone()` method
- Includes getters/setters

---

**3. AnimalRegistry**
- Stores prototype objects:
  - `Sheep`
  - `Cow`
  - `Horse`
- Provides factory methods:
  - `createSheep()`
  - `createCow()`
  - `createHorse()`

👉 Each method returns a **cloned object**, not the original.

---

**4. TestAnimal (Main Class)**
- Creates objects using `AnimalRegistry`
- Modifies cloned objects
- Prints results

---

### How It Works
1. `AnimalRegistry` initializes prototype objects.
2. Client requests an object.
3. Registry clones the prototype.
4. Client customizes the cloned object.

---
