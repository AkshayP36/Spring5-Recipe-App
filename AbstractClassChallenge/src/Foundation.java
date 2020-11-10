public abstract class Foundation {
    boolean next;
    boolean previous;

    public Foundation(boolean next, boolean previous) {
        this.next = next;
        this.previous = previous;
    }

    abstract String moveToNext(String value);
    abstract String moveToPrevious(String value);
    abstract void setNextItem(String value);
    abstract void setPreviousItem(String value);
    abstract int compareTo(String value);

}
