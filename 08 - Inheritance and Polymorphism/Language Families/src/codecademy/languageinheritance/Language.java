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
    public static void main(final String[] args){
        Language hawaiian = new Language("Hawaiian", 1000000, "Hawaii",
            "verb-subject-object");
        hawaiian.getInfo();
        System.out.println("\n");
        
        Mayan kiche = new Mayan("Ki'che", 2300000);
        kiche.getInfo();



    }
}