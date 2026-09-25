public class Player {                          // class declaration

    // --- Fields (state) ---
    private String _name;                      // private: only accessible inside this class
    private int _score;

    // --- Constructor ---
    public Player(String name) {               // called when you write: new Player("Alice")
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank");
        }
        _name = name;
        _score = 0;                            // sensible default
    }

    // --- Methods (behaviour) ---
    public String getName() { return _name; }
    public int getScore() { return _score; }

    public void addPoints(int points) {
        if (points < 0) throw new IllegalArgumentException("Points must be non-negative");
        _score += points;
    }

    public void resetScore() {
        _score = 0;
    }

    @Override
    public String toString() {
        return _name + " (score: " + _score + ")";
    }
}