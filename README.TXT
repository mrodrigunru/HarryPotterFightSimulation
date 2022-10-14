------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Potter's Dare
PURPOSE OF PROJECT: To learn basic concepts about Java
VERSION or DATE: 1.0 (December delivery)
AUTHORS: Daniel Corzo González, Manuel Rodríguez Rodríguez, Ángel Romero Trigo
USER INSTRUCTIONS: Just make an object of InitData and execute main()

SUMMARY OF THE PROJECT:

This project is a duel simulator, where wizards fight each other in 
representation of their houses.

At first, all the Houses orders it members (Characters) in a special and different
way one from other. Then, Hogwarts ask for the first wizard to fight of each one.

Each wizard fight the others in descendant order of their energy points. If the
attacker wizard has more attack points than the resistance points of the defender
wizard, the difference is applied to the energy point of the second one. If not,
it doesn't apply any damage. If a wizard doesn't have any Energy points left, it
goes to the dungeon. The other characters returns to their respectives houses.

The simulation starts showing all the members of each house and the list of
new wands. When a duel finish, each wizard removes its wand and a new wand its assigned
it it doesn't go to the dungeon or there is no wand in the list left.

When there is a winner house or there have been 10 duels, the simulation stops.
It shows again the members in the house left, the list of wands and the dungeon.
In the end, it shows the winner house.