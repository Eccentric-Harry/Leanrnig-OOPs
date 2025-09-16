public class BoxPrice extends BoxWeight{
    float price;

    BoxPrice(){
        super();
        this.price = 100;
    }

    BoxPrice(float price){
        super();
        this.price = price;
    }

    BoxPrice(float l, float h, float d, float w, float p){
        super(l,h,d,w);
        this.price = p;
    }

    BoxPrice(float side, float weight, float price){
        super(side, weight);
        this.price = price;
    }
}