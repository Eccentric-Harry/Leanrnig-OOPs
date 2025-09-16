class BoxWeight extends Box{
    float weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(float lenght, float height, float depth, float wieght){
        super(lenght, height, depth); // calls the constructor of the parent class
        // if this is not called, then the default constructor of the parent class is called
//        System.out.println(super.width);// accessing the parent class property
        this.weight = wieght;
    }

    BoxWeight(BoxWeight bw){
        super(bw); // calls the copy constructor of the parent class
        this.weight = bw.weight;
    }
    // can be called because we can pass objects of type boxweight in box where box can be accecpted.
    BoxWeight(float side, float weight){
        super(side);
        this.weight = weight;
    }
}