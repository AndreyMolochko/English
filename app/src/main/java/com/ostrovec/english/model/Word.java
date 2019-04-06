package com.ostrovec.english.model;

public class Word {
    private int id;
    private String endlishName;
    private String russianName;
    private int top;
    private String example;
    private boolean isKnown;
    private boolean isFirstChecking;
    private boolean isSecondChecking;
    private boolean isThirdChecking;
    private boolean isFinalChecking;

    public Word(){

    }

    public Word(int id, String endlishName, String russianName, int top, String example,
                boolean isKnown, boolean isFirstChecking, boolean isSecondChecking,
                boolean isThirdChecking, boolean isFinalChecking) {
        this.id = id;
        this.endlishName = endlishName;
        this.russianName = russianName;
        this.top = top;
        this.example = example;
        this.isKnown = isKnown;
        this.isFirstChecking = isFirstChecking;
        this.isSecondChecking = isSecondChecking;
        this.isThirdChecking = isThirdChecking;
        this.isFinalChecking = isFinalChecking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndlishName() {
        return endlishName;
    }

    public void setEndlishName(String endlishName) {
        this.endlishName = endlishName;
    }

    public String getRussianName() {
        return russianName;
    }

    public void setRussianName(String russianName) {
        this.russianName = russianName;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public boolean isKnown() {
        return isKnown;
    }

    public void setKnown(boolean known) {
        isKnown = known;
    }

    public boolean isFirstChecking() {
        return isFirstChecking;
    }

    public void setFirstChecking(boolean firstChecking) {
        isFirstChecking = firstChecking;
    }

    public boolean isSecondChecking() {
        return isSecondChecking;
    }

    public void setSecondChecking(boolean secondChecking) {
        isSecondChecking = secondChecking;
    }

    public boolean isThirdChecking() {
        return isThirdChecking;
    }

    public void setThirdChecking(boolean thirdChecking) {
        isThirdChecking = thirdChecking;
    }

    public boolean isFinalChecking() {
        return isFinalChecking;
    }

    public void setFinalChecking(boolean finalChecking) {
        isFinalChecking = finalChecking;
    }
}
