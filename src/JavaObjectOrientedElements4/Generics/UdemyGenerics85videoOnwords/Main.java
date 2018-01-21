package JavaObjectOrientedElements4.Generics.UdemyGenerics85videoOnwords;

public class Main {
    public static void main(String[] args) {
        FootBallPlayer joe=new FootBallPlayer("Joe");
        BaseBallPlayer pat=new BaseBallPlayer("pat");
        SoccerPlayer bash=new SoccerPlayer("bsh");


        Team<FootBallPlayer> adelaideCrows=new Team<>("Aelaide Crows");
        adelaideCrows.addPlayer(joe);
       // adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(bash);

        System.out.println(adelaideCrows.numPlayers());
        Team<BaseBallPlayer> ballPlayerTeam=new Team<>("chicago cubs");
        ballPlayerTeam.addPlayer(pat);
        Team<SoccerPlayer> brokenTeam=new Team<>("this wont work");
        brokenTeam.addPlayer(bash);


    }
}
