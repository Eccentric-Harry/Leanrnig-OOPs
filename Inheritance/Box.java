class Box{
    float height;
    float width;
    float depth;

    Box(){
        this.height = -1;
        this.width = -1;
        this.depth = -1;
    }

    Box(float height, float width, float depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    Box(float side){
        this.height = side;
        this.width = side;
        this.depth = side;
    }

    Box(Box box){
        this.height = box.height;
        this.width = box.width;
        this.depth = box.depth;
    }

    public void information(){
        System.out.println("Information from the Box class" );
    }
}