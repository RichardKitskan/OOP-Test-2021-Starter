package ie.tudublin;

public class Note 
{
    private static char Note;
    public char pNote;
    private int pDuration;

    public Note(char note, int duration)
    {  
        pNote = note;
        pDuration = duration;
    }

    public static void main(String[] args)
    {
        Note toString = new Note(Note, 0);
        System.out.println(toString);
    }
}
