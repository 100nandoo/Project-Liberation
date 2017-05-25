# Liberation
Terminal RPG Games written in Java.

## Description
The purpose this game is made, is as a requirement to finish OOP Class - CSE 10264, University of Pelita Harapan.

The game mechanic is same as RPG games, it's pretty simple actually. You can customize your character by buying new item, fighting monster to leveling up and get money.

### Interface
You will be greet by an opening story, and then you start in a city. You interact the game by input selection number from terminal. The game menu is a numbered list, for example:
> 1. Show status
> 2. Visit Inn
> 3. Open Map

So you type "1" press enter, and the game will open the "Show status" menu.

### World Tree
This is the game world tree looks like.
```
World
|   Grommich City
|   └───City Inn
|   Weldar City
|   └───City Inn
|   Afrodit Cave
|   Exodus Cave
│   Si Lau Temple
|   Gatoo Inn
|   Cranera Inn
|   Carrocos Mega City
|   └───City Inn
|   └───Sacred Temple
|   └───College
```

### Class Structure
From the development perspective the class structure looks like this:
```
Main Games Class
|   City Class
|   └───Status Class
|   └───Inn Class
|   Cave Class
|   └───Monster Class
|   └───Status Class
│   Training Ground Class
|   Inn Class
|   Mega City Class
|   └───Inn Class
|   └───Training Ground Class
|   └───College Class
```

There is a missname in Temple class, instead of using "Temple Class" we name it, "TrainingGround Class". Also the "shop, item, HP_Potion"  classes is not use, because the code is still buggy.

# Author
1. Adrian Koeswanto --> create the shop classes, item class and provide snack when we're developing the games.
2. Fernando Fransisko H (myself) --> design the games classes, and code most of the classes, and write the games story.
3. William Linardy --> create the dungeon, and monster class.
