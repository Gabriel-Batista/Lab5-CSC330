# Lab5-CSC330

(2)  The Walking Drunkard (or Random Walk) Problem – focus on Encapsulation and putting Java Collections to work (80 pts): 
Imagine an infinite grid of streets where locations/intersections are represented as integer pairs (x, y) – or more precisely, (avenue, street) pairs.  For example, you might be on the intersection of 8th Ave and 52nd Street. Now consider someone that has had 1 drink too many – that person starts at a given intersection and then stumbles to the next intersection, but in a completely random, poorly-thought-out direction. So the “drunkard” might start at 7th Ave and 90th street - then randomly picks one of eight directions as a next step. Notice that “diagonal” steps represent a 2 linear-block move while the others represent a single linear block move:

1. Forward / North – 7th Ave and 91st Street
2. Right / East – 6th Ave and 90th Street. 
3. Backward / South – 7th Ave and 89th Street. 
4. Left / West – 8th Ave and 90th Street  
5. Forward-Right / Northeast – 6th Ave and 91st Street 
6. Backward-Right / Southeast – 6th Ave and 89nt Street 
7. Backward-Left / Southwest – 8th Ave and 89nt Street 
8. Forward-Left / Northwest – 8th Ave and 91st Street 

See NYC grid below as an example, but our grid can be larger in scope – and as you may experience, negative values for Streets / Avenues are allowed.  

Lab 5 is all about modeling random movement and keeping key statistics on a block-by-block trip covered by drunken (or random) behavior ;-) 

Very often as a professional software developer, you’ll be asked to modify existing or partially completed code, rather than start an application from scratch.  That’s exactly what you’re being asked to do here.

You’re being provided with three starter Classes:

1. Direction enum – defines Direction constants, and methods related to using Direction values.  
2. Intersection – simply models the street corner – or the (avenue, street) coordinates.  
3. DrunkWalker – models a drunkard “navigating” intersection to intersection. 
4. DrunkWalkTester – is a “test harness” for the DrunkWalker Class. 

Your job will be to submit all 4 Classes/enum with modifications that make them far more functional than they were when you found them.  

And here’s what needs to be done: 

1. Direction enum – already encompasses 4 of the 8 (plus NONE) Direction-set values required.  You need to:
a. Add the 4 additional Values
b. Make appropriate changes to the getNextRandom() method to consider the 4 new Direction values. 
2. Intersection:
a. Use Eclipse code generating features (in Editor pane ‘right-click’->source ) to generate:	
i. a constructor that accepts avenue and street values (and of course assigns them to the Class’ data members). 
ii. getters/setters for the two private data members (avenue, street). 
iii. hashCode() and equals() methods 
iv. toString() method.  	
b. Populate the main() method to perform the following:
i. Create 2 instances of Intersection that represent two different grid/street corners.  
ii. Display the value of both instances using toString() – either explicitly or implicitly. 
iii. Test the equality of the two instances you created using the equals() method – display the results of the if/equals test – proving that equals is working properly. 

3. DrunkWalker – models the drunkard “navigating” intersection to intersection. Your update tasks for this Class are follows:
a. Implement the hollowed out 
DrunkWalker(int avenue, int street) constructor. 
b. Complete the implementation of the following methods. In all cases, let the comments in each method be your guide:
i. public void step().   
ii. public String getLocation() 
iii. public void fastForward(int steps) 
iv. public int howFar() 
v. private void takeAStep()
vi. public void displayWalkDetails() 
c. add the appropriate Collection data members to support the methods above … 
d. Implement a toString() method using the Eclipse->Source feature (do this last – when you have the full structure of the Class worked out.  You don’t need to include all data member’s state in toString() – you decide what you want to see displayed while developing and testing the application. 

4. DrunkWalkTester – is a “test harness” for the DrunkWalker Class. 
You will leave the existing code in the runTest() method alone, but you’ll add to it as dictated by the comments that appear at the end of that method:
		/** 
		 * Expand the test above to include the following ... 
		 * Create a 2nd instances of DrunkWalker - Harvey  
		 * Have then race each - which instance (billy or harvey)  
		 * manages to walk a greater distance with 200 steps?  
		 * 
		 * Also invoke the displayWalkDetails() on both instances.
 */






Files you need to submit:
1)  This Word Document – with part 1 questions provided above and your program output pasted below.  

2)  The 4 completed source files for the following Classes/enum:
i. Intersection 
ii. DrunkWalker 
iii. DrunkWalkTester 
iv. Direction 


-------------------------------------------------------Sample Output--------------------------------------------------------



Intersection:  
Corner 1: Intersection [avenue=6, street=23]
Corner 2: Intersection [avenue=7, street=41]
Corners are not equal.
[Intersection [avenue=1, street=3], Intersection [avenue=3, street=4], Intersection [avenue=6, street=23], Intersection [avenue=7, street=34], Intersection [avenue=7, street=41]]



DrunkWalker:  
billy's location after 1 steps: Current location: DrunkWalker [avenue=7, street=23]
billy's location after 2 steps: Current location: DrunkWalker [avenue=7, street=22]
billy's location after 3 steps: Current location: DrunkWalker [avenue=6, street=21]
Current location after fastForward(): Current location: DrunkWalker [avenue=6, street=21]
That's 2 blocks from start.

Start Time: Tue Oct 18 15:07:44 EDT 2016
End time - After FF: Tue Oct 18 15:07:45 EDT 2016
Starting Location: Intersection [avenue=10, street=42]
Current/Ending Location: Intersection [avenue=11, street=61]
Distance (blocks): 20
Number of steps taken: 100
Number of unique intersections visited: 71

Visited Intersection [avenue=8, street=42] 3 times!
Visited Intersection [avenue=8, street=63] 2 times!
Visited Intersection [avenue=9, street=41] 2 times!
Visited Intersection [avenue=9, street=42] 3 times!
Visited Intersection [avenue=9, street=43] 2 times!
Visited Intersection [avenue=9, street=63] 3 times!
Visited Intersection [avenue=10, street=41] 2 times!
Visited Intersection [avenue=10, street=42] 3 times!
Visited Intersection [avenue=10, street=43] 2 times!
Visited Intersection [avenue=10, street=44] 2 times!
Visited Intersection [avenue=10, street=49] 4 times!
Visited Intersection [avenue=10, street=54] 2 times!
Visited Intersection [avenue=10, street=55] 3 times!
Visited Intersection [avenue=10, street=62] 2 times!
Visited Intersection [avenue=10, street=64] 2 times!
Visited Intersection [avenue=11, street=49] 2 times!
Visited Intersection [avenue=11, street=50] 5 times!
Visited Intersection [avenue=11, street=62] 2 times!
Visited Intersection [avenue=12, street=47] 2 times!



DrunkWalkTester:  
Enter the starting avenue value: 5
Enter the starting street value: 23
Billy's Current location: DrunkWalker [avenue=-2, street=28]
That's 12 blocks from start.
Starting Location: Intersection [avenue=5, street=23]
Current/Ending Location: Intersection [avenue=-2, street=28]
Distance (blocks): 12
Number of steps taken: 50
Number of unique intersections visited: 32

Visited Intersection [avenue=-3, street=26] 3 times!
Visited Intersection [avenue=-2, street=27] 2 times!
Visited Intersection [avenue=-1, street=25] 2 times!
Visited Intersection [avenue=-1, street=27] 3 times!
Visited Intersection [avenue=0, street=26] 2 times!
Visited Intersection [avenue=0, street=27] 3 times!
Visited Intersection [avenue=0, street=28] 2 times!
Visited Intersection [avenue=1, street=26] 2 times!
Visited Intersection [avenue=1, street=27] 2 times!
Visited Intersection [avenue=1, street=29] 2 times!
Visited Intersection [avenue=3, street=26] 3 times!
Visited Intersection [avenue=4, street=25] 2 times!
Visited Intersection [avenue=5, street=24] 2 times!
Visited Intersection [avenue=5, street=25] 2 times!

