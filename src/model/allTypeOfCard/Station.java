package model.allTypeOfCard;
/**
 * @param <X>
 */
public class Station<X> extends Society {
	
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
	   public Station(final String name, final X owner, final int toll1Station, final int toll2Station,
				final int toll3Station, final int toll4Station) {
		   	super(name, owner, toll1Station);
			this.toll2Station = toll2Station;
			this.toll3Station = toll3Station;
			this.toll4Station = toll4Station;
	   }
	/**
	 * @return the toll2Station
	 */
	public int getToll2Station() {
		return toll2Station;
	}
	/**
	 * @param toll2Station the toll2Station to set
	 */
	public void setToll2Station(final int toll2Station) {
		this.toll2Station = toll2Station;
	}
	/**
	 * @return the toll3Station
	 */
	public int getToll3Station() {
		return toll3Station;
	}
	/**
	 * @param toll3Station the toll3Station to set
	 */
	public void setToll3Station(final int toll3Station) {
		this.toll3Station = toll3Station;
	}
	/**
	 * @return the toll4Station
	 */
	public int getToll4Station() {
		return toll4Station;
	}
	/**
	 * @param toll4Station the toll4Station to set
	 */
	public void setToll4Station(final int toll4Station) {
		this.toll4Station = toll4Station;
	}
}