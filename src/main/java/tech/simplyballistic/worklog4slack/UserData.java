package tech.simplyballistic.worklog4slack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SimplyBallistic on 13/10/2017.
 *
 * @author SimplyBallistic
 */
public class UserData {
    public List<Session> workedSessions;
    public Session activeSession;
    public String name;

    public UserData(String name) {
        workedSessions = new ArrayList<>();
        activeSession = null;
        this.name = name;

    }
}
