package com.example.whatsappdesign;

public class Modelcalls {

    private int imageview1;
    private String textview1;
    private String textview2;
    private int imageview2;
    private int imageview3;
    private String divider;

    Modelcalls(int imageview1,String textview1,String textview2,int imageview2,int imageview3,String divider){
        this.imageview1=imageview1;
        this.imageview2=imageview2;
        this.imageview3=imageview3;
        this.textview1=textview1;
        this.textview2=textview2;
        this.divider=divider;
    }

    public int getImageview1() {
        return imageview1;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public int getImageview2() {
        return imageview2;
    }

    public int getImageview3() {
        return imageview3;
    }

    public String getDivider() {
        return divider;
    }
}
