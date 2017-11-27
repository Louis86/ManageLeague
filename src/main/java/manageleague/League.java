package manageleague;

import sun.util.calendar.BaseCalendar;

import java.util.Date;
import java.util.List;

public class League {

    //Private fields
    private String name;
    private int nbr_teams;
    private Date start_date;   //League season
    private Date end_date;
    private List<Team> list_of_teams;
    private List<Match> list_of_matches;

    //Constructor method
    public League(String name, Date start, Date end) {
        this.name = name;
        this.start_date = start;
        this.end_date = end;
    }

    //Accessors
    public String getName() {
        return name;
    }

    public int getNbr_teams() {
        return nbr_teams;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public List<Team> getList_of_teams() {
        return list_of_teams;
    }

    public List<Match> getList_of_matches() {
        return list_of_matches;
    }

    //Methods
    public void AddTeams(Team team){
        list_of_teams.add(team);
    }

    public void AddMatch(Match match){
        list_of_matches.add(match);
    }
}