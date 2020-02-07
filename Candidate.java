package assignment4;
public class Candidate 
{
    private String name;
    private int votes;
    
    public Candidate(String name)
    {
        this.name = name;
        votes = 1;
    }

    public String getName() 
    {
        return name;
    }

    public int getVotes() 
    {
        return votes;
    }

    public void giveVote() 
    {
        votes++;
    }
    
    public String toString()
    {
        String output = "";
        output += "Name: " + getName() + "\n";
        output += "Votes: " + getVotes() + "\n";
        return output;
    }
}
