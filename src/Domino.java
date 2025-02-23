public class Domino {
    private int top;
    private int bottom;

    public Domino(){
        this.top = 0;
        this.bottom = 0;
    }

    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop(){
        return this.top;
    }

    public int getBottom(){
        return this.bottom;
    }

    public void setTop(int top){
        this.top = top;
    }

    public void setBottom(int bottom){
        this.bottom = bottom;
    }

    public String toString(){
        return top + "/" + bottom;
    }

    public void flip(){
        int holder = top;
        top = bottom;
        bottom = holder;
    }
    public void settle(){
        if (bottom < top) {
            flip();
        }
    }

    public int compareTo(Domino other){
        int thisSmall;
        int otherSmall;
        int thisBig;
        int otherBig;
        if(this.top<this.bottom){
            thisSmall = this.top;
            thisBig = this.bottom;
        }
        else{
            thisSmall = this.bottom;
            thisBig = this.top;
        }

        if(other.top<other.bottom){
            otherSmall = other.top;
            otherBig = other.bottom;
        }
        else{
            otherSmall = other.bottom;
            otherBig = other.top;
        }

        if(thisSmall<otherSmall){
            return -1;
        }
        else if(thisSmall>otherSmall){
            return 1;
        }
        else{
            if(thisBig<otherBig){
                return -1;
            }
            else if(thisBig>otherBig){
                return 1;
            }
            else{
                return 0;
            }
        }
    }

    public int compareToWeight(Domino other){
        int thisWeight = this.top + this.bottom;
        int otherWeight = other.top + other.bottom;
        if(thisWeight<otherWeight){
            return -1;
        }
        else if(thisWeight>otherWeight){
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean canConnect(Domino other){
        return this.top == other.top || this.top == other.bottom || this.bottom == other.top || this.bottom == other.bottom;
    }
}
