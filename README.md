# Stack-with-min-
Designing a stack which has a "Min" method which should return the minimum element

In this approach we designed our class with a second stack that only takes in the minimum elements.
This is space efficient because if the first element pushed onto the stack is really low, then we won't have to push any additional elements ono the second stack for quite some time.
And we can access the minimum element in O(1) time.
