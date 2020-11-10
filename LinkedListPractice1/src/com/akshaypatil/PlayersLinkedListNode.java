package com.akshaypatil;

public class PlayersLinkedListNode {
    private Players players;
    private PlayersLinkedListNode next;

    public PlayersLinkedListNode(Players players) {
        this.players = players;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    public PlayersLinkedListNode getNext() {
        return next;
    }

    public void setNext(PlayersLinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "PlayersLinkedListNode{" +
                "players=" + players +
                ", next=" + next +
                '}';
    }
}
