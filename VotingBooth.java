package assignment4;
public class VotingBooth 
{
    private Candidate[] candidates;
    
    public VotingBooth()
    {
        candidates = new Candidate[0];
    }
    
    public void vote(String name)
    {
        //Check to see if Candidate exists, and give vote if so:
        boolean voteGiven = false;
        for (int i = 0; i < candidates.length; i++)
        {
            if (name.equals(candidates[i].getName()))
            {
                candidates[i].giveVote();
                voteGiven = true;
            }
        }
        //if candidate does not exist:
        if (voteGiven == false)
        {
            Candidate[] newArray = new Candidate[candidates.length + 1];
            for (int i = 0; i < candidates.length; i++)
            {
                newArray[i] = candidates[i];
            }
            newArray[candidates.length] = new Candidate(name);
            candidates = newArray;
        } 
    }
    
    public String calculateWinner()
    {
        String output = "";
        
        return output;
    }
    
    public String toString()
    {
        String output = "";
        for (Candidate candidate : candidates) 
            output += candidate.toString() + "\n";
        
        return output;
    }
    
    
}
