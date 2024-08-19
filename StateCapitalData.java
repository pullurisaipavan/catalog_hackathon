import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class StateCapitalData {
    private Map<String, String> statesCapitals;

    public StateCapitalData() {
        statesCapitals = new HashMap<>();
        statesCapitals.put("Andhra Pradesh", "Amaravati");
        statesCapitals.put("Karnataka", "Bengaluru");
        statesCapitals.put("Maharashtra", "Mumbai");
        statesCapitals.put("Tamil Nadu", "Chennai");
        // Add more states and capitals here
    }

    public String getRandomState() {
        Random random = new Random();
        Object[] states = statesCapitals.keySet().toArray();
        return (String) states[random.nextInt(states.length)];
    }

    public boolean checkAnswer(String state, String capital) {
        return statesCapitals.get(state).equalsIgnoreCase(capital);
    }

    public String getCapital(String state) {
        return statesCapitals.get(state);
    }
}
