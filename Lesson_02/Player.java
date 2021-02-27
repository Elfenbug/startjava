public class Player {
    private String name;
    private int answer;

    public Player(String name) {
        this.name = name;
    }

    public int getAnswer() {
        return answer;
    }
    
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}