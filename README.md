# Space Invaders: Mario Edition

## Overview
"Space Invaders: Mario Edition" is a fun reimagining of the classic arcade game Space Invaders, featuring characters and visuals from the Mario universe. Players control Mario's spaceship to eliminate waves of enemies, such as Bowser, Donkey Kong, Goomba, and Luigi. The game becomes progressively more challenging with each level as the alien invaders multiply and descend.

## Features
- **Mario-Themed Gameplay**: Includes Mario as the ship and enemies like Bowser, Donkey Kong, and Goomba as alien invaders.
- **Classic Space Invaders Mechanics**: Control Mario’s ship to shoot bullets and destroy incoming enemies.
- **Level Progression**: Each cleared wave adds more enemies, increasing the game's difficulty.
- **Collision Detection**: Bullets collide with enemies to eliminate them, while aliens descending to Mario's level result in a "Game Over."
- **Score Tracking**: The player’s score increases based on eliminated enemies and cleared levels.
- **Restart Functionality**: Players can restart the game after a "Game Over" with any key.

## Technologies Used
- **Java**: Implements the game’s logic, including object-oriented programming for the ship, aliens, bullets, and collision detection.
- **Swing Framework**: Provides the graphical user interface, rendering the game board and characters.
- **Event Handling**: Captures keyboard inputs for ship movement and shooting bullets.
- **Timer and Graphics**: Updates game state and animations at 60 frames per second.

## Files
- **App.java**: Initializes the game window, sets its properties, and launches the `SpaceInvaders` class.
- **SpaceInvaders.java**: Contains the main game logic, including the movement of Mario’s ship, alien behavior, bullet handling, collision detection, and level progression.

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repository-name.git
2. Compile the Java files:
   ```bash
   javac App.java SpaceInvaders.java
3. Run the application:
   ```bash
   java App

## How to Play:
- Use the Left Arrow and Right Arrow keys to move Mario’s spaceship.
- Press the Spacebar to shoot bullets at the incoming enemies.
- Clear all enemies on the screen to progress to the next level.
- Avoid letting the enemies descend to Mario’s level to prevent a "Game Over."
- After a "Game Over," press any key to restart the game.

## License:
This project is open-source and available under the MIT License.

## Author:
Romeo Maunick - A developer passionate about merging nostalgic arcade mechanics with modern and themed designs to create engaging games.















