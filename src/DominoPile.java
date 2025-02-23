import java.util.ArrayList;

public class DominoPile {
    ArrayList<Domino> pile = new ArrayList<Domino>();

    public void newStack6(){
        pile.clear();
        for(int i=0; i<=6; i++){
            for(int j=i; j<=6; j++){
                pile.add(new Domino(i,j));
            }
        }
    }

    public void shuffle(){
        ArrayList<Domino> pile2 = new ArrayList<Domino>();
        for(int i=0; i<pile.size(); i++){
            pile2.add((int)Math.random()*pile.size(), pile.get(i));
        }
        pile = pile2;
    }

    public ArrayList<Domino> getPile(){
        return pile;
    }
}
