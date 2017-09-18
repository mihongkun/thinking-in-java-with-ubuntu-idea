package com.mihk.ch10;

interface Game {
    boolean move();
    static GameFactory getFactory(){
        return null;
    }
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private Checkers() {
    }
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checker move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory getFactory() {
        return new GameFactory() {
            @Override
            public Game getGame() {
                return new Checkers();
            }
        };
    }
}

class Chess implements Game{
    private Chess(){}
    private int moves = 0;
    private static final int MOVES = 4;
    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory getFactory() {
        return new GameFactory() {
            @Override
            public Game getGame() {
                return new Chess();
            }
        };
    }
}


public class Games {
    public static void playGame(GameFactory factory){
        Game game = factory.getGame();
        while(game.move());
    }

    public static void main(String[] args) {
        playGame(Chess.getFactory());
        playGame(Checkers.getFactory());
    }
}
