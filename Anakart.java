public class Anakart {
    
    private String model;
    private String isletimSistemi;
    private int yuvaSayisi;

    public Anakart(String model,String isletimSistemi,int yuvaSayisi){

        this.model=model;
        this.isletimSistemi=isletimSistemi;
        this.yuvaSayisi=yuvaSayisi;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model=model;
    }

    public String getIsletimSistemi(){
        return isletimSistemi;
    }
    public void setIsletimSistemi(String isletimSistemi){
        this.isletimSistemi=isletimSistemi;
    }

    public int getYuvaSayisi(){
        return yuvaSayisi;
    }
    public void setYuvaSayisi(int yuvaSayisi){
        this.yuvaSayisi=yuvaSayisi;
    }
    public void isletimSistemiYukle(){
        System.out.println("İşletim Sistemi Yükleniyor..");
    }


    
}
