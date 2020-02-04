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

    /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * @return the votes
     */
    public int getVotes() 
    {
        return votes;
    }

    /**
     * @param increases votes by 1
     */
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
