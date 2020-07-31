
public class  SinoTibetan extends Language{
    SinoTibetan(String name, int num){
        super(name, num, "Asia", "subject-object-verb");
        if(name.toLowerCase().contains("chinese")){
            this.wordOrder = "subject-verb-object";
        }        
    }


    

    
}