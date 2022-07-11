public class Screen {

    private String ScreenModel;
    private int boyut;
    private Resulation res;

    public Screen(String ScreenModel,int boyut,Resulation res){
        this.ScreenModel=ScreenModel;
        this.boyut=boyut;
        this.res=res;
        
    }
    public void ekraniKapat(){
        System.out.println("ekran kapatılıyor ...");
    }

    public String getScreenModel(){
        return this.ScreenModel;
    }
    public void setScreenModel(String ScreenModel){
        this.ScreenModel=ScreenModel;
    }
    public int getBoyut(){
        return this.boyut;
    }
    public void setBoyut(int boyut){
        this.boyut=boyut;

    }


}
