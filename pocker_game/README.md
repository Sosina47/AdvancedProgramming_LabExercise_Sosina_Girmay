# Poker Card Game 🎴

A simple Java console-based card game where the player selects a card and competes against the computer. The game uses random shuffling to simulate drawing cards from a deck and determines the winner based on the card values.

---

## Features

* Generates a deck of cards using Java collections
* Randomly shuffles cards using `Collections.shuffle()`
* Displays random card choices for the player
* Allows player input through the console
* Computer randomly selects a card from the remaining deck
* Compares player and computer cards to determine the winner
* Handles win, lose, and tie conditions

---

## How the Game Works

1. A deck containing cards numbered from 1 to 10 is created.
2. The deck is shuffled before showing cards to the player.
3. Three random cards are displayed as choices.
4. The player selects one card by entering its number.
5. The computer randomly draws a card from the remaining deck.
6. The selected cards are compared:

   * Higher card wins
   * Lower card loses
   * Equal cards result in a tie

---

## Concepts Implemented

### Java Collections Framework

* `ArrayList`
* `Collections.shuffle()`

### Object-Oriented Programming Concepts

* Class creation
* Main method execution

### User Input Handling

* `Scanner` class for console input

### Control Flow

* `for` loops
* `if-else` statements

### Randomization Logic

* Simulated card shuffling using built-in Java utilities

---

## Technologies Used

* Java
* Console/Terminal Interface

---

## Project Structure

```txt
pocker_game/
└── Game.java
```

---

## How to Run

### Clone the repository

```bash
git clone https://github.com/Sosina47/AdvancedProgramming_LabExercise_Sosina_Girmay.git
```

### Navigate to the project folder

```bash
cd AdvancedProgramming_LabExercise_Sosina_Girmay/pocker_game
```

### Compile the program

```bash
javac Game.java
```

### Run the program

```bash
java Game
```

---

## Example Gameplay

```txt
CHOOSE ONE OF THE CARDS:

7
2
9

9
You have selected: 9
The computer selected 4
YOU WON!
```

---

## Future Improvements

* Add real poker card suits and ranks
* Prevent invalid player inputs
* Create a graphical user interface (GUI)
* Add multiplayer support
* Implement scoring and multiple rounds
* Improve game rules to resemble actual poker mechanics

---

## Author

Developed by **Sosina Girmay**
