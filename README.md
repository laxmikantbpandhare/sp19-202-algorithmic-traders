# Game : T-Rex
 

## Demo 

[<img src="https://github.com/laxmikantbpandhare/TRex-sp19-202-algorithmic-traders/blob/master/docs/trex.gif" height="550" width="1000">](https://www.youtube.com/watch?v=XFNGYsLeGJA)

## Introduction

Dinosaur, T-Rex is out in the wild and running around. He got some life intially which might get drained out when he hits some obstacles. He can also gain rewards and food by catching them. User can track his score and life based on the obstacles crossed and rewards collected. There are two levels in the game which user can cross based on the score. User wins the game at score of 200 and has the option to replay the game.

## Members 
   | Name                           | SJSU ID    |
   |--------------------------------|------------|
   | **Laxmikant Bhaskar Pandhare** | 013859989  |
   | **Prachi Chouksey**            | 013828945  |
   | **Pallavi Reddy**              | 013852800  |
   | **Wamiquw Ansari**             | 013764595  |
   | **Suyash Srivastava**          | 013591474  |
   
   
## About T-Rex's Story:  https://www.youtube.com/watch?v=AU99mCW95cg

[<img src="https://github.com/laxmikantbpandhare/TRex-sp19-202-algorithmic-traders/blob/master/docs/CMPE%20202%20-%20Trex%20Game%20Ad%20Video.gif" height="550" width="1000">](https://www.youtube.com/watch?v=AU99mCW95cg)

## Burndown Chart

https://drive.google.com/file/d/1Qa-W-6w4d4a4CYtXIrRqybHqqfZFgUG0/view?usp=sharing


![alt text](https://github.com/laxmikantbpandhare/TRex-sp19-202-algorithmic-traders/blob/master/docs/BurnDown.png)

![alt text](https://github.com/laxmikantbpandhare/TRex-sp19-202-algorithmic-traders/blob/master/docs/Burndown%20Chart.png)

## UI Mock screen

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/mockui/TRex_Home.jpeg)

### Individual Contributions

**Busi Pallavi Reddy** 

1. Brainstormed with team members for the user stories and game features for the T-Rex game.
2. Implemented the feature of making the dinosaur run, by making the GIF as multiple frames and made the obstacles move. 
3. Implemented Composite Pattern to set up the different Obstacles(Sky and Land) and Rewards(Coins and Food) in the game.
4. Worked with Suyash to set up the composite pattern based on the different levels.
5. Performed integration tests for composite and strategy pattern for different levels.
6. Added sounds for coins and losing life for dinosaur.
7. Contributed to drafting Use cases.
8. Drafted the Activity diagram for the T-Rex Game.
9. Performed end to end testing and made cosmetic changes.
10. Helped in creating the Ad video.
11. As a champion of XP value **"Respect"**, I made sure that all the team member's suggestions were entertained and a proper discussion was held for each of the team member's inputs. I made sure that every person was valued as a team member.

**Prachi Chouksey** 

1. Created user stories in the task sheet for the T-Rex game.
2. Created initial world for the game with basic actors.
3. Implemented Observer pattern in scoreboard and lifebar to update values when collision of dinosaur occurs with obstacles and rewards.
4. Performed unit testing for the observer pattern.
5. Implemented Game Over screen when the dinosaur loses all life.
6. Performed unit testing for game over feature.
7. Updated task sheet with the contribution hours in the task sheet.
8. Created use case specification document for the user stories.
9. Created class diagram and sequence diagram for observer pattern.
10. Contributed with Pallavi in creating Activity diagram.
11. As a champion of XP value **"Feedback"**, I gave timely suggestions and feedback to the team regarding patterns and use cases for the game.

**Laxmikant Pandhare** 

1. We started with initial meeting with the team. We discussed requirements and the way through which we are going to develop the application.
2. Did brainsorming with the colleagues and discussed different aspects and user stories.
3. Initially added life image on the game and thought of implementing it. But, After long discussion we finalized the progress bar and going to reduce it once Dinosaur looses.
4. Implemented Command Pattern to show the options and user will able to operate. The Client will select the operation and it will act accordingly.
5. Performed unit testing for the command pattern.
6. Created class diagram and sequence diagram for command pattern.
7. Helped in creating the Ad video.
8. Updated burndown chart according to worked hours.
9. Performed end to end testing and made cosmetic changes.
10. As part of XP value **"Courage"**, encouraged the team to discuss in case if they are facing any issues on the game implementation. So that, it will not impact on the sprint outcome.

**Wamique Ansari**

1. Our team met in the library to had an initial project discussion. We had discussions and compared various platforms like greenfoot and processing that we could use to develop our project . We decided to use greenfoot for our project to develop the game T-Rex. Discussed various features, use cases and patterns that needs to be implemented in the project.
2. To start with, added some of the actors needed for our T-Rex project and did some activities on these actors and explored more on greenfoot.
3. Explored prototype pattern and various ways to implement it, applied the same in a very simple way to get clone of some actors needed instead of creating from scratch.
4. Performed unit testing for the Prototype pattern for some actors and did knowledge transfer to the team members so that anyone can create clone of the objects needed in the same way.
5. After Pallavi was done with implementing the composite pattern, I added land, sky obstacles and rewards to the world relative to dinosaur movement to get the basic game working so that other team members can start working on other features.
6. Added the collision feature and get the actor with which the dinosaur is collided. Accordingly, other team members will add observers pattern for life and score. In case of collision, removing the obstacles and rewards. Did basic testing around the same to give a go ahead to the team. This was done as part of the user story "As a player, I want to collect rewards".
7. Added shaking effect to the dinosaur when it collides with the obstacles to make player more aware that the dinosaur is loosing life.
8. Needed to work on the game info screen to display after the game completes or the level changes. As there were many class's objects involved in implementing this feature, the classes were getting tight coupled. Explored various patterns in which this can be avoided. Figured out that mediator pattern could be applied to maintain loose coupling between the classes. Studied and explored mediator pattern and applied the same to implement this feature. This was done as part of the user story "As a player, I want to see level change screen".
9. After final integration, perform testing to check that new features are working fine and no existing functionalies are broken.
10. Created class diagram for the mediator pattern and sequence diagram for the user story "As a player, I want to collect rewards". Worked with the team to update project journal and ad Video.
11. As part of the XP value **"Simplicity"**, I ensured that things are kept simple and at the same time progress is made. Also, tasks discussed should be only done, nothing extra. Then we will move step by step further to achieve the same goal.

**Suyash Srivastava**

1. Brainstormed game ideas with team and finally zeroed in on Trex game.
2. Explored greenfoot framework and discussed patterns involved in the game with the team.
3. Worked on the dinosaur jump feature.
4. Worked on strategy pattern to implement game levels.
5. Pair programmed with Pallavi to define obstacles location and rewards location for all the levels.
6. Discussed with teammates to define game quit scenario.
7. Performed through testing of game.
8. Created the class and sequence diagram of strategy pattern.
9. Worked on video add developmemt.
10. As a part of XP value **"Communication"**, I ensured that the team meets for discussions at regular intervals and also interacts on slack





# Patterns and Diagrams for project

## Patterns implemented

#### Composite Pattern
The land obstacles, sky obstacles and rewards are added in the game using composite pattern.

#### Prototype pattern
To clone the numerous obstacles and rewards in the world, prototype pattern is used.

#### Strategy pattern
Placement of objects at different levels is handled through strategy pattern.

#### Mediator pattern
To avoid tight coupling between various classes in the game, mediator is used.

#### Observer pattern
Scoreboard and lives of the user are updated using observer pattern.

#### Command pattern
To start/quit the game, this pattern is used to send commands to the game.

## UML Diagrams

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Class%20Diagram_T-Rex.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Activity%20Diagram.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/UseCase%20Diagram.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Class%20Diagram%20-%20composite.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Class%20Diagram%20T%20Rex%20COmmand%20Pattern.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Class%20Diagram%20-%20Mediator%20Pattern.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/ClassDiagram-ObserverPattern_Scoreboard_Lifebar.png)

![alt text](https://github.com/nguyensjsu/sp19-202-algorithmic-traders/blob/master/docs/Strategy_Class_Diagram.png)


## Week1


```diff
+ Suyash Shrivastava
```

### What tasks did I work on / complete?
- Had brainstorming session with the team to discuss project ideas and finalize the developement framework.
- The game which caught our attention were T-rex, Road Fighter, Sequence Card Game and Flappy Bird. We evaluated each of these in terms of complexity of UI and the design patterns involved.
- We finally zeroed in on the T-Rex game.  It's a 2D game in which the T-rex dinasour has to dodge the obstacles coming its way while running from left to right on the screen. The score is incremneted constantly. The game ends as soon as the T-rex collides with an obstacle.
- We decided to use Greenfoot to develop the game.
- Each one of us have picked one XP value to make the development process as smooth as possible. I have chosen "Communication". It is my resposibility to ensure that the team meets for discussions at regular intervals. Also, we have a group on slack for project discussion.
- Discussed the features of the game with the implementaion details at length with the team. We gained better understanding of the game after the discussion. This allowed us to divide the tasks among team members judiciously.

### What am I planning to work on next?
- Invest time to learn and get better understanding of Greenfoot.
- Get design elememts required to implement the project. 

### What tasks are blocked waiting on another team member?
- Nothing as such.



```diff
+ Laxmikant Pandhare
```

### What tasks did I work on / complete?

* We started with initial meeting with the team. We discussed requirements and the way through which we are going to develop the application.
* Discussed different game ideas, features and the pattern that can be included in each and every game. We discussed below mentioned game and its features.
    - T-Rex
    - Road Fighter
    - Sequence
    - Flappy Bird
* At the end of the discussion, we finalized the T-Rex Game.
* Did brainsorming with the colleagues and discussed different aspects and user stories.
* Discussed about the design patterns that would be utilized in various parts of the game.
* Picked up the scrum value of "Courage", to ensure that each speaks whenver there is a obstacles in the developemnt. Through this the development plan will not get impacted.
* Explored the Green Foot tool.
* Discussed about the future plan and divided the work in the team accordingly.



### What am I planning to work on next?
* Planned to get familiar with Green foot tool and start with inital coding in the tool, just for understanding the variable functionalities of Green Foot.
* Implementation of features discussed in the spring planning meeting.


### What tasks are blocked waiting on another team member?
* Nothing as such.


```diff
+ Pallavi Reddy
```

### What tasks did I work on / complete?

* Worked with team members to decide on what use case we are going to pick as our team project. Talked about the various platforms - Green Foot and Processing.
* Explored the various game ideas like "T-Rex", "Road Fighter", "Sequence", "Flappy Bird". Discusses broadly the use cases of each.
* Finalized the T-Rex Game.
* Brainstormed with team members for the user stories and game features.
* Discussed about the design patterns that would cater the various requirements of the user stories.
* Picked up the scrum value of "RESPECT", to ensure that each team member is respected for the efforts that they put into the project.
* Explored the Green Foot tool.
* As a part of creating the world, figured out how to add GIFs. Added the T-Rex dinosaur to the world.



### What am I planning to work on next?

* Setting up the composite pattern for the objects to be added to the world.

  

### What tasks are blocked waiting on another team member or any blockers I faced?

* For the first week, there was no blocked tasks on anyone. 
* I faced a challenge on making the GIF work. Turns out that using the GIFImage class of greenfoot for a GIF, the transparent running GIF was getting overlapped and the dinosaur looked as if it had many legs. To overcome this, then I split the GIF to its individual frames and loaded the images to give the feeling of a GIF. 

```diff
+ Prachi Chouksey
```

## What tasks did I work on / complete?

* Brainstormed categories of the project first namely Machine Learning, Web Application, Gaming engine and finalised on Gaming Engine.
* Discussed game ideas like T-Rex, Road Fighter, Board game and concluded to build T-Rex game.
* Listed all the possible use cases and features at a high level.
* Discussed the design patterns that can be implemented for various features.
* Decided to allocate one design principle per team member in order to ensure all the design principles are followed throughout the project. I will be responsible for "Feedback" so that every team member is honest and open in providing feedback to others.

## What am I planning to work on next?
* Understanding Greenfoot tool better and documenting use cases.
* Implementing features finalised during the planning meeting.

## What tasks are blocked waiting on another team member?
* Nothing as such.


```diff
+ Wamique Ansari
```

  ### What tasks did I work on / complete?

1. Our team met in the library to had an initial project discussion. We had discussions and compared various platforms like greenfoot and processing that we could use to develop our project . We decided to use greenfoot for our project to develop a game.
2. Next, we had different ideas and came up with different games that can be developed and is doable using the greenfoot platform. We had different game ideas like Sequence Board Game, Flappy birds, T-Rex and Road Fighter.
3. Also, we discussed various desing patterns that could be incorporated in these games.
4. We finalized the game 'T-Rex' for our group project that would be developed in greenfoot.
5. We explored the greenfoot tool.

Moreover, every team member picked a XP value and I picked Simplicity. I would ensure that we do what is needed, but no more and we will create something we are proud of.

### What am I planning to work on next?

   1. To learn more about greenfoot to implement our solution.
   2. To learn about prototype design pattern. In our solution, some actors objects are supposed to be created multiple times.        In such a case, we can use prototype pattern to create clone from the existing object instead of creating the object          from scratch everytime using factory method pattern

### What tasks are blocked waiting on another team member?
   1. Nothing as such.

## Week2

```diff
+ Laxmikant Pandhare
```

### What tasks did I work on / complete?

* We started meeting and discussed about the implemented tasks in 15 minutes. After that, we discussed about the    implementation and the way through which we are going to develop the patterns ans it's dependency on the others.

* Initially added life image on the game and thought of implementing it. But, After long discussion we finalized the progress bar and going to reduce it once Dinosaur looses.

* Discussed different aspects of the projects.
* Did brainsorming with the colleagues and discussed different aspects and user stories.
* Discussed about the future plan and divided the work in the team accordingly.
* At the end of the discussion, we finalized our tasks for this week.


### What am I planning to work on next?
* I have planned to implement Game Over functionality once the life count gets Zero.
* Implementation of features discussed in the spring planning meeting.


### What tasks are blocked waiting on another team member?
* Waiting for Observer pattern to implement by team member. Once collision happends with dinosaur or bird, the observer will
notify and decorator reduce th life accordingly.

```diff
+ Suyash Shrivastava
```

### What tasks did I work on / complete?
- I browsed through Greenfoot documentation and watched few videos on youtube to develop a basic understanding of the Greenfoot.
- To kickstart development, each one of the team member started working on small task like making the T-rex jump, making the objects move, etc. I worked on jumping faeture of T-rex.
- I worked on defining the levels of the game using startegy pattern. There are three levels in the game. Each one has a separate strategy in terms of Trex speed, obstacles and points gain. I have added the obsctactles and rewards on all stratgies.

### What am I planning to work on next?
- I will define the exact locations where the obstacles will be introduced so that Composite pattern could be applied to display the screen.

### What tasks are blocked waiting on another team member?
- Nothing as such.

```diff
+ Wamique Ansari
```
### What tasks did I work on / complete?

1. Tried to explore greenfoot by going through various documentations and tutorials. Started to get hands on by adding actors to the greenfoot world and performing various activities on these actors, learned how to work with image scalings etc.
2. Added some of the actors needed for our T-Rex world project and did some activities on these actors.
3. Tried understanding prototype pattern and various type to implement it, applied the same in a very simple way to get clone of some actors needed instead of creating from scratch.

As part of Simplicity, we started to first get basic things worked by applying the greenfoot concepts to make actors perform so that we have a simple working model and then we will enhance by adding design patterns and more logics.

### What am I planning to work on next?

To add land obstacles, sky obstacles and rewards to the world relative to dinosaur movement. To place objects such that the dinosaur can avoid obstacle and take rewards and can continue if obstacles are being avoided.

### What tasks are blocked waiting on another team member?

Waiting for the composite pattern to be implemented by the team member 'Pallavi' so that I can create composite object and adding the objects on the screen. After the objects are added, collision feature will be added.

```diff
+ Prachi Chouksey
```

## What tasks did I work on / complete?

* Worked on user stories and use cases for T-Rex game.
* Added all the backlog items and tasks for the team in google task sheet.
* Created mock ui for game.
* Estimated the time to complete tasks and udpated in sprint task sheet.
* As part of XP value "Feedback", encouraged the team to provide feedback on the game design to each other and also gave feedback on the level strategy.
* Started working on user story- As a user, I want to collect rewards and see the live score based on rewards.

## What am I planning to work on next?
* Implement observer pattern to check the rewards collected by T-rex.
* Update live score of the user based on the rewards collected.

## What tasks are blocked waiting on another team member?
* Waiting for composite pattern to be setup to implement observer pattern on dinosaur and rewards.

```diff
+ Pallavi Reddy
```


### What tasks did I work on / complete?

- Set up the composite pattern for the T-Rex world. 
- With the discussion with team mates, set the composites as Rewards, Sky Obstacles and Land Obstacles.
- Decided with team members how the level settings and difficulty would be.
- Discussed with team members what how the life of the dinosaur would go about.

### What am I planning to work on next?

- To be adding the composite pattern based on the levels

  

### What tasks are blocked waiting on another team member or any blockers I faced?

- Waiting on Suyash to add the composite pattern based on the levels.

## Week3


```diff
+ Laxmikant Pandhare
```

### What tasks did I work on / complete?

* We started meeting and discussed about the implemented tasks in 15 minutes. After that, we discussed about the implementation and the way through which we are going to develop the remaining part od the project.
* Decided to implement Command Pattern at the start of the game. The Client will select the operation and it will act accordinglt.
* Discussed different aspects of the projects.
* Started working on user story- As a user, I want to play a game by selecting the 'Play' button at the start of the game.
* As part of XP value "Courage", encouraged the team to discuss in case if they are facing any issues on the game implementation. So that, it will not impact on the sprint outcome.
* Did brainsorming with the colleagues and discussed different aspects and user stories.
* Discussed about the future plan and divided the work in the team accordingly. Also, planned about the final documentation that we have to do as part of last Sprint.
* At the end of the discussion, we finalized our final tasks for this last sprint.


### What am I planning to work on next?
* I have planned to implement some additional functionality.
* I have planned to proceed with the documentation and testing part of the project.


### What tasks are blocked waiting on another team member?
* Nothing as such.

```diff
+ Suyash Shrivastava
```
### What tasks did I work on / complete?
- Pair programming with Pallavi to define level switch and composite pattern implementation.
- Defined loaction of obstacles and rewards for level 2.
- Discussed with teammates to define game quit scenario.

### What am I planning to work on next?
- Test the game to ensure its working properly.
- Create UML diagrams for the game.

### What tasks are blocked waiting on another team member or any blockers I faced?
- While working on level switch implementation, Pallavi and I faced few issues around removing objects from the world. Prachi helped us to figure that out.


```diff
+ Pallavi Reddy
```

### What tasks did I work on / complete?

- Worked with Suyash to setup the composite objects according to the different strategy of levels.  
- With the discussion with team mates, decided on the game over page and how levels should switch.
- Decided with team members, how the command pattern ca be implemented in play and quit scenarios.
- Integrated the code and pushed to development, with testing of levels.

### What am I planning to work on next?

- To incorporate any cosmetic changes if needed, test the team's changes and drawing UML diagrams.

  

### What tasks are blocked waiting on another team member or any blockers I faced?

- I had a blocker when I was trying to remove all the objects of a certain type from a level to switch strategies. With help from Prachi, figured out that the object making the call to remove the objects should be added to the World else World is not accessible. Fixed this issue.

```diff
+ Prach Chouksey
```

## What tasks did I work on / complete?

* Udated the task sheet with the hours worked for each task.
* Analysed burndown chart for the week to make sure the team is on track.
* After suyash and Pallavi completed strategy and composite pattern for the game, added the Game Over feature for the game when the life becomes zero.
* As part of XP value "Feedback", provided feedback on command pattern and encouraged the team to provide feedback.
* Updated project kanban board with the issues in progress


## What am I planning to work on next?
* Create pattern class diagram and project uml diagrams.
* Close issues on project kanban board.

## What tasks are blocked waiting on another team member?
* No dependencies for the week.

```diff
+ Wamique Ansari
```

### What tasks did I work on / complete?

1. After Pallavi was done with implementing the composite pattern, I added land, sky obstacles and rewards to the world relative to dinosaur movement to get the basic game working so that other team members can start working on other features.
2. Added the collision feature and get the actor with which the dinosaur is collided. Accordingly, other team members will add observers pattern for life and score. In case of collision, removing the obstacles and rewards.

As part of XP core value 'Simplicity', I ensured that things are kept simple and at the same time progress is made. Also, tasks discussed should be only done, nothing extra. Then we will move step by step further.

### What am I planning to work on next?

To add some effect to the dinosaur in case it collides with obstacles.

### What tasks are blocked waiting on another team member?

Nothing for this week.

## Week4


```diff
+ Laxmikant Pandhare
```

### What tasks did I work on / complete?

* We started meeting and discussed about the implemented project in 15 minutes. After that, we discussed about the  documentation and remaining part of the project.
* Discussed different aspects of the projects.
* Did brainsorming with the colleagues and discussed different aspects and remaining tasks.
* Create class diagram for the Command pattern.
* Create sequence diagram for the user story "As a player, I should be able to play or quit the game."
* Work with the team to create project journal and ad Video.
* At the end of the discussion, we finalized our final tasks for this last sprint.


### What am I planning to work on next?
* NA.


### What tasks are blocked waiting on another team member?
* NA.

```diff
+ Suyash Shrivastava
```

### What tasks did I work on / complete?
- Created the class and sequence diagram for the strategy pattern.
- Worked with team to write the main Readme file.
- Worked with team to create the AD Video.
- Performed testing to check all features of the game.

### What am I planning to work on next?
- None

### What tasks are blocked waiting on another team member or any blockers I faced?
- None

```diff
+ Pallavi Reddy
```

### What tasks did I work on / complete?

- Added the sounds for coin and losing life
- Worked with Prachi to draft the use cases.
- Drafted the Activity Diagram for the T-Rex Game.
- Drew the class diagram for the composite pattern.
- Drew the Sequence diagram for the composite pattern.
- Worked with team to write the main Readme file.
- Worked with team to create the AD Video.
- Performed end to end testing and applied cosmetic changes.

### What am I planning to work on next?

- None

  

### What tasks are blocked waiting on another team member or any blockers I faced?

- None

```diff
+ Prachi Chouksey
```

## What tasks did I work on / complete?

* Worked with Pallavi on Activity diagram.
* Worked with Pallavi on Use case specification document.
* Created Class diagram and sequence diagram for observer pattern.
* Worked with team on ad video for the game.
* Updated main journal for the project.
* Worked with team on the project ppt.
* Generated burndown chart with completed use cases.


## What am I planning to work on next?
NA

## What tasks are blocked waiting on another team member?
* NA

```diff
+ Wamique Ansari
```

### What tasks did I work on / complete?

1. Added shaking effect to the dinosaur when it collides with the obstacles to make player more aware that the dinosuar is loosing life.
2. Showed the game info screen to the user when the game completes or the level changes. As there were many class's objects involved in implementing this feature, the classes were getting tight coupled. Explored various patterns in which this can be avoided.
3. Figured out that mediator pattern could be applied to maintain loose coupling between the classes. Studied and explored mediator pattern and applied the same to implement this feature. This was done as part of the user story "As a player, I want to see level change screen".
4. After final integration, perform testing to check that new features are working fine and no existing functionalies are broken.
5. Create class diagram for the mediator pattern.
6. Create sequence diagram for the user story "As a player, I want to collect rewards."
7. Work with the team to create project journal and ad Video.

As part of Simplicity, we tried to keep things simple throughout the project.

### What am I planning to work on next?

None

### What tasks are blocked waiting on another team member?

None
