class BrowserHistory {
  private int current;
  private List<String> history = new ArrayList<>();

  public BrowserHistory(String homepage) {
    history.add(homepage);
    current = 0;
  }

  public void visit(String url) {
    history.add(++current, url);
    if (current < history.size() - 1)
      history = history.subList(0, Integer.min(current + 1, history.size() - 1));
  }

  public String back(int steps) {
    current = Math.max(current - steps, 0);
    return history.get(current);
  }

  public String forward(int steps) {
    current = Math.min(current + steps, history.size() - 1);
    return history.get(current);
  }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */