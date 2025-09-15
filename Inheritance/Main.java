public class Main{
    public static void main(String[] args){
        Box box = new Box(10.0f);
        System.out.println(box.height);

        BoxWeight boxWeight = new BoxWeight(10,20,30,40);
        System.out.println(boxWeight.weight);

        Box box2 = new Box(10.0f);
        System.out.println(box2.height);

        // BoxWeight box3 = new Box(10,20,30); // This is not allowed
        // because Box is now not initialized with weight
        // Hence we cannot access weight property
        // Parent class = new Child class [is Allowed]
        // Child class = new Parent class [is Not Allowed]
//        System.out.println(box3.weight);
    }
}


// let's breakdown the line: Box b = new BoxWeight(10,20,30,40);

// it is similar to haveing a constrctor :
//BoxWeight(BoxWeight other){
//    super(other);
//    this.weight = other.weight;
//}
//
//Box(float height, float width, float depth){
//    this.height = height;
//    this.width = width;
//    this.depth = depth;
//}

// both these are wired together to form the line: Box b = new BoxWeight(10,20,30,40);