package Model;

/*
 * @author Samir
 */
public class Model {
    
    private int hours, minuts, seconds;

    public Model() {
    }

    public Model(int hours, int minuts, int seconds) {
        this.hours = hours;
        this.minuts = minuts;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

  
}
