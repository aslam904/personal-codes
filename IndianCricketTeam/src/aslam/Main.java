package aslam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Test player1 =new Test("MS Dhoni",34,6000,2);
        Test player2 =new Test("Virat Kohli",30,7200,1);
        Test player3 =new Test("Sachin Tendulkar",38,15000,4);
        Test player4 =new Test("Jadeja",34,4500,10);
        Test player5 =new Test("Rishab pant",25,5000,0);
        T20 player10 =new T20("Suresh Raina",32,6500,1);
        T20 player11 =new T20("Deepak chahar",34,3000,15);
        T20 player12 =new T20("Shardul Thakur",34,2500,18);
        T20 player13 =new T20("Rohit sharma",34,7000,3);
        T20 player14 =new T20("Surya kumar yadav",28,6880,0);
        Odi player20 =new Odi("MS-Dhoni",34,10000,4);
        Odi player21 =new Odi("Virat Kohli",30,12000,5);
        Odi player22 =new Odi("Rohit sharma",34,13000,1);
        Odi player23 =new Odi("Sachin Tendulkar",38,25000,8);

        Team<Test> ICTT=new Team<Test>("Indian Test Team");
        Team<T20> ICTT20=new Team<T20>("Indian T20 Team");
        Team<Odi> ICTOdi=new Team<Odi>("Indian Odi Team");

        ICTT.addPlayer(player1);
        ICTT.addPlayer(player2);
        ICTT.addPlayer(player3);
        ICTT.addPlayer(player4);
        ICTT.addPlayer(player5);
        ICTT20.addPlayer(player10);
        ICTT20.addPlayer(player11);
        ICTT20.addPlayer(player12);
        ICTT20.addPlayer(player13);
        ICTT20.addPlayer(player14);
        ICTOdi.addPlayer(player20);
        ICTOdi.addPlayer(player21);
        ICTOdi.addPlayer(player22);
        ICTOdi.addPlayer(player23);

        ICTT.numOfPlayers();
        ICTOdi.numOfPlayers();
        ICTT20.numOfPlayers();
        Team<Test> SATT=new Team<Test>("South African Test Team");

        ICTT.matchResult(SATT,500,450);






    }
}
