public class Player {
    private String name;
    private int answer;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAnswer() {
        return answer;
    }
    
    public void setAnswer(int answer) {
        this.answer = answer;
    }
}