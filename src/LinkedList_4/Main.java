package LinkedList_4;

public class Main {
    public static void main(String[] args) {
        TeamBuilder teamBuilder = new TeamBuilder();
        teamBuilder.addStart();
        teamBuilder.addStart();
        teamBuilder.show();
        teamBuilder.addEnd();
        teamBuilder.show();
        teamBuilder.addStart();
        teamBuilder.show();
        teamBuilder.addForIndex(1);
        teamBuilder.show();
        teamBuilder.addForIndex(0);
        teamBuilder.show();
        teamBuilder.addForIndex(6);
        teamBuilder.show();

    }
}
