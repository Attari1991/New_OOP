package exercise;

public class Mobile {
    public String gallery;
    private String camera;
    private String playStore;
    private String microsoft;
    private String translate;
    private char memory;
    private boolean isAvailable=true;

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getPlayStore() {
        return playStore;
    }

    public void setPlayStore(String playStore) {
        this.playStore = playStore;
    }

    public String getMicrosoft() {
        return microsoft;
    }

    public void setMicrosoft(String microsoft) {
        this.microsoft = microsoft;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public char getMemory() {
        return memory;
    }

    public void setMemory(char memory) {
        this.memory = memory;
    }

    public boolean isAvailable() {//in the boolean type of variable we can not use get method with it
        return isAvailable;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable=true;

    }

















}
