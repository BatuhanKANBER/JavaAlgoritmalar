package LinkedList_4;

public class Player {
    int number;
    String fullName;
    String position;
    int goals;
    int assists;
    int cont;
    Player next;

    public Player(int number, String fullName, String position, int goals, int assists) {
        this.number = number;
        this.fullName = fullName;
        this.position = position;
        this.goals = goals;
        this.assists = assists;
        cont = goals + assists;
    }
}
