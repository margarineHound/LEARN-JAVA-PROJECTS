import java.util.ArrayList;

public class  Language {
    
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;


    Language(String inName, int inSpeakers, String inRegion, String inOrder){
       this.name = inName;
       this.numSpeakers = inSpeakers;
       this.regionsSpoken = inRegion;
       this.wordOrder = inOrder;

    }
    public void getInfo(){
        System.out.println(name+ " is spoken by " 
                + numSpeakers + " people mainly in " + regionsSpoken+".");
        System.out.println("The language follows the word order: "
        + wordOrder + ".");
    }
    public void setRegion(String regionNew){
        this.regionsSpoken = regionNew;
        System.out.println("The spoken region has been change to: " 
           + this.regionsSpoken);
    }
    public void setNumber(int numNew){
        this.numSpeakers = numNew;
        System.out.println("The number of speakers has been change to: " 
            + this.numSpeakers);
    }
    public void setOrder(String orderNew){
        this.wordOrder = orderNew;
        System.out.println("The word ordering has been change to: " 
            + this.wordOrder);
    }

    public static void main(final String[] args){
        Language hawaiian = new Language("Hawaiian", 1000000, "Hawaii",
            "verb-subject-object");
        hawaiian.getInfo();
        System.out.println("\n");
        
        Mayan kiche = new Mayan("Ki'che", 2300000);
        kiche.getInfo();


        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1000000000);
        SinoTibetan burmese = new SinoTibetan("Burmese", 45000000);

        System.out.println("\n");
        mandarin.getInfo();

        System.out.println("\n");
        burmese.getInfo();

        System.out.println("\n");

        ArrayList<SinoTibetan> sinoLangs = new ArrayList<SinoTibetan>();
        sinoLangs.add(new SinoTibetan("sin3", 1000));
        sinoLangs.add(new SinoTibetan("sin2", 2000));
        sinoLangs.add(new SinoTibetan("sin3", 3000));


        for(SinoTibetan one: sinoLangs ){
            one.getInfo();
            }
        

        System.out.println("\n");

        for(SinoTibetan one: sinoLangs){
            one.setOrder("blah blah");
    }
    }
}