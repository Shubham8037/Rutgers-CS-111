# CS111 Project Description Fall 2016 Milestone 1

In this project you will be using the knowledge you gained from lectures and homeworks and applying them to a lengthier programming assignment. The answers to some of your questions do not strictly reside in this document. You are encouraged to look at other sources for inspiration. This semester’s project will involve the popular game Connect Four.
 
This is an individual project, and as such you will be held to the University’s academic integrity policies. You are welcome to discuss strategies and ideas with other students (and will be encouraged to in recitation), but you must code the project on your own.
 
The project will be divided into Weekly Milestones. You will have deliverables due every week as described by the milestone document. Below is a general overview of the project, as well as Milestone 1.
 
This project is what you make of it.  There are points assigned to each milestone, which are further broken down into tasks. However, you should not be limited by what we suggest the minimum work required here is. To get the most out of this project, I urge you all to push yourselves to find your limits. You might surprise yourself! Good luck!
Your assignment will be to implement a functional computer version of the game Connect Four. For those of you unfamiliar with the game and rules, please consult the Wikipedia article about the same: https://en.wikipedia.org/wiki/Connect_Four
 
A basic introduction follows (copied verbatim from the Wikipedia Article): is a two-player connection game in which the players first choose a color and then take turns dropping colored discs from the top into a seven-column, six-row vertically suspended grid. The pieces fall straight down, occupying the next available space within the column. The objective of the game is to connect four of one's own discs of the same color next to each other vertically, horizontally, or diagonally before your opponent.
 
Milestone 1: Due 11/21 @ 11:59 pm. (5pm due time, grace period until 11:59pm) (Check, Check+, Check-)
## Task 1: Play Connect Four
This Milestone is the design phase of your project. However your first order of business is to actually play some Connect Four. You can pick up the physical game from many online and brick and mortar retailers and play with your fellow CS111 classmates, roommates, friends, family, etc. You’ll want to get a sense of the rules and strategies that make a good Connect Four player. Alternatively, you may visit one of the many websites that offer Connect Four as an online game. http://www.pogo.com/games/connect4
 
## Task 2: List information needed to play (submitted on sakai)
After playing a good number of rounds of Connect Four, take a survey of the most basic information that one might need in order to program a game. Put this into a file called design.txt. Consider and note any error conditions that might occur from incorrect values of the inputs you’ve listed.
 
## Task 3: Design a basic game loop for playing Connect Four (submitted on sakai)
Create a flowchart and/or pseudocode outlining the basic game loop. In other words, show the components of game play between two players and the correct ordering of operations. You need to be able to determine exit conditions, input parameters, etc. (Think back to the beginning of the semester when we were working with flowcharts, and what was necessary to be included). At this point, you should also consider how to organize parts of your flowchart into function units (think subroutines). The operations you may use in the flowchart are: storing values in variables, output (print), input, mathematical operations (+/*-), looping, conditionals/decisions, comparators, String operations. Visit piazza.com if you have questions about any other operations. Please label this document gameLoop(.txt,.docx, .pdf, ...etc)
 
## Task 4: Optimizing Strategies for playing Connect Four (submitted on sakai)
Now imagine you are building a hint system for a player of Connect Four. Your goal is to build an algorithm to suggest the next column a player should place their chip. Ideally, your algorithm will be better than your peers’ so that you can win. Sketch out your algorithms in any form you see fit.  Please label this document strategy (.txt,.docx, .pdf, ...etc)
