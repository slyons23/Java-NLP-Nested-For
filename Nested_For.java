import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Analyser
{

    public static void main(String[] args) throws IOException {

        try(BufferedReader br = new BufferedReader(new FileReader("/Directory/file.txt")))
        {
            for(String line; (line = br.readLine()) != null; )
            {
                // process the line.



                int t=0;
                int p=0;
                String check= "word";
                System.out.println("checking for the word "+"\""+check+"\"");
                String NewWord="";

                String corpus = line.toLowerCase();

                for(int i = 0; i <corpus.length(); i++)

                {
                    if(corpus.charAt(i)==' '|| corpus.charAt(i)=='.'|| corpus.charAt(i)==';'|| corpus.charAt(i)==',' || corpus.charAt(i)=='?'|| corpus.charAt(i)=='('|| corpus.charAt(i)=='"'|| corpus.charAt(i)=='-'|| corpus.charAt(i)=='!'|| corpus.charAt(i)==':'|| corpus.charAt(i)=='['|| corpus.charAt(i)==']'|| corpus.charAt(i)=='\''|| corpus.charAt(i)=='[')
                    {
                        for(int k =p; k <i; k++)
                        {

                            NewWord=NewWord+corpus.charAt(k);

                        }
                        p=i+1;
                    }



                    if (NewWord.equals(check))
                    {
                        t++;
                    }

                    NewWord="";

                }

                System.out.println("the number of times \"word\" occured is "+t);

            }

        }
    }
}