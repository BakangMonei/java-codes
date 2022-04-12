package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Run {
    public static void main(String[] args) {
        Coach coach1 = new Coach("CoachBK", "Coach@123", "Professor", "BK", 30, "BSc in Sports", "PipeYaMarasta FC", "PiiiiiPiiiiiiPiiiiiiiiii FC");
        LeagueAdmin LA1PipeYaMarasta = new LeagueAdmin("LA1", "LA1@LA1", "12345", 123, 234, "ClubLeagueMembership PipeYaMarasta FC");
        TeamAdmin PipeYaMarasta = new TeamAdmin("PIM001", "PIM001", "1234esw", "Pitikwe FC", "Defender1", "400m by 400m", "Coach1");
        Defender defender1 = new Defender("Defender1", "Defender1@", 123, 32, "Wesly", "Jozi", 20, 'M', 321);
        GoalKeeper goalKeeper1 = new GoalKeeper("Goalkeeper1", "Goalkeeper@1", 101, 999, "Max", "JavaFX", 23, 'M', 394);
        Midfielder midfielder1 = new Midfielder("Midfield1", "Midfield@1", 222, 43, "AMG", "Gibe", 22, 'M', 4321);
        Strikers striker1 = new Strikers("Striker1", "Striker@1", 1233, 55, "Davince", "Chanaki", 22, 'M', 323);
        FootballGround ground = new FootballGround("Pipe Grounds", "PO Box 817 Gabs", "Gaborone", "Coach1", 5467, 2002, 1600);
        Administrator admin1 = new Administrator("Admin1", "Admin@123", "Records in the System");

        System.out.println();

        // Coach File
        Coach[] MyCoach = new Coach[3];
        MyCoach[0] = coach1;
        // Creating a new File
        File coach = new File("coach.txt");
        try{
            PrintWriter printWriter = new PrintWriter(coach);
            printWriter.println(MyCoach[0].toString());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // LeagueAdmin File
        LeagueAdmin[] MyLeagueAdmin = new LeagueAdmin[3];
        MyLeagueAdmin[0] = LA1PipeYaMarasta;
        // Creating a new File
        File leagueAdmin = new File("leagueAdmin.txt");
        try{
            PrintWriter printWriter = new PrintWriter(leagueAdmin);
            printWriter.println(MyLeagueAdmin[0].toString());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // TeamAdmin File
        TeamAdmin[] MyTeamAdmin = new TeamAdmin[3];
        MyTeamAdmin[0] = PipeYaMarasta;
        // Creating a new File
        File teamAdmin = new File("teamAdmin.txt");
        try{
            PrintWriter printWriter = new PrintWriter(teamAdmin);
            printWriter.println(MyTeamAdmin[0].toString());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Defender File
        Defender[] MyDefender = new Defender[3];
        MyDefender[0] = defender1;
        // Creating a new File
        File defender = new File("Defender.txt");
        try{
            PrintWriter printWriter = new PrintWriter(defender);
            printWriter.println(MyDefender[0].toString());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Goalkeeper File
        GoalKeeper[] MyGoalkeeper = new GoalKeeper[7];
        MyGoalkeeper[0] = goalKeeper1;
        // Creating a new File
        File goalkeeper = new File("GoalKeeper.txt");
        try{
            PrintWriter printWriter = new PrintWriter(goalkeeper);
            printWriter.println(MyGoalkeeper[0].toString());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Midfielder File
        Midfielder[] MyMidfielder = new Midfielder[7];
        MyMidfielder[0] = midfielder1;
        // Creating a new File
        File midfielder = new File("Midfielder.txt");
        try{
            PrintWriter printWriter = new PrintWriter(midfielder);
            printWriter.println(MyMidfielder[0].toString());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Striker File
        Strikers[] MyStriker = new Strikers[7];
        MyStriker[0] = striker1;
        // Creating a new File
        File striker = new File("Striker.txt");
        try{
            PrintWriter printWriter = new PrintWriter(striker);
            printWriter.println(MyStriker[0].toString());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Administrator[] MyAdministrator = new Administrator[2];
        MyAdministrator[0] = admin1;
        // Creating a new File
        File admin = new File("Admin.txt");
        try{
            PrintWriter printWriter = new PrintWriter(admin);
            printWriter.println(MyAdministrator[0].toString());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // Creating a new File
        File file = new File("People.txt");
        try{
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}