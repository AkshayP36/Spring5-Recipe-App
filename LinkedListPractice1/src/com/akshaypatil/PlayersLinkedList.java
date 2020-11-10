package com.akshaypatil;

public class PlayersLinkedList {
    private PlayersLinkedListNode head;
    private int size;

    public PlayersLinkedList(Players players) {
        PlayersLinkedListNode node = new PlayersLinkedListNode(players);
    }
}
