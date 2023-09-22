package Model;

/*
 * @author Samir
 */
public class Model {
    
    public int hours;
    public int minuts;
    public int seconds;

    public Model() {
    }

    public Model(int hours, int minuts, int seconds) {
        this.hours = hours;
        this.minuts = minuts;
        this.seconds = seconds;
    }

    /**
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * @return the minuts
     */
    public int getMinuts() {
        return minuts;
    }

    /**
     * @param minuts the minuts to set
     */
    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    /**
     * @return the seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * @param seconds the seconds to set
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
}
