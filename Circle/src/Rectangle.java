public class Rectangle {

    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }else{
            return false;
        }
    }
}
