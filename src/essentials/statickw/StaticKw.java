package essentials.statickw;

/*
A static block is used for instializing static variables.

The code in the static block will get executed, once either of the below condition satifies, when
The object is created
The first time a static member of that class is accessed.

A class can have multiple static blocks, which will execute in the 
same sequence in which they have been written.


Rules of Static block:
Static block cannot return a value
Static blocks get executed before constructors.
Static block is used to initialize static variables only; 
it gives compilation error if we try to initialize non-static variables.

Keywords like "this" and "super" cannot be used inside the static block.

static blocks and methods, cannot access non-static members.
*/
public class StaticKw {

}
