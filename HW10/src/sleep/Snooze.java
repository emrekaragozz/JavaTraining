package sleep;

public class Snooze extends wake.Alarm {
    private boolean checkTime() {
        return getTime() > 10;
    }
}
