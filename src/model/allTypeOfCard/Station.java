package model.allTypeOfCard;

import model.player.PlayerImpl;

/**
 *class to model the station
 */
public class Station extends Society {
    private int toll2Station;
    private int toll3Station;
    private int toll4Station;
    /**
     * 
     * @param name
     * @param owner
     * @param toll1Station
     * @param toll2Station
     * @param toll3Station
     * @param toll4Station
     */
    public Station(final String name, final int cost, final PlayerImpl owner) {
        super(name, cost, 10,  owner);
	this.toll2Station = 20;
	this.toll3Station = 30;
	this.toll4Station = 40;
    }
    /**
     * @return the toll2Station
     */
    public int getToll2Station() {
	return toll2Station;
    }
    /**
     * @return the toll3Station
     */
    public int getToll3Station() {
        return toll3Station;
    }
    /**
     * @return the toll4Station
     */
    public int getToll4Station() {
	return toll4Station;
    }
}