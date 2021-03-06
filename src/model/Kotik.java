package model;

public class Kotik {

    private int prettiness;
    private String name;
    private int weigh;
    private String meow;
    private int fullness = 5;
    private static int count = 0;

    public int getPrettiness() {
        return prettiness;
    }
    public String getName() {
        return name;
    }
    public int getWeigh() {
        return weigh;
    }
    public String getMeow() {
        return meow;
    }
    public int getCount(){
        return count;
    }

    public Kotik() {
        count++;
    }
    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weigh = weight;
        this.meow = meow;
        count++;
    }

    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weigh = weight;
        this.meow = meow;
    }

    public void liveAnotherDay(){
        for (int i = 0; i < 24; i++){
            System.out.print(i + "  ");
            switch ((int) (Math.random()*5 + 1)){
                case 1:
                    if (play()) {
                        System.out.println("Cat play");
                    } else {
                        System.out.print("Cat don't play. ");
                        eat();
                    }
                    break;
                case 2:
                    if (sleep()) {
                        System.out.println("Cat sleep");
                    } else {
                        System.out.print("Cat don't sleep. ");
                        eat();
                    }
                    break;
                case 3:
                    if (chaseMouse()) {
                        System.out.println("Cat chase Mouse");
                    } else {
                        System.out.print("Cat don't chase Mouse. ");
                        eat();
                    }
                    break;
                case 4:
                    if (lookInWindow()) {
                        System.out.println("Cat look In Window");
                    } else {
                        System.out.print("Cat don't look In Window. ");
                        eat();
                    }
                    break;
                case 5:
                    System.out.println("Cat was fed");
                    eat(6);
                    break;
            }
        }
    }

    private boolean play(){
        if (fullness > 0) {
            fullness -= 2;
            return true;
        }
        return false;
    }
    private boolean sleep(){
        if (fullness > 0) {
            fullness -= 1;
            return true;
        }
        return false;
    }
    private boolean chaseMouse(){
        if (fullness > 0) {
            fullness -= 3;
            return true;
        }
        return false;
    }
    private boolean lookInWindow(){
        if (fullness > 0) {
            fullness -= 1;
            return true;
        }
        return false;
    }

    private void eat(){
        eat(3,"fish");
    }
    private void eat(int n){
        fullness += n;
    }
    private void eat(int n, String foodName){
        fullness += n;
        System.out.println("Cat eat " + foodName);
    }

    public void compareMeow(Kotik cat1, Kotik cat2){
        if (cat1.meow.equals(cat2.meow)){
            System.out.println("Cats meow the same");
        } else {
            System.out.println("Cats meow don't same");
        }
    }
}
