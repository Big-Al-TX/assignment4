package assignment4;
public class Assignment4 
{
    public static void main(String[] args) 
    {
        VotingBooth v = new VotingBooth();
        v.vote("Me");
        v.vote("Me");
        v.vote("Me");
        v.vote("Me");
        v.vote("You");
        v.vote("You");
        v.vote("You");
        v.vote("You");
        v.vote("The Other Guy");
        v.vote("The Other Guy");
        v.vote("The Other Guy");
        v.vote("The Other Guy");
        v.vote("toast");
        System.out.println(v.toString());
    }
    
}
